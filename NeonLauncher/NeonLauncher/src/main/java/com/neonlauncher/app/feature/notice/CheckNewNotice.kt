package com.neonlauncher.app.feature.notice

import com.neonlauncher.app.feature.log.Logging
import com.neonlauncher.app.setting.AllSettings
import com.neonlauncher.app.utils.ZHTools
import com.neonlauncher.app.utils.http.CallUtils
import com.neonlauncher.app.utils.http.CallUtils.CallbackListener
import net.kdt.pojavlaunch.Tools
import okhttp3.Call
import okhttp3.Response
import java.io.IOException
import java.util.Objects

class CheckNewNotice {
    companion object {
        @JvmStatic
        var noticeInfo: NoticeInfo? = null
        private var isChecking = false

        private const val NOTICE_URL =
            "https://raw.githubusercontent.com/DNAMobileApplications/NeonLauncherReborn/main/https://raw.githubusercontent.com/YOUR_USERNAME/NeonLauncher/main/launcher_notice.json"

        private fun checkCooling(): Boolean {
            return ZHTools.getCurrentTimeMillis() - AllSettings.noticeCheck.getValue() > 2 * 60 * 1000
        }

        @JvmStatic
        fun checkNewNotice(listener: CheckNoticeListener) {
            if (isChecking) return
            isChecking = true

            noticeInfo?.let {
                listener.onSuccessful(it)
                isChecking = false
                return
            }

            if (!checkCooling()) {
                isChecking = false
                return
            } else {
                AllSettings.noticeCheck.put(ZHTools.getCurrentTimeMillis()).save()
            }

            CallUtils(object : CallbackListener {
                override fun onFailure(call: Call?) {
                    isChecking = false
                }

                @Throws(IOException::class)
                override fun onResponse(call: Call?, response: Response?) {
                    try {
                        if (response == null || !response.isSuccessful) {
                            Logging.e("CheckNewNotice", "Unexpected code ${response?.code}")
                            return
                        }

                        Objects.requireNonNull(response.body)
                        val responseBody = response.body!!.string()

                        val noticeJson = Tools.GLOBAL_GSON.fromJson(
                            responseBody,
                            NoticeJsonObject::class.java
                        )

                        val title = noticeJson.title.enUS
                        val content = noticeJson.content.enUS

                        noticeInfo = NoticeInfo(
                            title,
                            content,
                            noticeJson.date,
                            noticeJson.numbering
                        )

                        listener.onSuccessful(noticeInfo)
                    } catch (e: Exception) {
                        Logging.e("CheckNewNotice", "Failed to resolve the notice.", e)
                    } finally {
                        isChecking = false
                    }
                }
            }, NOTICE_URL, null).enqueue()
        }
    }
}