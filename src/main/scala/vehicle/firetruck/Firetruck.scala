package vehicle
package firetruck

class Firetruck
    extends Vehicle(color = "red", maxSpeed = 80.0, name = "Firetruck") {

  def _description(): String = {
    super.description()
  }

  override def description(): String = {
    s"Here comes the $getName! " + super.description() + " Beep beep beep!"
  }

}
