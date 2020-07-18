package tcsCodeVita;
import java.util.Scanner;

public class ConsicutivePrime {
	static int prime(int num) {
		int count = 0;
		for(int i =2 ; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	static int consicutivePrime(int num) {
		int sum = 0;
		for(int i = 2; i < num ; i++ ) {
			if(prime(i) == 1) {
				sum = sum + i; 
			}
			if(sum > num) {
				return 0;
			}
			if(sum == num) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int count = 0;
		
		while(range != 2) {
			if(prime(range) == 1) {
				if(consicutivePrime(range) == 1) {
					count++;
				}
			}
			range --;
		}
		System.out.println(count);
		sc.close();

	}

}
