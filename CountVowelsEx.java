
public class CountVowelsEx {
	 public static void main(String[] args) {
	        int countVowels=0;
	   String s="watermelonguava";
	   char ch;
	   for(int i=0;i<s.length();i++){
	       ch=s.charAt(i);
	       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	       countVowels++;
	       System.out.println("vowels are " +ch);
	       
	       }
	       
	   }
	   System.out.println("Number of vowels "+countVowels);
	   
	    }
}
