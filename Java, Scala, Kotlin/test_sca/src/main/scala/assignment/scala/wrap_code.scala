package assignment.scala
object wrap_code
{
  def typ(c: String,message:String)={
    println(c +"{"+message+"}")
  }
  def main(args: Array[String]): Unit = {
    val s ="class"
    val mss=typ(s,_:String);//patially applied function
    val message=scala.io.StdIn.readLine()
    mss(message)
  }
}