
public class ToggleString {
	 public static void main(String[] args) {
	      String s="ValenTineDay";
	      StringBuffer sb=new StringBuffer(s);
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(Character.isUpperCase(ch)){
	            sb.setCharAt(i,Character.toLowerCase(ch));
	        }
	        else if(Character.isLowerCase(ch)){
	            sb.setCharAt(i,Character.toUpperCase(ch));
	        }
	    }
	    System.out.println(sb);
	     
	    }
}
