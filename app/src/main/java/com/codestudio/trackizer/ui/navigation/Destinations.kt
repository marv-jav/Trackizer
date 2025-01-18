package com.codestudio.trackizer.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Budgets : Screen("budgets")
    data object Calendar : Screen("calendar")
    data object Cards : Screen("cards")
}