
public class StringPallindromewithoutBuiltin {
	public static void main(String[] args) {
		
	   String s = "nitin";
	    String rev = "";

	    char[] ch = s.toCharArray();
	    for (int i = ch.length - 1; i >= 0; i--) {
	        rev = rev + ch[i];
	    }

	    if (s.equals(rev)) {
	        System.out.println("Its a Palindrome");
	    } else {
	        System.out.println("Not a Palindrome");
	    }
	
}
}
