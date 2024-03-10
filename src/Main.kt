fun main() {

    //mutableListOf

    val number = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("first list: $number")

    //adding a new item to the list
    number.add(11)
    println("List After Adding Elements: $number")

    // Changing an item in the list
    number[2] = 15
    println("List Items After Changing: $number")

    //Remove an item from the list
    number.removeAt(5)
    println("List After Remove Item: $number")

}