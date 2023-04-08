package com.melao.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.melao.readerapp.screens.ReaderSplashScreen
import com.melao.readerapp.screens.detail.BookDetailsScreen
import com.melao.readerapp.screens.home.Home
import com.melao.readerapp.screens.login.ReaderLoginScreen
import com.melao.readerapp.screens.search.SearchScreen
import com.melao.readerapp.screens.stats.ReaderStatsScreen
import com.melao.readerapp.screens.update.BookUpdateScreen

@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()

    //Host all the screen, define starting point
    NavHost(navController = navController,
        startDestination = ReaderScreens.ReaderSplashScreen.name){

        composable(ReaderScreens.ReaderSplashScreen.name){
            ReaderSplashScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name){
            Home(navController = navController)
        }

        composable(ReaderScreens.DetailsScreen.name){
            BookDetailsScreen(navController  = navController)
        }

        composable(ReaderScreens.ReaderSearchScreen.name){
            SearchScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderStatsScreen.name){
            ReaderStatsScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name){
            BookUpdateScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name){
            ReaderLoginScreen(navController = navController)
        }
    }
}