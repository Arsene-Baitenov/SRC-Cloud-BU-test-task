fun main(args: Array<String>) {
    println("Enter roman number")
    val romanNumber = readln()
    try {
        if (RomanNumber.isValid(romanNumber)) {
            println("$romanNumber = ${RomanNumber.convert(romanNumber)}")
        } else {
            println("$romanNumber is not valid")
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}