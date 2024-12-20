package com.dreamb.burgerking_copy

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class DesignEventFun : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurgerKing_CopyTheme {
            }
        }
    }
}

@Composable
fun TopNavBar() {
    var context = LocalContext.current as? Activity
    val text_color = 0xff512314
    Box(
        modifier = Modifier
            .height(60.dp)
            .padding(bottom = 15.dp)
            .fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(R.drawable.back_arrow),
            contentDescription = "뒤로가기 버튼",
            alignment = Alignment.BottomStart,
            modifier = Modifier
                .padding(top = 7.dp)
                .size(30.dp)
                .clickable {
                    val intent = Intent(context, MoreActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    }
                    context?.finish()
                }
        )

        Text(
            text = "이벤트",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(text_color),
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )
    }
}


@Composable
fun ContentText(text: String) {
    val text_color = 0xff512314
    Text(
        text = text,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color(text_color),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    )
}

@Composable
fun ContentTextBold(text: String) {
    val text_color = 0xff512314
    Text(
        text = text,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color(text_color),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    )
}

@Composable
fun EventImage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.more_event_image_1),
            contentDescription = "이벤트 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}

@Composable
fun ContentSpacer() {
    Spacer(modifier = Modifier.height(20.dp))
}

@Composable
fun ContentButton(text: String) {
    Button(
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xffffffff),
            containerColor = Color(0xffee2e24)
        ),
        shape = RoundedCornerShape(12.dp),
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    )
    {
        Text(text = text, fontWeight = FontWeight.Bold)
    }
}