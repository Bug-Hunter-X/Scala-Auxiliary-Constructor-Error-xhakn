```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def printX(): Unit = {
    println(x)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInstance = new MyClass
    myInstance.printX()
  }
}
```