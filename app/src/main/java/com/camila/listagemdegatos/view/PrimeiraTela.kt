package com.camila.listagemdegatos.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ListScreen(navController: NavHostController) {
    val nameList = mapOf(
        0 to "Maine Coon",
        1 to "Bombaim",
        2 to "Siames",
        3 to "Persa",
        4 to "Angorá"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
    Text(

        text = "Raças de Gatos",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )

            nameList.forEach { (index, buttonText) ->
                Button(
                    onClick = {
                        // Navegar para a tela de detalhes com o ID do item
                        navController.navigate("detail/$index")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                ) {
                    Text(text = buttonText)
                }
            }
    }
}




