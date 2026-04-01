package com.Aline.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Aline.quiz.screens.start.StartScreen
import com.Aline.quiz.screens.start.quiz.QuizScreen
import com.Aline.quiz.screens.start.result.ResultScreen
import com.Aline.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "Start"
                    ) {
                        composable(route = "Start") { StartScreen(navController = navController) }
                        // composable(route = "quiz") {QuizScreen(navController = navController)}
                        //  composable(route = "start") {ResultScreen(navController = navController)}
                    }
                   // StartScreen(
                     //   modifier = Modifier.padding(innerPadding)
                   // )


                }
            }
        }
    }
}

