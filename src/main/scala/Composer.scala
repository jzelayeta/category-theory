class Composer[A, B, C] {

  def compose(f: A ⇒ B, g: B ⇒ C): A ⇒ C = {
    a: A ⇒ {
      val b: B = f(a)
      g(b)
    }
  }
}
