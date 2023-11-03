fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    greet("John Doe")
    showVariableTypes()
    showNullableRules()
    showShortenedVariables()
    guessNumber(3)
    guessNumber(7)
    dayOfTheWeek(5)
    daysSincePreviousCarWash(34)
    println(returnFavoriteColor("green"))
    nonReturningFunctionGreeting()
    println(singleExpressionFunctionGreeting())
    showInterestingArrayFunctions()
}

fun greet(name: String) {
    println("Hello ${name}!")
}

fun showVariableTypes() {
    var age: Int = 27
    val name: String = "Abrie"
    println("VAR Name: ${name} cannot be changed." +
            "\nVAL Age: ${age} can be changed.")
}

fun showNullableRules() {
    val id: String? = null;
    println("VAR ID cannot be null, unless a question mark is added after the type e.g. String?" +
            "\nAll variables are by default non-null.")
}

fun showShortenedVariables() {
    var car = "Jeep"
    println("The car:${car} variable does not have a type assigned to it, because Kotlin can automatically " +
            "detect a variable type.")
}

fun guessNumber(number: Int) {
    if (number == 7) {
        println("You won!")
    } else {
        println("Oops! Try again!")
    }
}

fun dayOfTheWeek(day: Int) {
    var dayToPrint: String?

    when (day) {
        1 -> dayToPrint = "Monday"
        2 -> dayToPrint = "Tuesday"
        3 -> dayToPrint = "Wednesday"
        4 -> dayToPrint = "Thursday"
        5 -> dayToPrint = "Friday"
        6 -> dayToPrint = "Saturday"
        7 -> dayToPrint = "Sunday"
        else -> dayToPrint = "I don't know that day!"
    }

    println(dayToPrint);
}

fun daysSincePreviousCarWash(days: Int) {
    val doesCarNeedWash = if (days > 14) "Yes" else "No"
    val expression = when (doesCarNeedWash) {
        "Yes" -> "!"
        else -> "."
    }
    println("Do I need to wash the car? ${doesCarNeedWash}${expression}")
}

fun returnFavoriteColor(color: String): String {
    // Tip: Function can also return nullable values if you add a question mark
    // ... behind the return type e.g. String?
    return "My favorite color is ${color}!"
}

fun nonReturningFunctionGreeting(): Unit {
    greet("fellow programmer")
}

// Can also be written as below:
// fun singleExpressionFunctionGreeting() = "Greetings from an alien planet!"
fun singleExpressionFunctionGreeting(): String = "Greetings from an alien planet!"

fun showInterestingArrayFunctions() {
    val colors = arrayOf("Blue", "Green", "Yellow")
    println("Size of array: ${colors.size}")
    println("My favorite color is ${colors[1]}") // Longer version is colors.get(1)

    for (color in colors) {
        println("${color} is a beautiful color!")
    }

    colors.forEach {
        println("I would like to have a ${it}-colored macaw.")
    }

    colors.forEach { color ->
        println("Is ${color} part of the rainbow colors?")
    }
}
