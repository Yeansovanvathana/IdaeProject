package assignment.scala
import java.util
import java.util.{HashMap, Scanner}

object Ice_cream {
  private[assignment]
  def solve(cost: Array[Int], money: Int): Unit = {
    if (cost == null || cost.length < 1) {
      System.out.println(-1 + " " + -1)
      return
    }

    val hashMap = new util.HashMap[Integer, Integer]
    for (i <- 0 until cost.length) {
      if (cost(i) < money) {
        if (hashMap.containsKey(money - cost(i))) {
          val index = hashMap.get(money - cost(i))
          System.out.println((index + 1) + " " + (i + 1))
          return
        }
        if (!hashMap.containsKey(cost(i))) hashMap.put(cost(i), i)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val in = new Scanner(System.in)
    val t = in.nextInt
    for (a0 <- 0 until t) {
      val money = in.nextInt
      val n = in.nextInt
      val cost = new Array[Int](n)
      for (arr_i <- 0 until n) {
        cost(arr_i) = in.nextInt
      }
      solve(cost, money)
    }
    in.close()
  }
}

