package com.dgarcoe.warofthebeams.gamestates

import com.dgarcoe.warofthebeams.WarBeamsGame

/**
 * Created by Daniel on 13/08/2018.
 */
class PlayingState(game: WarBeamsGame) : WarBeamsGameState(game) {

    override fun endGame(): Int {
        return 0
    }

}