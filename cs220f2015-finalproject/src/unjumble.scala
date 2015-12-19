/*****************************************************
* unjumble.scala
* 
* Jake Ballinger
* CMPSC 220
* Dr. Roos
* Fall 2015
* 03 December 2015
* Honor Code: I pulled my own teeth with this one. All work is mine.
* 
* Compile: scalac unjumble.scala
* Run: scala unjumble (must have jumble.txt in the directory!)
***************************************************/

import scala.io.Source
import scala.collection.mutable.Map

object unjumble {
  // Global Variables 
  var m:scala.collection.mutable.Map[Char, Int] = scala.collection.mutable.Map()
	
  def decode() {
	var line: String = ""
	var lineCh: Array[Char] = Array()
	for(line <- Source.fromFile("jumble.txt").getLines()) {
	  lineCh = line.toCharArray()
		for (i <- 0 until lineCh.length) {
		  if (m.contains(line(i))) {
			// Add things to the map 
			m.put(line(i), m(line(i)) + 1)
		} else
		  // Add the key, value pair
		  m += (line(i) -> 1)
		} // for
	} // for
  // Almost there! Need to figure out a way to truncate the list after the '_'
  line = m.toSeq.sortBy(-_._2).map(_._1).mkString
  line = line.slice(0, line.indexOf('_'))
  println(line)
		
  } // decode
	
  def main(args: Array[String]) {
	decode()
  } // main
} // unjumble
