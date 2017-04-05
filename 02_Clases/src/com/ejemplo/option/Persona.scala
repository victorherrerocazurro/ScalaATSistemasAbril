package com.ejemplo.option

class Persona(var nombre : String, var edad: Int) extends Equals {
  var genero = None : Option[String]

  def canEqual(other: Any) = {
    other.isInstanceOf[com.ejemplo.option.Persona]
  }

  override def equals(other: Any) = {
    other match {
      case that: com.ejemplo.option.Persona => that.canEqual(Persona.this) && nombre == that.nombre && edad == that.edad
      case that: com.ejemplo.Persona => nombre == that.nombre && edad == that.edad
      case _ => false
    }
  }

  override def hashCode() = {
    val prime = 41
    prime * (prime + nombre.hashCode) + edad.hashCode
  }
}

object Persona {
  def main(args: Array[String]): Unit = {
    var p = new Persona("",0)
    
    var genero = p.genero.getOrElse("Femenino") //genero es String
    
    p.genero = Some("Masculino")
    
    genero = p.genero.getOrElse("None")
  }
}