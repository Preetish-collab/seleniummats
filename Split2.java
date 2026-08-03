
public class Split2 {
public static void main(String[] args) {
	String s="java is a beautiful language,java hugely use is enterprises,java is invented by sunmicrosystem.";
	String[] s1=s.split(",");
	for (String a:s1) {
		System.out.println(a);
	}
}
}
