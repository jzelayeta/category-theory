# **Kleisli**

Kleisli category has, as objects, the types of the underlying programming language. 
Morphisms from type A to type B are functions that go from A to a type derived from B using the particular embellishment.

Kleisli categories are used for embedding effects in pure computations. For example, going on a pure version of writing a Log rather than have a global variable Log that is modified.

As they are categories they must be composable, so another use case is to be able to compose functions that cannot be in the traditional way.

For example, you couldn't compose this function with itself :

```
def safe_root(x: Double): Option[Double] = {  
  if (x >= 0) {  
  Some(Math.sqrt(x))  
 }  else None  
}
```

since the image of that function is not included on it's domain.

As the definition of Kleisli says: ```Morphisms from type A to type B are functions that go from A to a type derived from B``` so we need to be able to compose two morphism ```Double => Option[Double]``` and an identity.

For this example that Kleisli category is: 

```
def compose[A](f: A ⇒ Option[A], g: A ⇒ Option[A]): A ⇒ Option[A] = {  
  a: A ⇒ {  
  val maybeResult = f(a)  
  maybeResult.flatMap(r ⇒ g(r)).orElse(None)  
 }
}

def id[A](a: A): Option[A] = Some(a)

 ```