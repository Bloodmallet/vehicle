package vehicle

class Vehicle(
    color: String,
    maxSpeed: Double,
    name: String
) {

  def getColor(): String = {
    color
  }

  def getMaxSpeed(): Double = {
    maxSpeed
  }

  def getName(): String = {
    name
  }

  def description(): String = {
    s"The primary color of a $name is $color. It's maximum speed is $maxSpeed."
  }
}
