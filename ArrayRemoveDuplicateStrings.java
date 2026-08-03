import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicateStrings {
public static void main(String[] args) {
	String str[]= {"red","orange","green","yellow","red","green"};
	Set<String>set=new HashSet<>();
	for(String s:str) {
		set.add(s);
	}
	System.out.print(set);
}
}
