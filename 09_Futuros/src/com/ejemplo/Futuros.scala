package com.ejemplo

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success
import scala.concurrent.Await
import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration

object Futuros extends App {

  def tareaDeLargaDuracion(): List[Int] = {
    Thread.sleep(2000)    
    /*val lista = List(1, 2, 3)
    println("Dentro de la tarea de larga duracion: " + lista)
    lista*/
    List(1, 2, 3)
    throw new Exception("Ha habido un error en la tarea de larga duracion")
  }

  val f: Future[List[Int]] = Future {
    tareaDeLargaDuracion()
  }

  f onComplete {
    case Success(a) => println("En el callback" + a)
    case Failure(e)    => println(e.getMessage)
  }

  Thread.sleep(6000)
  
  //println(Await.result(f,Duration.Inf))
  
}