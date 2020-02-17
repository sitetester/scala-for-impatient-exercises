package exercises

import exercises.PlayingCard.PlayingCard

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

  def exercise4(): Point = {
    Point(3, 4)
  }

  def exercise6(): String = {
    PlayingCard.values.toString()
  }

  def exercise7(card: PlayingCard): Boolean = {
    PlayingCard.isRed(card)
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

object Exercise5 extends App {
  args.reverse.foreach(println(_))
}

class Point {
  var x = 0
  var y = 0
}

object Point {
  def apply(x: Int, y: Int): Point = {
    val p = new Point
    p.x = x
    p.y = y
    p
  }
}

object PlayingCard extends Enumeration {
  type PlayingCard = Value

  val Hearts: PlayingCard.Value = Value("♥")
  val Diamonds: PlayingCard.Value = Value("♦")
  val Clubs: PlayingCard.Value = Value("♣")
  val Spades: PlayingCard.Value = Value("♠")

  def isRed(card: PlayingCard): Boolean = {
    card == Hearts || card == Diamonds
  }
}
