package com.neonlauncher.app.ui.fragment.download.addon

import com.neonlauncher.app.R
import com.neonlauncher.app.feature.mod.modloader.FabricLikeUtils

class DownloadFabricFragment : DownloadFabricLikeFragment(FabricLikeUtils.FABRIC_UTILS, R.drawable.ic_fabric) {
    companion object {
        const val TAG: String = "DownloadFabricFragment"
    }
}