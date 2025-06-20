#include <stdio.h>
#include <stdlib.h> // Unused include violation
#include <string.h> // For strlen and strcpy

int main() {
  // Unused variable violations
  int unusedInt = 42;
  char unusedChar = 'x';
  float unusedFloat = 3.14f;

  // Null pointer dereference violation
  char *nullPtr = NULL;
  int len = strlen(nullPtr); // This will cause segmentation fault

  // Format specifier mismatch violations
  float floatNum = 3.14f;
  printf("Float as int: %d\n", floatNum); // Wrong format specifier

  int intNum = 42;
  printf("Int as string: %s\n", intNum); // Wrong format specifier

  // Memory leak violation
  char *dynamicMem = malloc(100);
  // Not freeing the allocated memory - memory leak

  printf("Hello, World!\n");

  // Dead code after return
  return 0;
  printf("This will never execute\n"); // Unreachable code
}

// Unused function violation
void unusedFunction() { printf("This function is never called\n"); }

// Function with buffer overflow potential
void bufferOverflowRisk() {
  char buffer[10];
  strcpy(
      buffer,
      "This string is definitely longer than 10 characters"); // Buffer overflow
}

// Function with uninitialized variable
void uninitializedVariable() {
  int x;                                  // Uninitialized variable
  printf("Uninitialized value: %d\n", x); // Using uninitialized variable
}