package com.ejemplo

import org.scalatest.FunSpec
import org.scalatest.Matchers

class EjemploFunSpec extends FunSpec with Matchers{

  describe("A Set") {
    describe("when empty") {
      it("should have size 0") {
        Set.empty.size shouldBe 1
      }

      it("should produce NoSuchElementException when head is invoked") {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}