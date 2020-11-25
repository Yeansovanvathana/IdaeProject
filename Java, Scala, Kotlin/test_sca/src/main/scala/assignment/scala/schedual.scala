import java.util.Date;
import java.util.Scanner

object Schedule{

  def curry(date: Date) (time: String) (Subject: String) = date +" "+ time +" "+Subject;

  def main(args: Array[String]) {
    val date = new Date();
    val Scan = new Scanner(System.in)
    val Subject = Scan.nextLine()
    val time ="4:30 pm"
    println(curry(date)(time)(Subject))


  }
}