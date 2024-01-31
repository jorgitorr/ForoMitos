package com.alopgal962.foromitos2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alopgal962.foromitos2.R
import com.alopgal962.foromitos2.componente.Componente
import com.alopgal962.foromitos2.componentegrande.ComponenteGrande
import com.alopgal962.foromitos2.data.Routes
import com.alopgal962.foromitos2.footerbar.FooterBar
import com.alopgal962.foromitos2.headbar.HeadBar
import com.alopgal962.foromitos2.ui.theme.amarilloClaro


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaPrincipal(navController:NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Mitos",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaHome.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ){
                LazyColumn (modifier = Modifier.wrapContentSize()){
                    item{ ComponenteGrande(modifier = Modifier
                        .size(320.dp, 254.dp)
                        .padding(10.dp),
                        imagen = painterResource(id = R.drawable.jesus_grande),
                        texto = "CULTURAS",
                        pulsar = {navController.navigate(Routes.paginaCulturas.routes)})
                    }
                    item { ComponenteGrande(modifier = Modifier
                        .size(320.dp, 254.dp)
                        .padding(10.dp),
                        imagen = painterResource(id = R.drawable.jimmyhendrix), texto = "MÚSICOS",
                        pulsar = {navController.navigate(Routes.paginaMusicos.routes)}) }
                    item { ComponenteGrande(modifier = Modifier
                        .size(320.dp, 254.dp)
                        .padding(10.dp),
                        imagen = painterResource(id = R.drawable.llorona) , texto = "LEYENDAS",
                        pulsar = {navController.navigate(Routes.paginaLeyendas.routes)})}
                }
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun paginaDiscover(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Busca",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {


            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun paginaMe(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Perfil",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun paginaMensajes(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Mensajes",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {


            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun paginaOpciones(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Opciones",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {


            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaCulturas(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Culturas",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {
                LazyColumn(modifier = Modifier.wrapContentSize()) {
                    item {
                        ComponenteGrande(modifier = Modifier
                            .size(320.dp, 258.dp)
                            .padding(5.dp),
                            imagen = painterResource(id = R.drawable.zeus_grande),
                            texto = "ANTIGUAS",
                            pulsar = { navController.navigate(Routes.paginaCulturasAntiguas.routes) })
                    }
                    item {
                        ComponenteGrande(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            imagen = painterResource(
                                id = R.drawable.jesus_grande
                            ),
                            texto = "MODERNAS"
                        )
                    }
                }
            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaCulturasAntiguas(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Culturas Antiguas",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {
                val imageModifier = Modifier.size(320.dp, 130.dp)
                LazyColumn(modifier = Modifier.wrapContentSize()) {
                    item {
                        Componente(
                            modifier = Modifier
                                .size(335.dp, 131.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.zeus),
                            textoTextContent = "GRIEGA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(335.dp, 131.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.egipto),
                            textoTextContent = "EGIPCIA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(335.dp, 131.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.japon),
                            textoTextContent = "JAPONESA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(335.dp, 131.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.nordica),
                            textoTextContent = "NORDICA"
                        )
                    }
                }
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaMusicos(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Músicos",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {
                LazyColumn(modifier = Modifier.wrapContentSize()) {
                    item {
                        Componente(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.jimmyhendrix),
                            textoTextContent = "GRIEGA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.egipto),
                            textoTextContent = "EGIPCIA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.japon),
                            textoTextContent = "JAPONESA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.japon),
                            textoTextContent = "JAPONESA"
                        )
                    }
                    item {
                        Componente(
                            modifier = Modifier
                                .size(320.dp, 258.dp)
                                .padding(5.dp),
                            zeusImage = painterResource(id = R.drawable.nordica),
                            textoTextContent = "JAPONESA"
                        )
                    }
                }
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaInicioSesion(navController: NavController) {
    Scaffold(
        topBar = {
            HeadBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),texto = "Inicio de Sesion",
                pulsarMensajes = {navController.navigate(Routes.paginaMensajes.routes)},
                pulsarOpciones = {navController.navigate(Routes.paginaOpciones.routes)})
        },
        bottomBar = {
            FooterBar(modifier = Modifier
                .fillMaxWidth()
                .height(51.dp),
                onHome = {navController.navigate(Routes.paginaPrincipal.routes)},
                onDiscover = {navController.navigate(Routes.paginaDiscover.routes)},
                onMe = {navController.navigate(Routes.paginaMe.routes)})
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = amarilloClaro),
                contentAlignment = Alignment.Center
            ) {


            }
        }
    }
}










