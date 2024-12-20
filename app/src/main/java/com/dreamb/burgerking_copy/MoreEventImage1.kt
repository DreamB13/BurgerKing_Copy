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
        pageNum == R.drawable.event1 -> EventImage1Click()
        pageNum == R.drawable.event2 -> EventImage2Click()
        pageNum == R.drawable.event3 -> EventImage3Click()
        pageNum == R.drawable.event4 -> EventImage4Click()
        pageNum == R.drawable.event5 -> EventImage5Click()
        pageNum == R.drawable.event6 -> EventImage6Click()
        pageNum == R.drawable.event7 -> EventImage7Click()
        pageNum == R.drawable.event8 -> EventImage8Click()
        pageNum == R.drawable.event9 -> EventImage9Click()
        pageNum == R.drawable.event10 -> EventImage10Click()
        pageNum == R.drawable.event11 -> EventImage11Click()
        pageNum == R.drawable.event12 -> EventImage12Click()
    }
}