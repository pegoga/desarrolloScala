object StringDemoA {
  def main(args: Array[String]): Unit = {
    var greetings = "Hello World"
    println(greetings)

    var greetingsNew: String = "GreetingsNew"
    println(greetingsNew)

    var lengthOfString = greetings.length
    println("Length of string is: " + lengthOfString)

    var var1 = "Hello "
    var var2 = "World"
    println(var1 + var2)
    println(var1.concat(var2))

    var var3 = var1 + var2 + "!"
    println(var3.length)
    println(var3.charAt(6))

    println(var1 == var2)
    println(var1.equals(var2))
    println(var1.concat(var2) == greetings)
    println(var1.isEmpty)

    var nameOfCar: String = "Mercedes"
    var costOfCar = 500000
    var millageOfCar = 8.5
    printf("name of car is %s, cost of car is %d and millage of car s %f", nameOfCar, costOfCar, millageOfCar)

    var multilineString =
      """hello
        |world
        | How
        | are
        | you
        | ?
        |""".stripMargin
    println(multilineString)

    var multilineString1 =
      """hello
        world
         How
         are
         you
         ?
        """
    println(multilineString1)

    /**
     * s interpolator
     * */
    var name = "Alberto"
    println(s"Hello $name")
    println(s"Hello ${name}")
    println(multilineString1)

    /**
     * f
     * */
    var salary = 20000.2
    println(f"Hello $name%s and salary is $salary%8.2f and designation is PM")

    /**
     * raw
     * */
    println(f"Hello $name%s \nand\nsalary is $salary%8.2f and designation is PM")
    println(s"Hello ${name}\nwelcome")
    println(raw"Hello ${name}\nwelcome")

    //scala string methods
    //java string methods
    //data-flair.training/blogs/scala-string-method
    /*
    * revisado: 20220122
    * */
  }
}
