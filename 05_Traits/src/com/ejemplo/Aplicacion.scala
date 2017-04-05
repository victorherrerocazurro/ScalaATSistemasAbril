package com.ejemplo {

  package modelo {
    trait Persona {

      var nombre: String

      def metodo(parametro: Int): String

    }
  }

  import com.ejemplo.modelo.Persona
  
  class Cliente extends Persona {
    def metodo(parametro: Int): String = {
      ""
    }

    var nombre: String = ""
  }

  object Aplicacion extends App {

  }

}