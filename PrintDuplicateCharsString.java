import java.util.HashSet;

public class PrintDuplicateCharsString {
	  public static void main(String[] args) {
		  //int count=0;
		   String str="java programming beautiful";
		   HashSet<Character>seen=new HashSet<>();
		   HashSet<Character>duplicates=new HashSet<>();
		   for(char ch:str.toCharArray()){
		       if(!seen.add(ch) && ch!=' '){
		           duplicates.add(ch);
		        //  count++;
		       }
		   }
		   System.out.println("Duplicate Characters "+duplicates);
		  // System.out.println("Total Duplicate Characters "+count);
		       }
}
