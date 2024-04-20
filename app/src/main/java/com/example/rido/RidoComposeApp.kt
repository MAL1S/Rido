package com.example.rido

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun RidoComposeApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ""
    ) {

    }
}