package Home;

// Write a Program on IF Block
public class Assignment4 {

    public static void main(String[] args) {
        
        // First example: Check if number is even
        int number = 3; // You can change this to any number

        // Only IF block logic (no else)
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        }
        System.out.println("Odd number");  // This will print after the IF block executes regardless of condition

        // Second example: Check if age is greater than or equal to 18
        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // Third example: Check if the name is "Alice"
        String name = "Alice";

        if (name.equals("Alice")) {
            System.out.println("Hello, Alice!");
        }

        // Fourth example: Using if-else to check the name
        String name7 = "Alice"; // You can change this to test with other names

        if (name7.equals("Alice")) {
            System.out.println("Hello, Alice!");
        } else {
            System.out.println("You're not Alice.");
        }

        // Fifth example: Check if number is even or odd using IF-ELSE
        int hiii = 8; // You can change this to any number

        // IF Block logic with else
        if (hiii % 2 == 0) {
            System.out.println("The number " + hiii + " is Even.");
        } else {
            System.out.println("The number " + hiii + " is Odd.");
        }

        // Sixth example: Only IF block logic (no else) to check even and odd
        int number3 = 8; // You can change this to any number

        // Only IF block logic (no else)
        if (number3 % 2 == 0) {
            System.out.println("The number " + number3 + " is Even.");
        }

        if (number3 % 2 != 0) {
            System.out.println("The number " + number3 + " is Odd.");
        }

        // Seventh example: Check if number is positive, negative, or zero
        int number1 = -15; // Try changing this value to test

        if (number1 > 0) {
            System.out.println("The number is Positive.");
        } else if (number1 < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // End of program
        System.out.println("Program ended.");
    }
}
