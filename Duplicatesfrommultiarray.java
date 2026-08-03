import java.util.HashSet;

public class Duplicatesfrommultiarray {
public static void main(String[] args) {
	String s1="apple";
	String s2="grapes";
	HashSet<Character>s=new HashSet<>();
	System.out.println(":::Common or Duplicate chars:::");
	for(char c:s1.toCharArray()) {
		s.add(c);
	}
	for(char c:s2.toCharArray()) {
		if(s.contains(c)) {
			System.out.print("" +c);
		}
	}
}
}
