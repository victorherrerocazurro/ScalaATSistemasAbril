package com.ejemplo

import org.scalatest.FunSuite

class EjemploFunSuite extends FunSuite {

  val sut = Set.empty
  
  test("An empty Set should have size 0") {
    assert(sut.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      sut.head
    }
  }
}