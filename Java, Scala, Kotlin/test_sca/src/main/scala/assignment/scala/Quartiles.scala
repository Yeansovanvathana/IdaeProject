package assignment.scala

import java.util._

object Quartiles {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    println("Enter the number: ")
    val numberOfInput: Int = sc.nextInt()

    val array: Array[Int] = Array.ofDim[Int](numberOfInput)
    for (i <- 0 until numberOfInput) {
      array(i) = sc.nextInt()
    }
    Arrays.sort(array)
    val second: Int = numberOfInput / 4
    var third: Int = numberOfInput / 2
    if (third % 2 == 0) {
      println((array(second - 1) + array(second)) / 2)
    } else {
      println(array(second))
    }
    if (numberOfInput % 2 == 0) {
      println((array(third - 1) + array(third)) / 2)
    } else {
      println(array(third))
    }
    if (numberOfInput % 2 == 1) {
      third = third + 1
    }
    val fourth: Int = numberOfInput - third
    val fourthHalf: Int = fourth / 2 + third
    if (fourth % 2 == 0) {
      println((array(fourthHalf - 1) + array(fourthHalf)) / 2)
    } else {
      println(array(fourthHalf))
    }
  }
}
