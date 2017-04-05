package com.ejercicio.paso.uno

object Aplicacion extends App {
  
  def procesarMensaje(codigo: Int, descripcion: String, formatearMensaje : (Int, String) => String ) = {
        println(formatearMensaje(codigo, descripcion))
  }

  val json = (codigo: Int, descricpion: String) => {codigo + "-" + descricpion}
  
  val xml = (codigo: Int, descricpion: String) => {descricpion + "-" + codigo}
  
  procesarMensaje(1234, "Hola mundo", json)
  
  procesarMensaje(1234, "Hola mundo", json )
  
  
}



