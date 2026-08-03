
public class ArrayCommonElements {
	  public static void main(String[] args) {
			int []s1=new int[]{1,2,3,4,5,6,7};
		int []s2=new int[]{1,2,3,9,8,6,5};
		for(int i=0;i<s1.length;i++){
		for(int j=0;j<s2.length;j++){
			if(s1[i]==s2[j]){
				System.out.print(" "+s2[j]);
			}
		}
			
		}
		}
}
