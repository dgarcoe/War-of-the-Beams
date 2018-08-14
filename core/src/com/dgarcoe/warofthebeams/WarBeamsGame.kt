package com.dgarcoe.warofthebeams

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.dgarcoe.warofthebeams.gamestates.WarBeamsGameState
import com.dgarcoe.warofthebeams.gamestates.MainMenuState
import com.dgarcoe.warofthebeams.gamestates.PlayingState
import com.dgarcoe.warofthebeams.screens.MainMenuScreen
import com.dgarcoe.warofthebeams.screens.PlayingScreen


class WarBeamsGame : Game() {

    private val TAG = "WarBeamsGame"

    lateinit var currentState : WarBeamsGameState
    lateinit var currentScreen : Screen

    val mainMenuState : MainMenuState = MainMenuState(this)
    lateinit var mainMenuScreen : MainMenuScreen

    val playingState : PlayingState = PlayingState(this)
    lateinit var playingScreen : PlayingScreen

    lateinit var skin:Skin

    override fun create() {
        skin = Skin(Gdx.files.internal("android/assets/skin/metal/skin/metal-ui.json"))
        mainMenuScreen = MainMenuScreen(this,skin)
        playingScreen = PlayingScreen(this)

        currentState = mainMenuState
        currentScreen = mainMenuScreen
        setScreen(mainMenuScreen)
    }

    fun startNewScreen(screen:Screen) {
        currentScreen = screen
        super.setScreen(screen)
    }

    fun startGame() {
        currentState.startGame()
    }

    fun endGame() {
        currentState.endGame()
    }

    fun goOptionsMenu() {
        currentState.goOptionsMenu()
    }

    fun goMainMenu() {
        currentState.goMainMenu()
    }
}
