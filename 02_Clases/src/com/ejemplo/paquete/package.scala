package com.ejemplo

package object paquete {
  class Persona(var nombre: String, var edad: Int) extends Equals {
    var genero = None: Option[String]
    
    def canEqual(other: Any) = {
      other.isInstanceOf[com.ejemplo.option.Persona]
    }

    override def equals(other: Any) = {
      other match {
        case that: com.ejemplo.option.Persona => that.canEqual(Persona.this) && nombre == that.nombre && edad == that.edad
        case that: com.ejemplo.Persona        => nombre == that.nombre && edad == that.edad
        case _                                => false
      }
    }

    override def hashCode() = {
      val prime = 41
      prime * (prime + nombre.hashCode) + edad.hashCode
    }
  }
  
  println("Hola mundo")
  
  val MiPersona = new com.ejemplo.option.Persona("", 0) 

}