
public class JavaQuirks {
    public static void main(String[] args) {
        // The classic NullPointerException generator
        String s = null;
        System.out.println("String length: " + s.length()); // Boom! 💥
        
        // Java's "helpful" autoboxing
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); // false (they're different objects!)
        
        Integer c = 100;
        Integer d = 100;  
        System.out.println(c == d); // true (cached integers -128 to 127)
        
        // The mysterious floating point
        System.out.println(0.1 + 0.2 == 0.3); // false
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        
        // Exception handling gone wild
        try {
            throw new Exception("I'm fine!");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}