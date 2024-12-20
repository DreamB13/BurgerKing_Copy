package com.dreamb.burgerking_copy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurgerKing_CopyTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    BurgerKing_CopyTheme {
        MainScreen()
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()


    Scaffold(
        bottomBar = { BottomNavigaion(navController = navController) }
    ) {
        Box((Modifier.padding(it))) {
            NavigationGraph(navController = navController)
        }
    }
}


@Composable
fun BottomNavigaion(navController: NavHostController) {
    val items = listOf<BottomNavItem>(
        BottomNavItem.HomePage,
        BottomNavItem.CuponPage,
        BottomNavItem.OrderPage,
        BottomNavItem.MyKingPage,
        BottomNavItem.MorePage,
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color(0xFFf4ebdc),
        contentColor = Color(0xff512314)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = stringResource(id = item.title),
                        modifier = Modifier
                            .width(26.dp)
                            .height(26.dp)
                    )
                },
                label = { Text(stringResource(id = item.title), fontSize = 9.sp) },
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = Color.Gray,
                selected = currentRoute == item.screenRoute,
                alwaysShowLabel = false,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(it) {
//                                saveState = true
                            }
                        }
                        launchSingleTop = true
//                        restoreState = true
                    }
                }
            )
        }
    }
}

sealed class BottomNavItem(
    val title: Int,
    val icon: Int,
    val screenRoute: String,
) {
    object HomePage : BottomNavItem(R.string.Home, icon = R.drawable.home, Home)
    object CuponPage : BottomNavItem(R.string.Cupon, icon = R.drawable.cupon, Cupon)
    object OrderPage : BottomNavItem(R.string.Order, icon = R.drawable.order, Order)
    object MyKingPage : BottomNavItem(R.string.Myking, icon = R.drawable.myking, MyKing)
    object MorePage : BottomNavItem(R.string.More, icon = R.drawable.more, More)
}

val eventImageArray = listOf(
    R.drawable.event1,
    R.drawable.event2,
    R.drawable.event3,
    R.drawable.event4,
    R.drawable.event5,
    R.drawable.event6,
    R.drawable.event7,
    R.drawable.event8,
    R.drawable.event9,
    R.drawable.event10,
    R.drawable.event11,
    R.drawable.event12,
)

