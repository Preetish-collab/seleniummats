
public class RepeatChar {
	public static void main(String[] args) {
		
		String str = "java programming";
		int count = 0;
		char[] chars = str.toCharArray();
		System.out.println("Duplicate Characters: ");
		for (int i = 0; i < chars.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					//System.out.print(chars[j] + " ");
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				for(int k = 0; k < chars.length; k++)
				{
					if(chars[i] == chars[k])
					{
						count++;
					}
				}
				if(count > 1)
				{
				System.out.println("Character "+chars[i]+" occures "+ count+" times");
				}
				count = 0;
			}
		}
		
	}

}
