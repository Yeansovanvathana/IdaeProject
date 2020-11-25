object random {
  def main(args: Array[String]): Unit = {
    var random:Int = 1 + (Math.random() * 5).toInt;
    println("Enter a number between 1-5: ")
    var User_num = scala.io.StdIn.readInt()
    println(User_num == random)
    println("You were " + (random - User_num).abs + " away")
    println("The number is: " + random)
  }
}