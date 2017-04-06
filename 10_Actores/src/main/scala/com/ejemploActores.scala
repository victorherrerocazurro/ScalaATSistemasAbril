package com

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Actores extends App {
  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  
  helloActor ! "hello"
  helloActor ! "Adios"
  
  system.terminate()
  
}

class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _       => println("huh?")
  }
}