
public class Toggle2 {
public static void main(String[] args) {
	String s="my name is preetish";
	String words[]=s.split("\\s");
	for(String w:words) {
	String firstletter=w.substring(0,1).toUpperCase();
	String secondletter=w.substring(1).toLowerCase();
	String concat=firstletter+secondletter;
	System.out.print(" "+concat);
	}
}
}
