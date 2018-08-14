package com.dgarcoe.warofthebeams

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.dgarcoe.warofthebeams.gamestates.WarBeamsGameState
import com.dgarcoe.warofthebeams.gamestates.MainMenuState
import com.dgarcoe.warofthebeams.gamestates.PlayingState
import com.dgarcoe.warofthebeams.screens.MainMenuScreen
import com.dgarcoe.warofthebeams.screens.PlayingScreen


class WarBeamsGame : Game() {

    private val TAG = "WarBeamsGame"

    var currentState : WarBeamsGameState
    var currentScreen : Screen


    val mainMenuState : MainMenuState = MainMenuState(this)
    val mainMenuScreen : MainMenuScreen = MainMenuScreen(this)

    val playingState : PlayingState = PlayingState(this)
    val playingScreen : PlayingScreen = PlayingScreen(this)

    init {
        currentState = mainMenuState
        currentScreen = mainMenuScreen

    }

    override fun create() {
        setScreen(mainMenuScreen)
    }

    override fun setScreen (screen:Screen) {
        currentScreen = screen
        super.setScreen(screen)
    }
}
