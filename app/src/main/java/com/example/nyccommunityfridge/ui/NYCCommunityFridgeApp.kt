package com.example.nyccommunityfridge.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nyccommunityfridge.ui.fridgemapscreen.FridgeMapScreen
import com.example.nyccommunityfridge.ui.loginscreen.LoginScreen
import com.example.nyccommunityfridge.util.NavigationStrings

@Composable
fun NYCCommunityFridgeApp(
    modifier: Modifier = Modifier
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationStrings.fridgeMapScreen,
        modifier = modifier
    ){
        composable(NavigationStrings.loginScreen){
            LoginScreen(
                loginWithGoogle = { /*TODO*/ },
                loginWithFacebook = { /*TODO*/ },
                skipLogin = { /*TODO*/ }
            )
        }
        composable(NavigationStrings.fridgeMapScreen){
            FridgeMapScreen()
        }
    }
}