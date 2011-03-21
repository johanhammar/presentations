
class Dog {
  def bark() = println("Voff!")
}

class NamedDog(name: String) {
  def bark() = println(name + " the dog says Voff!")
}

object DogRunner {
  def main(args: Array[String]) = {
    val dog = new Dog()
    dog.bark()

    val bobTheDog = new NamedDog("Bob")
    bobTheDog.bark()
  }
}

