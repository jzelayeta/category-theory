import scala.collection.mutable

class Memoize[A, B] {

  val cache: collection.mutable.HashMap[A, B] = mutable.HashMap[A, B]()

  def process(f: A ⇒ B)(a: A): B = {
    if (cache.contains(a))
      cache(a)
    else {
      val b: B = f.apply(a)
      cache += (a → b)
      b
    }
  }

  def memoize(f: A ⇒ B): A ⇒ B = process(f)

}
