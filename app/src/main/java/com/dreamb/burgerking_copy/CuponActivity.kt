package com.dreamb.burgerking_copy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dreamb.burgerking_copy.ui.theme.BurgerKing_CopyTheme

class CuponActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BurgerKing_CopyTheme {
                CuponScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CuponScreenPreview(){
    BurgerKing_CopyTheme {
        MainScreen()
    }
}

@Composable
fun CuponScreen(){
    Text(text = "Hello World")
}