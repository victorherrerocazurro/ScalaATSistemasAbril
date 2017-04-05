package com.ejemplo

object AplicacionCurrying extends App {
  
  def saySomething(prefix: String, s: String) = {
    println(prefix + " " + s)
  }
  
  def saySomething(prefix: String) = (s: String) => {
    println(prefix + " " + s)
  }

  val sayHello = saySomething("Hello")

  sayHello("Al")
  
  sayHello("Victor")
  
  saySomething("Adios")("Juan")
  
  saySomething("Adios","Juan")
}




