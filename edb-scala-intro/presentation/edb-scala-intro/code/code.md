!SLIDE

# Code #

## Hello World! ##

    @@@ scala
    object HelloWorld {
        def main(args: Array[String]) {
            println("Hello, world!")
        }
    }

!SLIDE

# Code #

## Variables ##

    @@@ scala
    var name : String = "Johan Hammar"
    var age : int = 30

    val country : String = "Sweden"
    val pi : Double = 3.14

## Variables revisited ##

    @@@ scala
    var name = "Johan Hammar"
    var age = 30

    val country = "Sweden"
    val pi = 3.14

!SLIDE

# Code #

## Bits and pieces ##

    @@@ scala
    import java.util.{Date, Locale}
    import java.text.DateFormat
    import java.text.DateFormat._

    object FrenchDate {
        def main(args: Array[String]) {
            val now = new Date
            val df = getDateInstance(LONG, 
              Locale.FRANCE)
            println(df format now)
        }
    }

!SLIDE

# Code #

## Classes ##

    @@@ scala
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

