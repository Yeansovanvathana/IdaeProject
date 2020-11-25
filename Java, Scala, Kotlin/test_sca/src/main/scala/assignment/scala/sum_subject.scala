package assignment.scala
import scala.io.StdIn.readInt

object sum_subject {

  def add():Unit = {
    println("enter the mark of first subject: ")
    val s1:Int = readInt()
    println("enter the mark of second subject: ")
    val s2:Int = readInt()
    println("enter the mark of third subject: ")
    val s3:Int = readInt()
    println("<Sum of three subject is>: " + sum(s1, s2, s3))
  }
  def main(args: Array[String]) {
    add()
  }
  def sum(s1:Int, s2:Int, s3:Int): Integer ={
    return s1 + s2 + s3
  }

}
