package assignment.scala

object compare_the_triplets {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();

    var AScore: Int = 0
    var BScore: Int = 0

    if(isValid(a0))
    {
      if(a0 > b0) AScore = AScore + 1
      else if(a0 < b0 ) BScore = BScore + 1
    }

    if(isValid(a1))
    {
      if(a1 > b1) AScore = AScore + 1
      else if(a1 < b1) BScore = BScore + 1
    }

    if(isValid(a2))
    {
      if(a2 > b2) AScore = AScore + 1
      else if(a2 < b2) BScore = BScore + 1
    }

    println(AScore.toString + " " + BScore.toString)

  }
  def isValid(num: Int): Boolean = {
    val n = num match {
      case x if 1 until 100 contains x => true
      case _ => false
    }
    return n
  }
}


