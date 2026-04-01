package com.Aline.quiz.screens.start

import android.media.audiofx.AudioEffect
import android.webkit.WebSettings
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.Aline.quiz.R

@Composable
fun StartScreen(navController: NavController,
    modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(98, 219, 251, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(R.drawable.quiz),
        contentDescription = "Quiz")

        Spacer(modifier = Modifier.height(80.dp))
        Text(text = "QUIZATRON 3000" ,
            fontSize = 40.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Card(
            onClick = {navController.navigate("quiz")},
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
                    .border(BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(60.dp), // porq tive q usar dois shape


        ),
                shape = RoundedCornerShape(60.dp), // awui tambem
                colors = CardDefaults.cardColors(
                    containerColor = Color(254, 223, 48, 255)
                ),
            elevation = CardDefaults.cardElevation(4.dp)


        ) {
            Box( modifier = Modifier. fillMaxSize(),
                contentAlignment = Alignment.Center


            ){
                Text(text = "Comecar!",
                    fontSize = 30.sp)
            }
        }
    }
}
