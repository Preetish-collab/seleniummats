
public class CountNumberofDigitsInString {
	 public static void main(String[] args) {
	        int count=0;
	        String s="page1254 of 45";
	        char ch[]=s.toCharArray();
	        for(char f:ch){
	            if(Character.isDigit(f)){
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
}
