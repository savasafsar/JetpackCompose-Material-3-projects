package com.example.starbucksui.furniture.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.starbucksui.furniture.screens.CheckOutScreen
import com.example.starbucksui.starbucks.data.screens.HomeScreen
import com.example.starbucksui.starbucks.data.screens.ProductDetailScreen
import com.example.starbucksui.starbucks.data.screens.StartScreen

@Composable
fun FurnitureNavigation() {

    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Home) {
        composable(Home){
            com.example.starbucksui.furniture.screens.HomeScreen(navHostController)
        }
        composable(ProductDetail){
            com.example.starbucksui.furniture.screens.ProductDetailScreen(navHostController)
        }
        composable(Checkout){
            CheckOutScreen(navHostController)
        }

    }

}

const val Home = "home_screen"
const val ProductDetail = "product_detail_screen"
const val Checkout = "check_out_screen"