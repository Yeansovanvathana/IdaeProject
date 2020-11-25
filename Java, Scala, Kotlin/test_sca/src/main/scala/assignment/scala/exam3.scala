import javax.swing.JOptionPane

object Guess {
  def main(args: Array[String]): Unit = {
    //prompts the user to enter a number in a range of 1 to 10
    val userGuess = JOptionPane.showInputDialog(null, "Enter guess number in a range of [1-10]")
    /*print randomly generate a number in a message dialog box*/
    JOptionPane.showMessageDialog(null, "The number is " + (1 + (Math.random * 10).toInt))
    var guess = 0

//    if (guess == userGuess)
//      System.out.println("True")
//    else if (!(guess <= userGuess))
//      System.out.println("False")

  }
}

