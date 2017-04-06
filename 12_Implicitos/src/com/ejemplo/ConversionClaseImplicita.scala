package com.ejemplo

object ConversionClaseImplicita extends App {

  implicit class ClaseImplicitaConMetodosExtra(claseExistente: ClaseExistente) {
    def method3(n: Int): Boolean = false
    def method4(): Int = 0
    def method5(): Int = claseExistente.method1() * 2
  }

  val instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos = new ClaseExistente

  instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos.method1()
  instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos.method2(5)
  instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos.method3(2)
  instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos.method4()
  instanciaDeClaseExistenteImplicitamenteDotadaDeMasMetodos.method5()
}

class ClaseExistente {
  def method1(): Int = 1
  def method2(n: Int): Boolean = true
}

