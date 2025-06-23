fun main() {
    // Unused variable violations
    val unusedVal = 42
    var unusedVar = "test"
    
    // Null pointer exception violation
    val nullString: String? = null
    val length = nullString!!.length  // Force unwrap will cause KotlinNullPointerException
    
    // Unused lambda parameter
    val list = listOf(1, 2, 3)
    list.forEach { item -> 
        // item is unused in this lambda
        println("Processing")
    }
    
    println("Hello, World!")
    
    // Unreachable code
    return
    println("This will never execute")
}

// Unused function violation
fun unusedFunction() {
    println("This function is never called")
}

// Function with poor practices
fun badPractices() {
    // Using !! operator unnecessarily
    val str: String? = "test"
    val result = str!!.uppercase()  // Could use safe call instead
    
    // Comparing with null using ==
    if (str == null) {  // Could use safe call or elvis operator
        println("null")
    }
    
    // Magic numbers
    val magicNumber = 42
    val anotherMagic = 3.14159
}
