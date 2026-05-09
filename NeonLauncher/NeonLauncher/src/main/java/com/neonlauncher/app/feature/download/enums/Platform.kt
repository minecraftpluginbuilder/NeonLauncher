package com.neonlauncher.app.feature.download.enums

import com.neonlauncher.app.feature.download.platform.AbstractPlatformHelper
import com.neonlauncher.app.feature.download.platform.curseforge.CurseForgeHelper
import com.neonlauncher.app.feature.download.platform.modrinth.ModrinthHelper

enum class Platform(val pName: String, val helper: AbstractPlatformHelper) {
    MODRINTH("Modrinth", ModrinthHelper()),
    CURSEFORGE("CurseForge", CurseForgeHelper())
}