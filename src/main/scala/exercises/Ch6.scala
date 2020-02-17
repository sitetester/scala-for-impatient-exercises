package exercises

object Ch6 {

  def exercise1_inchesToCentimeters(inches: Double): Double = {
    Conversions.inchesToCentimeters(inches)
  }

  def exercise1_gallonsToLiters(gallons: Double): Double = {
    Conversions.inchesToCentimeters(gallons)
  }

  def exercise1_milesToKilometers(miles: Double): Double = {
    Conversions.milesToKilometers(miles)
  }

}

object Conversions {

  def inchesToCentimeters(inches: Double): Double = inches * 2.54

  def gallonsToLiters(gallons: Double): Double = gallons * 3.7854

  def milesToKilometers(miles: Double): Double = miles * 1.60934

}
