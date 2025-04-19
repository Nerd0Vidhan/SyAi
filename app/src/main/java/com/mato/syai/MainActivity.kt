package com.mato.syai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.mato.syai.presentation.splash.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SplashScreen {
                navController.navigate("splash") {
//                    popUpTo("") { inclusive = true }
                }
            }
        }
    }
}