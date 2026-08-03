
public class FirstandSecondHighestNumbersfromArray {
	public static void main(String[] args) {
	      int a[]={45,12,34,102,22,99,107};
	      int max1=a[0];
	      int max2=a[0];
	      for(int i=0;i<a.length;i++){
	          if(a[i]>max1){
	        	  max2=max1;
	              max1=a[i];
	          }
	          else if(a[i]>max2 && max1!=a[i]){
	              max2=a[i];
	          }
	      }
	   System.out.println("First Highest "+max1);
	    System.out.println("Second Highest "+max2);
	    }
}
