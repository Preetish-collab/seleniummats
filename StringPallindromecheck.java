
public class StringPallindromecheck {
	  public static void main(String[] args) {
		     String s="nitin";
		     StringBuilder sb=new StringBuilder(s);
		     String rev=sb.reverse().toString();
		     if(s.equals(rev)){
		         System.out.println("String is Pallindrome");
		         
		     }
		     else{
		         System.out.println("String is not Pallindrome");
		     }
		    }
}
