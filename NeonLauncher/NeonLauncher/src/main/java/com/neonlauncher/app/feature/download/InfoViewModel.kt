package com.neonlauncher.app.feature.download

import androidx.lifecycle.ViewModel
import com.neonlauncher.app.feature.download.item.InfoItem
import com.neonlauncher.app.feature.download.platform.AbstractPlatformHelper

class InfoViewModel : ViewModel() {
    var platformHelper: AbstractPlatformHelper? = null
    var infoItem: InfoItem? = null
}