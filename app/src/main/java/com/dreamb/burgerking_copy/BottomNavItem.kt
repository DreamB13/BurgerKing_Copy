package com.dreamb.burgerking_copy

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable





@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.HomePage.screenRoute
    ) {
        composable(BottomNavItem.HomePage.screenRoute) {
            HomeScreen()
        }
        composable(BottomNavItem.CuponPage.screenRoute) {
            CuponScreen()
        }
        composable(BottomNavItem.OrderPage.screenRoute) {
            OrderScreen()
        }
        composable(BottomNavItem.MyKingPage.screenRoute) {
            MyKingScreen()
        }
        composable(BottomNavItem.MorePage.screenRoute) {
            MoreScreen(navController)
        }
    }
}
const val Home = "홈"
const val Cupon = "쿠폰"
const val Order = "주문"
const val MyKing = "MY킹"
const val More = "더보기"