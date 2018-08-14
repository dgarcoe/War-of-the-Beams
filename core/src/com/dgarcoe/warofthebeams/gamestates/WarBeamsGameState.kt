package com.dgarcoe.warofthebeams.gamestates

import com.dgarcoe.warofthebeams.WarBeamsGame

/**
 * Created by Daniel on 13/08/2018.
 */
abstract class WarBeamsGameState(val game:WarBeamsGame) {
    open fun startGame():Int = throw UnsupportedOperationException("Operation not supported")
    open fun endGame():Int= throw UnsupportedOperationException("Operation not supported")
    open fun goMainMenu():Int = throw UnsupportedOperationException("Operation not supported")
    open fun goOptionsMenu():Int = throw UnsupportedOperationException("Operation not supported")
}