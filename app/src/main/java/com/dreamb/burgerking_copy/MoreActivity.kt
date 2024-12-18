package com.dreamb.burgerking_copy

import android.os.Bundle
import android.widget.ImageButton
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class MoreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BurgerKing_CopyTheme {
                MoreScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoreScreenPreview() {
    BurgerKing_CopyTheme {
        MoreScreen()
    }
}

@Composable
fun MoreScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .background(color = Color(0xFFf4ebdc))
            .padding(WindowInsets.systemBars.asPaddingValues())
    ) {
        Box(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(R.drawable.back_arrow),
                contentDescription = "뒤로가기 버튼",
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterStart)
                    .clickable { /*홈으로 돌아가는 기능 구현*/ }
            )
            Text(
                text = "더보기",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff512314),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Divider(color = Color.Red)
        Row {
            Box(
                modifier = Modifier
                    .height(130.dp)
                    .width(20.dp)
                    .background(color = Color(0xfff5efe3))
            ) {
                Image(
                    painter = painterResource(R.drawable.back_arrow_scroll),
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Row(modifier = Modifier
                .horizontalScroll(scrollState)
                .height(130.dp)
                .wrapContentWidth()) {
                for (index in 1..4){
                    Image(painter = painterResource(R.drawable.event1),
                        contentDescription = "배너들")
                }
            }
        }
    }
}