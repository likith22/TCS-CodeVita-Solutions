package tcsCodeVita;
import java.util.*;
//completed
public class SuperAsciiString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//char[] charString = new char[str.length()];
		int ascii[] = new int[27];
		for(int i = 0;i < str.length(); i++) {
			ascii[str.charAt(i)-96]++;
			if(ascii[1] == 2) {
				System.out.println("No");
				return;
			}
		}
	   // System.out.println(ascii[26]);
		boolean condition = false;
		for(int i = 0;i < ascii.length-1;i++) {
			if(ascii[i+1] == 0 && i !=0)
				continue;
			if(i+1 == ascii[i+1]) {
				condition = true;
			}
		}
		if(condition == true)
			System.out.print("Yes");
		else
			System.out.print("No");
	sc.close();
	}

}
