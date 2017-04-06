package com.ejemplo

object Genericos extends App {

  var animal : Animal = new Perro
  
  //var perro : Perro = new Animal
  
  var listaPerro : Lista[Perro] = new Lista[Perro]

  var listaAnimal : Lista[Animal] = new Lista[Animal]
  
  //var listaPuerro = new Lista[Puerro]

  var otraListaAnimal : OtraLista[Animal]  = new OtraLista[Animal]
  
  var otraListaAny = new OtraLista[Any]
  
  listaAnimal = new Lista[Perro]
  
  otraListaAnimal = new OtraLista[Any]
  
}

class Animal {}

class Perro extends Animal {}

class Puerro {}

//El <: indica que T debe ser un subtipo de Animal
class Lista[+T <: Animal] {}

class OtraLista[-T >: Animal] {}
