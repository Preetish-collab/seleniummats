package exceptionEx;

public class StringOutofBoundException {
    public static void main(String[] args) {
        String str = "Hello, World!";
        try {
            // Attempting to access a character at an invalid index
            char ch = str.charAt(20);
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
