
import java.util.HashMap;
//Synechron Client round question
public class FrequencyOfEachChar {
	 public static void main(String[] args) {
	        String str="hello world today is my day";
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(char ch:str.toCharArray()){
	        	//if(ch!=' '){->avoiding spaces
	            if(map.containsKey(ch)){
	                map.put(ch,map.get(ch)+1);
            }
	            else{
               map.put(ch,1);
          }
	        }
	        //}
	      System.out.println(map);
	    }
}
