

// Vararg

fun printItems(vararg items: String) {
    for (item in items) {
        println(item)
    }
}

fun main(args: Array<String>) {

//    Dasar

    println("Halo Aku Rakha")

    val nama = "Rakha"

    println("Halo nama saya ${nama}")

    intro()
    umur()
    sekolah()
    hobi()

//    Tipe Data

    val myNumber: Int = 42
    val pi: Double = 3.14159
    val temperature: Float = 25.5f
    val firstLetter: Char = 'R'
    val isTrue: Boolean = true
    val isFalse: Boolean = false

//    Selesai

//    Array

    val buah = arrayOf("Apple", "Banana", "Orange")

    println("First fruit: ${buah[0]}")
    println("Second fruit: ${buah[1]}")

    for (buah in buah) {
        println("Fruit: $buah")
    }

//    Selesai 2

//    Null safe

    val nullableValue: String? = null

    if (nullableValue != null) {
        println("Length: ${nullableValue.length}")
    } else {
        println("Value is null")
    }

    val nonNullValue = nullableValue ?: "Default"
    println("Value: $nonNullValue")

//    Selesai 3

//    Operator

    val a = 10
    val b = 5
    println("Sum: ${a + b}")
    println("Difference: ${a - b}")
    println("Product: ${a * b}")
    println("Division: ${a / b}")
    println("Modulus: ${a % b}")

    val firstName = "Rakha"
    val lastName = "Rizki"
    val fullName = firstName + " " + lastName
    println("Full Name: $fullName")

    var a = 10
    var b = 2

    a += b
    println(a)

    a -= b
    println(a)

    b -= a
    println(b)

//    Operator Pembanding

    val a = 10
    val b = 5

    // Operator Pembanding: ==
    println("a == b: ${a == b}") // apakah a sama dengan b?

    // Operator Pembanding: !=
    println("a != b: ${a != b}") // apakah a tidak sama dengan b?

    // Operator Pembanding: >
    println("a > b: ${a > b}")   // apakah a lebih besar dari b?

    // Operator Pembanding: <
    println("a < b: ${a < b}")   // apakah a lebih kecil dari b?

    // Operator Pembanding: >=
    println("a >= b: ${a >= b}") // apakah a lebih besar dari atau sama dengan b?

    // Operator Pembanding: <=
    println("a <= b: ${a <= b}") // apakah a lebih kecil dari atau sama dengan b?

//    Selesai 4

//    if Exspression

    if (!isOpen) {
        println("Barbershop is open")
    } else {
        println("Barbershop is closed")
    }

    var angka = 2
//    increment
    println(++angka)

//    Decrement
    println(--angka)

    val age = 18

    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

//    When

    val day = "Wednesday"

    when (day) {
        "Monday" -> println("It's the start of the week.")
        "Wednesday" -> println("It's the middle of the week.")
        "Friday" -> println("It's the end of the week.")
        else -> println("It's another day.")
    }

//    For

    val numbers = listOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println("Number: $number")
    }

//    While

    var counts = 0

    while (counts < 5) {
        println("Count: $counts")
        counts++
    }

//    Do - While

    var count = 0

    do {
        println("Count: $count")
        count++
    } while (count < 5)

//    Break & Continue

    val number = listOf(1, 2, 3, 4, 5)

    for (number in number) {
        if (number == 3) {
            break // Keluar dari perulangan saat angka adalah 3
        }
        println("Number: $number")
    }

//    Selesai 5

//        Collections

//    List

    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)

    println("First number: ${numbers[0]}")
    println("Size of the list: ${numbers.size}")

    for (number in numbers) {
        println("Number: $number")
    }

//    Set

    val uniqueNumbers: Set<Int> = setOf(1, 2, 3, 2, 4)

    println("Size of the set: ${uniqueNumbers.size}")

    for (number in uniqueNumbers) {
        println("Unique Number: $number")
    }

//    Map

    val phoneBook: Map<String, String> = mapOf(
        "Alice" to "123-456",
        "Bob" to "987-654",
        "Charlie" to "555-789"
    )

    println("Bob's phone number: ${phoneBook["Bob"]}")

    for ((name, number) in phoneBook) {
        println("$name's phone number: $number")
    }

//    Range

    val numbersRange = 1..5
    for (number in numbersRange) {
        println("Number: $number")
    }

//    Array

    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array size: ${array.size}")
    println("Second element: ${array[1]}")

//    Selesai 6

//    Lambda

//    Penerapan fungsi Lambda pada Map

    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println("Squared numbers: $squaredNumbers")

//    Vararg

    printItems("apel","pisang","stroberi")
    println("----")
    printItems("Besi","Baja","Emas")

}

// Dasar

fun intro (){
    println("Halo Nama saya Rakha")
}

fun umur (){
    println("umur saya 16 tahun")
}

fun sekolah (){
    println("Saya sekolah di IDNBS Bogor")
}

fun hobi (){
    println("Hobi saya Bermain Basket")
}