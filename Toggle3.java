
public class Toggle3 {
public static void main(String[] args) {
	String s="let choose ai";
	String words[]=s.split("\\s");
	for(String w:words) {
		String firstletter=w.substring(0,1).toLowerCase();
		String secondletter=w.substring(1).toUpperCase();
		String concat=firstletter+secondletter;
		StringBuffer sb=new StringBuffer(concat);
		String reverse=sb.reverse().toString();
		System.out.print(" "+reverse);
	}
}
}
