package com.Aline.quiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuizScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(Color(2,200,233))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Pergunta $1 de $2",
                    fontSize = 32.sp,
                    color = Color.Yellow,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(horizontal = 32.dp)
            ) {
                Card(modifier= Modifier
                    .fillMaxWidth()
                    .height(1200.dp),
                   // .offset(y = (-30).dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(255, 193, 7, 255)
                    ),
                    elevation = CardDefaults.cardElevation(4.dp),
                    ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                                Text(
                                    text = "$ Criar Perguntas",
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    textAlign = TextAlign.Center,


                                    )
                        CardScreen(
                            modifier = Modifier
                                .fillMaxWidth(),
                                cor_rosa = Color(228, 13, 85, 255),
                                elevation = CardDefaults.cardElevation(4.dp)
                                ){

                        }
                        CardScreen(
                            modifier = Modifier
                                .fillMaxWidth(),
                            cor_rosa = Color(228, 13, 85, 255),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ){

                        }
                        CardScreen(
                            modifier = Modifier
                                .fillMaxWidth(),
                            cor_rosa = Color(228, 13, 85, 255),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ){

                        }
                        CardScreen(
                            modifier = Modifier
                                .fillMaxWidth(),
                            cor_rosa = Color(228, 13, 85, 255),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ){

                        }


                            }
                }
            }
        }
    }

}