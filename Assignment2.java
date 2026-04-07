package Home;

// Parent class
class Second {
    // Static method
    static void math() {
        int b = 10;
        int c = 20;
        int a = c + b;
        
        System.out.println("Static method: math()");
        System.out.println("Static method: " + a);
    }

    // Non-static method
    void science() {
        System.out.println("Non-static method: science()");
    }
}

// Child class
public class Assignment2 extends Second {
    public static void main(String[] args) {
        // Call static method directly (inherited)
        math(); // or Second.math();

        // Create object to call non-static method
        Assignment2 obj = new Assignment2();
        obj.science();
    }
}
