
public class OccurenceOfCharacter {
public static void main(String[] args) {
	String s="accenture";
	char ch;
	int count=0;
	for(int i=0;i<s.length();i++) {
		ch=s.charAt(i);
		if(ch=='e') {
			count++;
		}
	}
	System.out.print(""+count);
}
}
