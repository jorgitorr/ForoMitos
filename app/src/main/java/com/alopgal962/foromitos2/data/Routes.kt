package com.alopgal962.foromitos2.data

sealed class Routes(val routes: String){
    object inicioSesion:Routes("Inicio sesion")
    object paginaPrincipal:Routes("Página principal")
    object paginaCulturas:Routes("Pagina culturas")

    object paginaMusicos:Routes("Página músicos")

    object paginaCulturasAntiguas:Routes("Página culturas Antiguas")

    object paginaLeyendas:Routes("Página leyendas")

    object paginaHome:Routes("Página Home")

    object paginaDiscover:Routes("Página Discover")

    object paginaMe:Routes("Página Me")

    object paginaMensajes:Routes("Página Mensajes")

    object paginaOpciones:Routes("Página Opciones")
}