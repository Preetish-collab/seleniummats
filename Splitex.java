
public class Splitex {
public static void main(String[] args) {
	String s="abc-2026";
	String[]parts=s.split("-");
	String letters=parts[0];
	String numbers=parts[1];
	System.out.println("Letters are::: "+letters);
	System.out.println("Numbers are### "+numbers);
}
}
