import java.util.concurrent.TimeUnit

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.time.Span
import org.scalatest.{FunSuite, Matchers}

import scala.concurrent.duration.FiniteDuration

class MemoizeTest extends FunSuite with Matchers with TimeLimitedTests {

  val timeLimit = Span.Zero.plus(FiniteDuration(11, TimeUnit.SECONDS))

  def slowToStringFunction[A](a: A): String = {
    Thread.sleep(10000)
    a.toString
  }

  test("memoize slow function single value call should end before timeout limit") {
    val slowToStringFunctionMemoizer = new Memoize().memoize(slowToStringFunction)
    slowToStringFunctionMemoizer(5) shouldBe "5"
    slowToStringFunctionMemoizer(5) shouldBe "5"
    slowToStringFunctionMemoizer(5) shouldBe "5"
  }


}
