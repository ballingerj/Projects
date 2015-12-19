/*********************************************************
* PointTest.scala
* 
* Jake Ballinger
* CMPSC 220
* Fall 2015
* Dr. Roos
* 29 November 2015
* Honor Code: This is my work.
*
* Description: Creates a simple 3D point object in Scala. 
* Compile: scalac PointTest.scala
* Run: scala PointTest
*********************************************************/
object PointTest {
  def main(args: Array[String]) {
    // Create Point A and move it (10, 10, 10)
    // Instantiating a new instance of a class is like Java
    val A = new Point(0, 1, 2)
    println("Point A: " + A)
    // The dot operator in Scala works the same as eveywhere
    A.move(10, 10, 10)
    println("Point A after a shift of 10, 10, 10: " + A)
	
    // Do the same thing for Point B
    val B = new Point(-1, 7, 2)
    println("Point B: " + B)
    B.move(12, 5, -9)
    println("Point B after a shift of -12, 5, -9: " + B)
	
    // Create a dummy point at the origin
    val C = new Point(0, 0, 0) 
    // Now subtract and assign to D
    val D = C.sub(A, B)
    println("Now, give the parametric equation of the line between these two points.")
    println("Step 1")
    println(A + " - " + B + " = " + D)
    println("Step 2")
    println("(x, y, z) = " + A + " + t" + D)
  } // main
} // PointTest

// When declaring a class, use "class" 
// Note the different syntax in parameters: name: type, ...
class Point(xi: Int, yi: Int, zi: Int) {
  var x: Int = xi
  var y: Int = yi
  var z: Int = zi

  // Define a method by the keyword "def"
  def move (dx: Int, dy: Int, dz: Int) {
    x += dx
    y += dy
    z += dz
  } // move
	
  // Sub: takes two points, subtracts them, and assigns them to a new point
  // Note the return type is after the parameter list
  def sub (A: Point, B: Point): Point = {
    var a: Point = A
    var b: Point = B
    var cx: Int = A.x - B.x
    var cy: Int = A.y - B.y
    var cz: Int = A.z - B.z
    return new Point(cx, cy, cz)
	
  } // sub
  // Override the toString() method
  override def toString(): String = "(" + x + ", " + y + ", " + z + ")"
} // Point
