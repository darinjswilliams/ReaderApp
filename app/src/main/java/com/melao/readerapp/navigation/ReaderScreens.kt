package com.melao.readerapp.navigation

enum class ReaderScreens {
    ReaderSplashScreen,
    LoginScreen,
    CreateAccountScreen,
    ReaderHomeScreen,
    ReaderSearchScreen,
    DetailsScreen,
    UpdateScreen,
    ReaderStatsScreen;

    companion object {
        fun fromRoute(route: String?): ReaderScreens
        = when(route?.substringBefore("/")){
            ReaderSplashScreen.name -> ReaderSplashScreen
            LoginScreen.name -> LoginScreen
            CreateAccountScreen.name -> CreateAccountScreen
            ReaderHomeScreen.name -> ReaderHomeScreen
            ReaderSearchScreen.name -> ReaderSearchScreen
            DetailsScreen.name -> DetailsScreen
            UpdateScreen.name -> UpdateScreen
            ReaderStatsScreen.name -> ReaderStatsScreen
            null -> ReaderHomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")

        }
    }

}