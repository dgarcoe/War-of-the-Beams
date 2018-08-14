package com.dgarcoe.warofthebeams.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.dgarcoe.warofthebeams.WarBeamsGame

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.title = "War of the Beams"
        config.width = 1024
        config.height = 768
        LwjglApplication(WarBeamsGame(), config)
    }
}
