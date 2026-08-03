import java.util.UUID;

public class RandomString {
public static void main(String[] args) {
	String randString=UUID.randomUUID().toString();
	System.out.println(randString);

}
}
