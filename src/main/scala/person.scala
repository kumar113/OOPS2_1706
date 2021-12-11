class Person(var name: String, var age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => {
        if (this.age.equals(that.age))
          println("True\nBoth Person have their name and age same")
        else
          println("False\nBoth Person do not have their name and age same");
        0
      }
      case other => {
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True");
        else
          println("False");
        1
      }
    }
  }
}

object Difference extends App {
  var pOne = new Person("Aman Kumar", 21)
  var pTwo = new Person("Nishant", 24)
  pOne compare pTwo
}