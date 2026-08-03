
public class ReplaceVowels {
	 public static void main(String[] args) {
			String s="jackfruit";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		         s=s.replaceAll("[a,e,i,o,u]","x");
		        System.out.println(s);
		        break;
		    }
		}

		    }
}
