package com.camila.listagemdegatos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.camila.listagemdegatos.ui.theme.ListagemDeGatosTheme
import com.camila.listagemdegatos.view.ListScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListagemDeGatosTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listScreen") {
                    composable(
                        route = "listScreen"
                    ) {
                        ListScreen(navController)
                    }


                    composable(
                        "detail/{itemId}",
                        arguments = listOf(navArgument("itemId") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val itemId = backStackEntry.arguments?.getInt("itemId")
                        DetailScreen(itemId = itemId ?: -1)
                    }
                }
            }
        }
    }
}




