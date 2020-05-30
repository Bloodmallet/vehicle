package vehicle.firetruck

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FiretruckSpec extends AnyFlatSpec with Matchers {
  "The Firetruck object" should "contain Firetruck" in {
    val f = new Firetruck()
    f.description() should include("Firetruck")
  }
}
