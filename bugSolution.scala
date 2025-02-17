```scala
object Main extends App {
  val x: Int = 0 // or another default value
  // or use Option for potential null values
  val y: Option[Int] = None // or Some(10)
  println(y.getOrElse(0)) // Safe way to handle optionals
}
```