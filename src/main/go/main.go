package main

import "fmt"

func main() {
    // Unused variable violations
    unusedVar := 42
    anotherUnused := "test"
    _ = unusedVar // This suppresses the error but is still a violation
    
    // Potential nil pointer dereference
    var nilPointer *int
    value := *nilPointer // This will panic
    
    // Unused imports violation (fmt is used, but let's add another)
    // import "os" would be unused if we added it
    
    fmt.Println("Hello, World!")
    
    // Unreachable code
    return
    fmt.Println("This will never execute")
}

// Unused function violation
func unusedFunction() {
    fmt.Println("This function is never called")
}

// Function that doesn't handle errors properly
func badErrorHandling() {
    // Ignoring error return values
    fmt.Printf("%d", "string") // Wrong format specifier
}
