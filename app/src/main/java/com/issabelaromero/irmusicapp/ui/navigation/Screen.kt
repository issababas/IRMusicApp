package com.issabelaromero.irmusicapp.ui.navigation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object Home : Screen()

    @Serializable
    data class Detail(val albumId: String) : Screen()
}
