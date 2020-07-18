package tcsCodeVita;
import java.util.Scanner;

public class KthLargestFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,k;
		number = sc.nextInt();
		k = sc.nextInt();
		int i = 0;
		for(i = 2;i < number;i++) {
			if(number%i == 0) {
				k--;
			}
			if(k == 0) {
				System.out.println(i);
				break;
			}
		}
		if(number == i) {
			System.out.println("1");
		}
		sc.close();

	}

}
