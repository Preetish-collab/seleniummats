import java.util.HashSet;

public class DuplicatesFromMultiArray2 {
	   public static void main(String[] args) {
		      String s1="apple";
		      String s2="grapes";
		      String s3="orange";
		      HashSet<Character>s=new HashSet<>();
		      for(char c:s1.toCharArray()){
		          s.add(c);
		      }
		      for(char c:s2.toCharArray()){
		          s.contains(c);//ape
		            
		          }
		           for(char c:s3.toCharArray()){
		          if(s.contains(c)){
		              System.out.print(c);//ae
		          }
		      }
		    }
}
