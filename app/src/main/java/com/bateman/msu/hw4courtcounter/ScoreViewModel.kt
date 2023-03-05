package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val CURRENT_SCOREA_KEY = "current_scorea"
const val CURRENT_SCOREB_KEY = "current_scoreb"

class ScoreViewModel (private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var scoreTeamA: Int
        get() = savedStateHandle.get(CURRENT_SCOREA_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_SCOREA_KEY, value)

    var scoreTeamB: Int
        get() = savedStateHandle.get(CURRENT_SCOREB_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_SCOREB_KEY, value)

}