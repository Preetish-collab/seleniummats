
public class SwappingString {
	 public static void main(String[] args) {

	        String a = "Hello";
	        String b = "World";

	        System.out.println("Before Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swapping without using third variable
	        a = a + b;                     // Step 1
	        b = a.substring(0, a.length() - b.length());  // Step 2
	        a = a.substring(b.length());   // Step 3

	        System.out.println("\nAfter Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
}
