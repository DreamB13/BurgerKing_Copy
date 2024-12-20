package com.dreamb.burgerking_copy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.MediaController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.Navigator
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme
import kotlinx.coroutines.selects.select

class MoreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurgerKing_CopyTheme {
                MoreScreen(navController = rememberNavController())
            }
        }
    }
}

@Composable
fun MoreScreen(navController: NavHostController) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()
    val text_color = 0xff512314
    val background_color = 0xFFf4ebdc
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .background(color = Color(background_color))
            .padding(WindowInsets.systemBars.asPaddingValues())
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(R.drawable.back_arrow),
                contentDescription = "뒤로가기 버튼",
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterStart)
                    .clickable {
                        navController.navigate(BottomNavItem.HomePage.screenRoute) {
                            popUpTo(BottomNavItem.HomePage.screenRoute) { inclusive = true }
                        }
                    }
            )
            Text(
                text = "더보기",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(text_color),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Divider(color = Color(background_color))
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "진행중인 이벤트",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(text_color),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(15.dp)
            )
        }

        Row {
            Box(
                modifier = Modifier
                    .height(130.dp)
                    .width(30.dp)
                    .background(color = Color(0xfff5efe3))
            ) {
                Image(
                    painter = painterResource(R.drawable.back_arrow_scroll),
                    contentDescription = "",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(25.dp)
                )
            }
            Row(
                modifier = Modifier
                    .horizontalScroll(scrollState)
                    .height(130.dp)
                    .wrapContentWidth(),

                ) {
                for (image in eventImageArray) {
                    Image(
                        painter = painterResource(image),
                        contentDescription = "배너들",
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 35.dp)
                            .size(height = 130.dp, width = 300.dp)
                            .clickable {
                                val intent = Intent(context, MoreEventImage1::class.java).apply {
                                    putExtra("numOfEvent", image)
                                }
                                context.startActivity(intent)
                            }
                    )
                }
            }
        }
        Column(
            modifier = Modifier.padding(top = 60.dp)
        ) {
            val menuarray = listOf("이벤트", "매장소개", "메뉴소개", "약관 및 정책", "고객센터")
            for (count in menuarray) {
                ToggleLine()
                MoreMenu(count)
            }
            ToggleLine()
            MoreMenu("환경설정")
        }
    }
}

@Composable
fun ToggleLine() {
    Divider(
        color = Color(0xffefe8d7),
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp),
    )
}

@Composable
fun MoreMenu(text: String) {
    val background_color = 0xFFf4ebdc
    val text_color = 0xff512314
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(background_color))
            .height(60.dp)
    ) {
        Text(
            text = text,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(text_color),
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 30.dp)
        )
    }
}