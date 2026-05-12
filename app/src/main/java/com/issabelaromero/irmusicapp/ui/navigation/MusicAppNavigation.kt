package com.issabelaromero.irmusicapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.issabelaromero.irmusicapp.ui.screens.detail.DetailScreen
import com.issabelaromero.irmusicapp.ui.screens.home.HomeScreen

@Composable
fun MusicAppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home) {
        composable<Screen.Home> {
            HomeScreen(navController = navController)
        }
        composable<Screen.Detail> { backStackEntry ->
            val detail: Screen.Detail = backStackEntry.toRoute()
            DetailScreen(navController = navController, albumId = detail.albumId)
        }
    }
}
