package com.Aline.quiz.screens.start.result

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.Aline.quiz.R

@Composable
fun ResultScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(98, 219, 251, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
        // verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Image(
            modifier = Modifier.height(90.dp),
            painter = painterResource(R.drawable.quiz),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.height(100.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center


        ) {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(70.dp),
                border = BorderStroke(1.dp, Color.Black),
                colors = CardDefaults.cardColors(containerColor = Color(67, 196, 164, 255)),
                elevation = CardDefaults.cardElevation(4.dp)

            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Bom Trabalho!",
                        fontSize = (32.sp)
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Você acertou 1 de 3 perguntas ",
            fontSize = (24.sp),
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            onClick = {navController.navigate("Start")},
            modifier = Modifier
                .width(280.dp)
                .height(60.dp)
                .border(
                    BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(60.dp), // porq tive q usar dois shape


                ),
            shape = RoundedCornerShape(60.dp), // awui tambem
            colors = CardDefaults.cardColors(
                containerColor = Color(254, 223, 48, 255)
            ),
            elevation = CardDefaults.cardElevation(4.dp)


        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center


            ) {
                Text(
                    text = "Jogar Novamente",
                    fontSize = 30.sp
                )
            }
        }
    }
}

