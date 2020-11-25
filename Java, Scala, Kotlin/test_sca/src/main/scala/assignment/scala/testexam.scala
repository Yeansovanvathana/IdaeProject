import java.util.ArrayList

object ThrowUsedCarExceptions {
  def main(args: Array[String]): Unit = {
    val usedCars: ArrayList[UsedCar] = new ArrayList[UsedCar]()
    try usedCars.add(new UsedCar("1477", "Ford", 2004, -4, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("7845", "Ford", 199, -25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("560", "Ford", 2004, 25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("1258", "Ford", 1945, 25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("1234", "Ford", 2004, 25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("1456", "Ford", 2004, 25, -1))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("7890", "Other", 2010, 10, 45821))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("1111", "Apple", 2004, 25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    try usedCars.add(new UsedCar("9999", "Ford", 2004, 25, 360))
    catch {
      case ex: UsedCarException => System.err.println(ex.getMessage)
    }
    usedCars.stream().forEach((uc) => println(uc.toString))
  }
}
class UsedCar(private val vin: String,
              private val make: String,
              private val year: Int,
              private val milage: Double,
              private val price: Int) {
  if (vin.length != 4) throw new UsedCarException(vin)
  if (!(make.==("Ford") || make.==("Honda") || make.==("Toyota") ||
    make.==("Chrysler") ||
    make.==("Other"))) throw new UsedCarException(vin)
  if (year < 1990 || year > 2014) throw new UsedCarException(vin)
  if (milage < 0 || price < 0) throw new UsedCarException(vin)
  override def toString(): String =
    "UsedCar{" + "vin=" + vin + ", make=" + make + ", year=" +
      year +
      ", milage=" +
      milage +
      ", price=" +
      price +
      '}'
}
class UsedCarException(vin: String) extends Exception(vin)