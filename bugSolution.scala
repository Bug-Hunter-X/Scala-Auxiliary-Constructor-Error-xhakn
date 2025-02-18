```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor correctly calls the primary constructor
  def printX(): Unit = {
    println(x)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInstance = new MyClass
    myInstance.printX() //Should print 0
    val myInstance2 = new MyClass(5)
    myInstance2.printX() //Should print 5
  }
}
```