import org.scalatest.{FunSuite, Matchers}

class KleisliTest extends FunSuite with Matchers {

  /*
  safe_root is a partial function, it is not defined for all elements. In fact,
  for those elements that are negative the function is not defined. The idea of this partial
  function is to return an Option to handle that restriction in its domain.

  Doing that, you can't compose safe_root with itself, since the return type
  differs from the input one.
   */
  def safe_root(x: Double): Option[Double] = {
    if (x >= 0) {
      Some(Math.sqrt(x))
    }
    else None
  }

  def safe_reciprocal(x: Double): Option[Double] = {
    if (x != 0) {
      Some(1 / x)
    } else None
  }

  /*
  function that allow to compose two functions of type
  f :: A => Option[A]
   */

  def compose[A](f: A ⇒ Option[A], g: A ⇒ Option[A]): A ⇒ Option[A] = {
    a: A ⇒ {
      val maybeResult = f(a)
      maybeResult.flatMap(r ⇒ g(r)).orElse(None)
    }
  }

  /*
  define identity
   */
  def id[A](a: A): Option[A] = Some(a)

  test("safe_root of positive double should return some value") {
    safe_root(4.0) shouldBe Some(2)
  }

  test("safe_root for a negative number should return None") {
    safe_root(-1.0) shouldBe None
  }

  test("safe_reciprocal for a positive number should return some value") {
    safe_reciprocal(4) shouldBe Some(0.25)
  }

  test("safe_reciprocal for zero should return None") {
    safe_reciprocal(0) shouldBe None
  }

  test("compose safe_root") {
    val composedSafeRoot = compose(safe_root, safe_root)
    composedSafeRoot(16) shouldBe Some(2)
    composedSafeRoot(-1) shouldBe None
  }

  test("compose with identity") {
    val composedSafeRootWithId = compose(safe_root, id[Double])
    composedSafeRootWithId(4) shouldBe Some(2)
  }

  test("compose to have sqrt(1/x)") {
    val safeSqrtAfterSafeReciprocal = compose(safe_reciprocal, safe_root)
    safeSqrtAfterSafeReciprocal(4) shouldBe Some(0.5)
    safeSqrtAfterSafeReciprocal(0) shouldBe None
    safeSqrtAfterSafeReciprocal(-4) shouldBe None
  }
}
