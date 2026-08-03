import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//duplicates  counts
public class FrequencyofEachcharwithtimes {
	 public static void main(String[] args) {
         String str1="Welcome to world of Java";
			String str=str1.toUpperCase();
			Map<Character,Integer>map=new HashMap<Character, Integer>();
			char[] ch=str.toCharArray();
			for(Character c:ch)
			{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			}
			Set<Character>s=map.keySet();
			for(Character c1:s)
		{
		if(map.get(c1)>1)
		{
			System.out.println(c1+" is "+map.get(c1)+" times");
		}
		}
			}
}
