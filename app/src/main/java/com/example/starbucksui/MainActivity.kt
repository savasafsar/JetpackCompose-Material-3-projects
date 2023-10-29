package com.example.starbucksui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.starbucksui.furniture.navigation.FurnitureNavigation
import com.example.starbucksui.starbucks.data.navigation.StartBucksNavigation
import com.example.starbucksui.ui.theme.ChatAppTheme
import com.example.starbucksui.ui.theme.StarbucksUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           ChatAppTheme {
                // A surface container using the 'background' color from the theme

               FurnitureNavigation()



            }
        }
    }
}



