package com.ejemplo.visibilidad.vida

import com.ejemplo.visibilidad.vida.trabajo.Trabajador

object Programa extends App{
   var t = new Trabajador

  var t2 = new Trabajador

  t hablar t2

  t2 hablar t
  
  t2.nombre
}