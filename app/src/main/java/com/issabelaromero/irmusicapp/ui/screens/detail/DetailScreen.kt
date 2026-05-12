package com.issabelaromero.irmusicapp.ui.screens.detail

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, albumId: String) {
    Text(text = "Detail Screen for $albumId")
}
