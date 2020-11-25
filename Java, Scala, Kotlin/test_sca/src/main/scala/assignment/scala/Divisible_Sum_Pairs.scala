package assignment.scala
import java.util.Scanner

object Divisible_Sum_Pairs {

  def main(args: Array[String]): Unit = {
      val Scan = new Scanner(System.in)
      val n = Scan.nextInt()
      val k = Scan.nextInt()
      var a = new Array[Int](n)

    for (i <- 0 to n-1){
        a(i) = Scan.nextInt()
      }
      var i,count =0
      while (i<n){
        for(j <- i+1 until n){
          if ((a(i)+a(j))%k==0) count +=1
        }
        i +=1
      }
      println(count)
    }

}
