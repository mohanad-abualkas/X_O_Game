package com.example.tictactoe.howtousefeatures

// Data Class Definition
data class User(val name: String, val age: Int)

fun main() {
    // Creating an object from a data class
    val user1 = User("Ahmad", 25)

    // Using the toString() function (automatically generated)
    println(user1)  // Output: User(name=Ahmad, age=25)

    // Using the copy() function to create a modified copy of the object
    val user2 = user1.copy(age = 26)
    println(user2)  // Output: User(name=Ahmad, age=26)

    // Comparing objects using equals() (automatically generated)
    println(user1 == user2)  // Output: false

    // Using the componentN() functions to access properties
    val (name, age) = user1
    println("Name: $name, Age: $age")  // Output: Name: Ahmad, Age: 25
}