
public class PrintDuplicateorCommonCharacterFromString {
	 public static void main(String[] args) {
		    int count=0;
		    String s="GreAt Responsibility";
		     s=s.toLowerCase();
		    char ch[]=s.toCharArray();
		    for(int i=0;i<ch.length;i++){
		        for(int j=i+1;j<ch.length;j++){
		            if(ch[i]==ch[j] && ch[i]!=' '){
		                System.out.println(ch[j]);
		                count++;
		                
		                break;
		            }
		            
		        }
		       
		    }
		    
		 System.out.println("Total "+count);
		    }
}
