package assignment.scala

object left_rotation {
  def main(args: Array[String]) {
    val s = new java.util.Scanner (System.in);
    var n = s.nextInt();
    var k = s.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = s.nextInt();
    }
    a = a.drop( k ) ++ a.take( k )
    print( a.mkString( " " ) )
  }
}