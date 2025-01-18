package com.codestudio.trackizer.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codestudio.trackizer.ui.screens.home.BudgetsScreen
import com.codestudio.trackizer.ui.screens.home.CalendarScreen
import com.codestudio.trackizer.ui.screens.home.CreditCardsScreen
import com.codestudio.trackizer.ui.screens.home.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    )
    {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Budgets.route) {
            BudgetsScreen()
        }
        composable(route = Screen.Calendar.route) {
            CalendarScreen()
        }
        composable(route = Screen.Cards.route) {
            CreditCardsScreen()
        }
    }
}
