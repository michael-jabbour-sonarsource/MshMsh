package java;

public class main {
    public static void main(String[] args) {
        // Unused variable violation
        int unusedVariable = 42;
        String anotherUnused = "test";

        // Null pointer dereference violation
        String nullString = null;
        int length = nullString.length(); // This will cause NullPointerException

        // Dead code after return
        System.out.println("Hello, World!");
        return;
        System.out.println("This code is unreachable"); // Dead code violation
    }

    // Unused method violation
    private static void unusedMethod() {
        System.out.println("This method is never called");
    }
}
