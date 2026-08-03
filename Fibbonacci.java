
public class Fibbonacci {
	public static void main(String[] args) {
		int firstn=0;
		int secondn=1;
		System.out.print(" "+firstn);
		System.out.print(" "+secondn);

		for(int i=0;i<10;i++) {
			int thirdn=firstn+secondn;
			System.out.print(" "+thirdn);
			firstn=secondn;
			secondn=thirdn;
			
		}
		}
}
