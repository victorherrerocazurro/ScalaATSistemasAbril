package com.ejemplo.visibilidad

package object vida extends App {

  object trabajo {
    class Trabajador {
      private[trabajo] var proyectoAsignado = "Telefonica"
      private[vida] var nombre = "Victor"
      private var salario = 12000

      def hablar(compi: Trabajador) {
        println(compi.proyectoAsignado)
        println(salario)
        println(compi.salario) //ERROR: A los compañeros no les cuento mi salario, que luego tienen envidia ;-)
      }
    }
  }

}