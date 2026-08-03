
public class RepeatCharacter {

	public static void main(String[] args) {
		//input-a3b12-a 3 times b 12 times
		//print 'a' 3 times
		//modern approach
//		String result = "a".repeat(3) + "b".repeat(12);
//        System.out.println(result);
		for (int i = 0; i < 3; i++) {
            System.out.print('a');
        }

        // Print 'b' 12 times
        for (int i = 0; i < 12; i++) {
            System.out.print('b');
        }

//        // Move to the next line after printing
//        System.out.println();

	}

}
