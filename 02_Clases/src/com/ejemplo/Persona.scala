package com.ejemplo

class Persona(var nombre: String = "", var edad: Int = 0) {
  
  println("A construir")
  
  //Constructor con un parametro
  /*def this(edad: Int) {
    this("", edad) //Constructor principal
  }

  def this(nombre: String) {
    this(nombre, 0)
  }

  def this() {
    this("") //Constructor auxiliar
  }*/
  /*def this(edad: Int = 0, nombre: String = "") {
    this("") //Constructor auxiliar
  }*/
  
  
}

object Programa extends App {
  new Persona //invoacndo ctr aux  this()
  new Persona(edad = 0)
  new Persona("")
  new Persona("", 0) //Invocaicon de ctr principal
  
  var person = new Persona
  println(person.edad = 18)
  println(person)
}