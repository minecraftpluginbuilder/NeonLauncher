package com.neonlauncher.app.ui.subassembly.account

import net.kdt.pojavlaunch.value.MinecraftAccount

interface SelectAccountListener {
    fun onSelect(account: MinecraftAccount)
}
