//package assignment.scala
//
//import java.util.{ArrayList, List}
//import java.util.Scanner
//import java.util
//import java.util.Collections
//
//object find_the_running_median {
//    def median(data: util.List[Integer]): Integer = if ((data.size & 1) == 1) data.get(data.size / 2)
//    else {
//      val midSize = data.size / 2
//      (data.get(midSize - 1) + data.get(midSize)) / 2.0
//    }
//
//    def main(args: Array[String]): Unit = {
//      val in = new Scanner(System.in)
//      val n = in.nextInt
//      val data = new util.ArrayList[Integer]
//      for (i <- 0 until n) {
//        val a_i = in.nextInt
//        var pos = Collections.binarySearch(data, a_i)
//        if (pos < 0) pos = Math.abs(pos) - 1
//        data.add(pos, a_i)
//        System.out.format("%1$.1f\n", median(data))
//      }
//    }
//}
//
//
//
