
public class SegregationFromString {
	  public static void main(String[] args) {

	        String s = "pree123tish@#";

	        String letters = "";
	        String numbers = "";
	        String specialChars = "";

	        for (int i = 0; i < s.length(); i++) {

	            char ch = s.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters = letters+ch;
	            }
	            else if (Character.isDigit(ch)) {
	                numbers =  numbers+ch;
	            }
	            else {
	                specialChars = specialChars+ch;
	            }
	        }

	        System.out.println("Alphabets: " + letters);
	        System.out.println("Numbers: " + numbers);
	        System.out.println("Special Characters: " + specialChars);
	    }
}
