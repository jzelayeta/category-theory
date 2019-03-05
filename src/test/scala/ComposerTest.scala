import org.scalatest.{FunSuite, Matchers}

class ComposerTest extends FunSuite with Matchers {

  test("Compose two functions") {
    val threeTimes: Int ⇒ Int = _ * 3
    val mod2: Int ⇒ Int = _ % 2

    val mod2AfterThreeTimes = new Composer().compose(threeTimes, mod2)
    mod2AfterThreeTimes(2) shouldBe 0
    mod2AfterThreeTimes(3) shouldBe 1
  }

}
