package assignment.scala
import java.util.Scanner

object coin_change {

  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    println(way (scan.nextInt, for (_ <- 1 to scan.nextInt) yield scan.nextInt))
  }
  def way($: Int, coins: Seq[Int]): Int = $ match {
    case $ if $ < 0 => 0
    case $ if $ == 0 => 1
    case $ => coins.foldLeft(0) { (acc, c) =>
      acc + way($-c, coins.filter(_ >= c))
    }
  }
}