/**************************************
* curry.scala
* 
* Jake Ballinger
* 30 November 2015
* CMPSC 220 Final Project
* Dr. Roos
* Fall 2015
* Honor Code: All work is mine
* 
* Description: A simple demonstration
* 	of currying in scala. 
*
* Compile: scalac curry.scala
* Run: scala curry
*************************************/
object curry {
  def main(args: Array[String]) {
    // Show how the sum function works
    println("sum(1, 2, 3) = " + sum(1, 2, 3))
		
    // Curry: reassign the sum function to the addSix 
    // variable, where the first parameter is defined
    val addSix = sum(6, _:Int, _:Int)
		
    // Now print and show the currying
    println("addSix(2, 3) = " + addSix(2, 3))
  } // main

  // The sum method. Takes three Ints as input
  // and returns an Int. 
  def sum(a: Int, b: Int, c: Int): Int = {
    return a + b + c
  } // sum
} // curry
