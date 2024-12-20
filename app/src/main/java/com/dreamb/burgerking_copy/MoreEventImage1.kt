package com.dreamb.burgerking_copy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class MoreEventImage1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val parameter:Int = intent.getIntExtra("numOfEvent",0)
        setContent {
            BurgerKing_CopyTheme {
                SelectEventImagePage(parameter)
            }
        }
    }
}

@Composable
fun SelectEventImagePage(pageNum:Int){
    when {
        pageNum == R.drawable.event3 -> EventImage1Click()
    }
}