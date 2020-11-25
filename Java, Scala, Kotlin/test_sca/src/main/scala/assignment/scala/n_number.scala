package assignment.scala

import java.util.Scanner
object term_even_num {
  def main(args: Array[String]): Unit = {
    var scan = new Scanner(System.in)
    println("Enter the term number:")
    var  n = scan.nextInt()
    var sum = 0
    System.out.println("Enter term of even number :")
    for (i <-1 to n){
      println(i*2)
      sum +=2*i;
    }
    println(s"Sum of n: ${sum}")
  }
}
