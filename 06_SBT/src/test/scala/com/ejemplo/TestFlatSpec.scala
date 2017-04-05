package com.ejemplo

import org.scalatest.FlatSpec

class TestFlatSpec extends FlatSpec {

  val sut = Set.empty
  
  //Frase que describe el SUT
  
  "An empty Set" should "have size 0" in {
    assert(sut.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      sut.head
    }
  }
}