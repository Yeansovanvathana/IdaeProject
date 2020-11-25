package Assignment
import java.util.Scanner

object exam {
  def main(args: Array[String]): Unit = {
    var secretNumber = 0
    secretNumber = (Math.random * 4 + 1).toInt
    val keyboard = new Scanner(System.in)
    var guess = 0
    do {
      System.out.print("Enter a guess (1-5): ")
      guess = keyboard.nextInt
      if (guess == secretNumber) System.out.println("True")
      else if (guess != secretNumber) System.out.println("False")
    }
    while ( {
      guess != secretNumber
    })
  }
}
