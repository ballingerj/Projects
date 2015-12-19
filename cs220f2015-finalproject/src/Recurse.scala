/**************************************
* recurse.scala
* 
* Katie Beisler
* CMPSC 220
* Fall 2015
* Dr. Roos
* Honor Code: I tried to make recursion program
*
* Description: sorts recursively
* Compile: scalac Recurse.scala
* Run: scala Recurse
*************************************/

object Recurse {

  def sort(a: Array[Int]) { //initial sort

    def swap(i: Int, j: Int) { //nested function
      val t = a(i); a(i) = a(j); a(j) = t
    }

    def sort1(l: Int, r: Int) { //pivot defined
      val pivot = a((l + r) / 2)
      var i = l //no semi-colons yay!!!
      var j = r
      while (i <= j) { //pivot
        while (a(i) < pivot) i += 1
        while (a(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }

    if (a.length > 0) //similar to java syntax, interesting
      sort1(0, a.length - 1)
  }

  def println(ar: Array[Int]) { //what to print
    def print1 = {
      def iter(i: Int): String =
        ar(i) + (if (i < ar.length-1) "," + iter(i+1) else "")
      if (ar.length == 0) "" else iter(0)
    }
    Console.println("[" + print1 + "]")
  }

  def main(args: Array[String]) { //array input
    val ar = Array(6, 2, 8, 5, 1, 4, 6, 7, 3, 4, 1, 10, 13, 4, 23) //can fill this infinitely, size does not need to be defined
    println(ar)
    sort(ar)
    println(ar)
  }

}
