package com.ejemplo

import akka.pattern.ask
import akka.actor.Actor
import akka.actor.ActorSystem
import java.util.concurrent.TimeUnit
import akka.util.Timeout
import akka.actor.Props

import scala.util.Failure
import scala.util.Success

object ActoresRespuesta extends App {
  
  import scala.concurrent.ExecutionContext.Implicits.global
  
  val system = ActorSystem("HelloResponseSystem")
  
  val helloResponseActor = system.actorOf(Props[HelloResponseActor], name = "helloResponseActor")
  
  implicit val to = Timeout.apply(2, TimeUnit.SECONDS)
  
  val future = ask(helloResponseActor, "hello")
  
  future onComplete {
    case Success(mensaje) => println(mensaje)
    case Failure(e)       => println(e.getMessage)
  }
  
  system.terminate()
}

class HelloResponseActor extends Actor {
  def receive = {
    case "hello" => { println("hello back at you"); sender ! "continue" }
    case _       => println("huh?")
  }
}