package com.ejemplo

object conversionImplicita extends App {

  implicit def int2MyInt(i: Int) : MyInteger = new MyInteger(i)

  
  1.myNewMethod

}

class MyInteger(i: Int) {
  def myNewMethod = println("hello from myNewMethod-" + i)
}