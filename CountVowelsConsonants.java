
public class CountVowelsConsonants {
	 public static void main(String[] args) {
	      String s="Occurence In a Day";
	      int vCount=0;
	      int cCount=0;
	       s=s.toLowerCase();
	      char ch;
	      for(int i=0;i<s.length();i++){
	          ch=s.charAt(i);
	          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	              vCount++;
	          }
	          else if(ch>='a'&& ch<='z'){
	              cCount++;
	      }
	     
	      }
	      System.out.println("Total Vowels::::" +vCount);
	      System.out.println("Total Consonants####" +cCount);
	    }
}
