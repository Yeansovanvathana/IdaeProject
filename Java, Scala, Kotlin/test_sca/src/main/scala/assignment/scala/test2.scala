class PremiumSugarSmashPlayer() extends SugarSmashPlayer {
  private val levels = 50
  private val scores = new Array[Int](levels)
  override def getLevels: Int = levels
}
class SugarSmashPlayer() {
  protected var ID = 0
  protected var screenName: String = null
  private val levels = 10
  private val scores = new Array[Int](levels)
  def setIdNumber(num: Int): Unit = {
    ID = num
  }
  def setName(player: String): Unit = {
    screenName = player
  }
  def setScore(score: Int, level: Int): Unit = {
    var goodScores = false
    if (level == 0) scores(level) = score
    else {
      if (scores(level - 1) > 100) goodScores = true
      if (goodScores && level < scores.length) scores(level) = score
      else System.out.println("\nInvalid score")
    }
  }
  def getId: Int = ID
  def getName: String = screenName
  def getScore(level: Int): Int = if (level >= scores.length) {
    System.out.println("Invalid game level")
    -1
  }
  else scores(level)
  def getMinScore = 100
  def getLevels: Int = levels
}
object DemoSugarSmash {
  def main(args: Array[String]): Unit = {
    val ssPlayer = new SugarSmashPlayer
    ssPlayer.setIdNumber(1111)
    ssPlayer.setName("Vathana")
    System.out.println("\nAt start")
    display(ssPlayer)
    ssPlayer.setScore(200, 0)
    System.out.println("\nAfter setting first score")
    display(ssPlayer)
    System.out.println("Trying to set fifth score too soon")
    ssPlayer.setScore(30, 4)
    System.out.println("\nAfter setting second score")
    ssPlayer.setScore(30, 1)
    display(ssPlayer)
    System.out.println("\nTrying to set third score when second is too low")
    ssPlayer.setScore(100, 2)
    display(ssPlayer)
    System.out.println("\nAfter setting second, third, fourth, and fifth scores")
    ssPlayer.setScore(100, 1)
    ssPlayer.setScore(300, 2)
    ssPlayer.setScore(400, 3)
    ssPlayer.setScore(10, 4)
    display(ssPlayer)
    System.out.println("\nTrying to set eleventh score")
    ssPlayer.setScore(100, 10)
    val pssPlayer = new PremiumSugarSmashPlayer
    pssPlayer.setIdNumber(2222)
    pssPlayer.setName("Chantha")
    System.out.println("\nAt start")
    display(pssPlayer)
    pssPlayer.setScore(200, 0)
    System.out.println("\nAfter setting first score")
    display(pssPlayer)
    System.out.println("Trying to set fifth score too soon")
    pssPlayer.setScore(30, 4)
    System.out.println("\nAfter setting second score")
    pssPlayer.setScore(30, 1)
    display(pssPlayer)
    System.out.println("\nTrying to set third score when second is too low")
    pssPlayer.setScore(100, 2)
    display(pssPlayer)
    System.out.println("\nAfter setting second through tenth scores")
    for (x <- 1 until 10) {
      pssPlayer.setScore(130, x)
    }
    display(pssPlayer)
    System.out.println("\nTrying to set eleventh score")
    pssPlayer.setScore(100, 10)
    display(pssPlayer)
    System.out.println("\nTrying to set 51st score")
    pssPlayer.setScore(100, 50)
    display(pssPlayer)
  }
  def display(p: SugarSmashPlayer): Unit = {
    System.out.println("   ID #" + p.getId + "  Name: " + p.getName)
    for (x <- 0 until p.getLevels) {
      System.out.print("   " + p.getScore(x))
    }
    System.out.println()
  }
}