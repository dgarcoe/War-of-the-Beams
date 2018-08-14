package com.dgarcoe.warofthebeams.gamestates

import com.dgarcoe.warofthebeams.WarBeamsGame

/**
 * Created by Daniel on 13/08/2018.
 */
class MainMenuState(game: WarBeamsGame) : WarBeamsGameState(game) {

    override fun startGame():Int {
        game.currentState = game.playingState
        game.startNewScreen(game.playingScreen)
        return 0
    }

}