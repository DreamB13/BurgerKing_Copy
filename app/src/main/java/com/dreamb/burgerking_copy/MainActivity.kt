package com.dreamb.burgerking_copy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurgerKing_CopyTheme {
                MoreScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    BurgerKing_CopyTheme {
        MoreScreen()
    }
}

@Composable
fun MainScreen(){
    Text(text = "Hello World")
}