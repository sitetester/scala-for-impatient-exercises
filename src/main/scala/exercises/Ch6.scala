package exercises

object Ch6 {

  def exercise1_inchesToCentimeters(inches: Double): Double = {
    Conversions.inchesToCentimeters(inches)
  }

  def exercise1_gallonsToLiters(gallons: Double): Double = {
    Conversions.gallonsToLiters(gallons)
  }

  def exercise1_milesToKilometers(miles: Double): Double = {
    Conversions.milesToKilometers(miles)
  }

  def exercise2_inchesToCentimeters(inches: Double): Double = {
    (new InchesToCentimeters).convert(inches)
  }

  def exercise2_gallonsToLiters(inches: Double): Double = {
    (new GallonsToLiters).convert(inches)
  }

  def exercise2_milesToKilometers(inches: Double): Double = {
    (new MilesToKilometers).convert(inches)
  }
}

object Conversions {
  def inchesToCentimeters(inches: Double): Double = inches * 2.54

  def gallonsToLiters(gallons: Double): Double = gallons * 3.7854

  def milesToKilometers(miles: Double): Double = miles * 1.60934
}

abstract class UnitConversion {
  def convert(unit: Double): Double
}

class InchesToCentimeters extends UnitConversion {
  override def convert(unit: Double): Double = unit * 2.54
}

class GallonsToLiters extends UnitConversion {
  override def convert(unit: Double): Double = unit * 3.7854
}

class MilesToKilometers extends UnitConversion {
  override def convert(unit: Double): Double = unit * 1.60934
}
