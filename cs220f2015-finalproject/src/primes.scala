/**************************************
* primes.scala
* 
* Katie Beisler
* CMPSC 220
* Fall 2015
* Dr. Roos
* Honor Code: I tried to make a prime's calculator. Ta Da
*
* Description: Prints out prime numbers until 100
* Compile: scalac primes.scala
* Run: scala primes
*************************************/

//Prints out primes up to 100...very inefficiently.... 
object primes {
  def main(args: Array[String]) //defining array
	{
 	 def isPrime(number: Int) = (2 until number) forall (number % _ != 0) //prime calculation
 	 for (p <- 1 to 100 if isPrime(p)) 
		println(p)
	}//isPrime method in main
}//primes
