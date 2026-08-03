
public class LongestString {
	public static void main(String[] args) {
        String[] s = {"DELHI", "KOLKOTA", "PUNE", "BHUBANESWAR"};
        
        String longest = s[0];
        for (String str : s) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        
        System.out.println("Longest string: " + longest);
    }
}
