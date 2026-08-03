import java.util.Random;

public class RandomAlphanumeric {
	  public static void main(String[] args) {
	        String s = "pree12";
	        int length = 6;

	        Random random = new Random();
	        StringBuilder sb = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            sb.append(s.charAt(random.nextInt(s.length())));
	        }

	        System.out.println(sb.toString());
	    }

	
}
