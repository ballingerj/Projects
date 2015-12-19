/**************************************
* helloworld.scala
* 
* Jake Ballinger
* CMPSC 220
* Fall 2015
* Dr. Roos
* Honor Code: Although it's difficult to write a unique 
* 	"hello world" program, I have tried my best.
*
* Description: Says "Hello World!"
* Compile: scalac helloworld.scala
* Run: scala helloworld
**************************************/

// An object is equivalent to a class in Java
object helloworld {
  // methods are declared as "def", just like in Python
  def main(args: Array[String]) {
    // Removes the annoying System.out from Java
    println("Hello, world!") // note the lack of semicolons
  } // main
} // HelloWorld
