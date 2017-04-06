package com.ejemplo

object Aplicacion extends App {

  /*val lista = List("hello", 1, true, "world")

  println(lista)

  val lista2 = lista collect {
    case s: String => s
    case i: Int    => i.toString
    case _         => ""
  }

  println(lista)

  println(lista2)

  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  numbers.dropWhile(_ % 2 != 0)

  numbers.dropWhile((n: Int) => n % 2 != 0)

  println(numbers.filter(_ % 2 == 0))

  val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
  
  extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)
  
  println(extensions.filter(_._2 < 200))*/
  
  println((1 to 1000000000).view.filter(_ % 2 == 0).take(10).toList)
}