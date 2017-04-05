package com.ejemplo

object AplicacionFuncionAnonima extends App {
  //TimerAnonymous.oncePerSecond(() => println("time flies like an arrow..."))
  TimerAnonymous.oncePerSecond(Other.timeFlies)
  
  Other.texto = "otra cosa"
  
  TimerAnonymous.oncePerSecond(Other.timeFlies)
}

object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) { //Funcion de orden mayor
    callback()
  }
}

object Other {

  var texto = "algo"

  def timeFlies() {
    println("time flies like an arrow..." + texto)
  }
}