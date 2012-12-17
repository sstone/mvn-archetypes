package ${package}

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

@RunWith(classOf[JUnitRunner])
class SimpleSpec extends WordSpec with ShouldMatchers {
  "A calculator" must {
    "add  numbers " in {
      val x = 2
      val y = 2
      val z = x + y
      assert(z === 4)
    }
    "multiply  numbers " in {
      val x = 2
      val y = 2
      val z = x * y
      assert(z === 4)
    }
  }
}
