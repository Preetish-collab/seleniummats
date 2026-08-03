import java.util.Scanner;

public class FIndVowelDigitWhitespace {
	public static void main(String[] args) {
		//String str="PREETISH KUMAR BHANJADEO  1234";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:::: ");
		String str=scan.nextLine();
		int count=0;
		char ch;
		for(int i=0;i<str.length();i++){
		ch=str.charAt(i);
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
			System.out.print(" "+ch);
		}
		else if(Character.isDigit(ch)){
			System.out.print(" "+ch);
		}

		else if(Character.isWhitespace(ch)){
			System.out.println(" "+ch);
			count++;
					}


		}
		System.out.print("Number of white space "+count);
		}	
}
