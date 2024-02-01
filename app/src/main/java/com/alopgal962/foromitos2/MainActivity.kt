package com.alopgal962.foromitos2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alopgal962.foromitos2.data.Routes
import com.alopgal962.foromitos2.ui.screens.PaginaCulturas
import com.alopgal962.foromitos2.ui.screens.PaginaCulturasAntiguas
import com.alopgal962.foromitos2.ui.screens.PaginaInicioSesion
import com.alopgal962.foromitos2.ui.screens.PaginaLeyendas
import com.alopgal962.foromitos2.ui.screens.PaginaMusicos
import com.alopgal962.foromitos2.ui.screens.PaginaPrincipal
import com.alopgal962.foromitos2.ui.screens.paginaDiscover
import com.alopgal962.foromitos2.ui.screens.paginaMe
import com.alopgal962.foromitos2.ui.screens.paginaMensajes
import com.alopgal962.foromitos2.ui.screens.paginaOpciones
import com.alopgal962.foromitos2.ui.theme.ForoMitos2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForoMitos2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Routes.paginaPrincipal.routes){
                        composable(Routes.paginaPrincipal.routes){ PaginaPrincipal(navController = navController) }
                        composable(Routes.paginaCulturas.routes){ PaginaCulturas(navController = navController) }
                        composable(Routes.inicioSesion.routes){ PaginaInicioSesion(navController = navController) }
                        composable(Routes.paginaMusicos.routes){ PaginaMusicos(navController) }
                        composable(Routes.paginaCulturasAntiguas.routes){ PaginaCulturasAntiguas(navController = navController)}
                        composable(Routes.paginaMe.routes){ paginaMe(navController = navController)}
                        composable(Routes.paginaMensajes.routes){ paginaMensajes(navController = navController)}
                        composable(Routes.paginaOpciones.routes){ paginaOpciones(navController = navController)}
                        composable(Routes.paginaDiscover.routes){ paginaDiscover(navController = navController)}
                        composable(Routes.paginaLeyendas.routes){ PaginaLeyendas(navController = navController)}
                    }
                }
            }
        }
    }
}

