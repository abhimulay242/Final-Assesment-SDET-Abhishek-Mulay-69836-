package Java;
import java.util.*;

public class question1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				System.out.println("String string contains vowel :" + str.charAt(i) + " -> at index" + i);
			}
		}
	}
}
