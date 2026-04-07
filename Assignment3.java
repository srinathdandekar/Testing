package Home;

public class Assignment3 {
    
    // Declare and initialize variables for all primitive data types
    public static void main(String[] args) {
        
        // int (integer)
        int number;       // Declaration
        number = 10;      // Initialization
        System.out.println("int: " + number);
        
        // short (16-bit signed integer)
        short s;
        s = 32000;
        System.out.println("short: " + s);
        
        // byte (8-bit signed integer)
        byte mam;
        mam = 30;
        System.out.println("byte: " + mam);
     
 
        // char (character)
        char sir;
        sir = 'd';
        System.out.println("char: " + sir);
        
        // float (single precision floating point)
        float f;
        f = 3.14f;
        System.out.println("float: " + f);
        
        // double (double precision floating point)
        double d;
        d = 3.1415926535;
        System.out.println("double: " + d);
        
        // char (another character example)
        char c;
        c = 'A';
        System.out.println("char: " + c);
        
        // boolean (true/false)
        boolean bool;
        bool = true;
        System.out.println("boolean: " + bool);
    }
}
//referrance cooncept
//You're very close! The issue in your code is that you're trying to **initialize `number`** outside the `main` method, but you have written `number = 10;` **outside of a method or constructor**. 
//https://docs.google.com/spreadsheets/d/1q5yi7ZA44Hw7uSQNBg43kq7VpGlOCoSeERt9CwZk6XQ/edit?gid=952979591#gid=952979591