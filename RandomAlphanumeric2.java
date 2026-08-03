import java.util.Random;

public class RandomAlphanumeric2 {
	  public static void main(String[] args) {
	       String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"1234567890";
	       Random r=new Random();
	       StringBuilder sb=new StringBuilder(s.length());
	       for(int i=0;i<6;i++){
	           sb.append(s.charAt(r.nextInt(s.length())));
	       }
	       System.out.println(sb.toString());
	    }
}
