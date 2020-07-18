package tcsCodeVita;
import java.util.*;
//completed
public class LazyStudent {
	public static long combinations(long n,long r) {
		return (fact(n)/(fact(r)*fact(n-r)));
	}
	public static long fact(long n) {
		if(n == 0 || n == 1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static long gcd(long n1, long n2) {
	    if (n2 == 0) {
	        return n1;
	    }
	    return gcd(n2, n1 % n2);
	}
	public static long mulInv(long n) {
		long m = 1000000007;
		long b = 0;
		for(int i =1;i < m;i++) {
			if((i%m+1)%n== 0) {
				b = (i*m+1)/n;
				break;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  T = sc.nextInt();
		for(int i = 0; i < T;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();
			long sum = 0;
			//int known;
			int unknown;
			/*for(int j = 1; j <= t;j++) {
				known = j;
				unknown = m-j;
				sum = sum + (combinations(t,known) * combinations(n-t,unknown));
			}-> this will take long time*/
			//now we will calculate the faling probablity:-
			unknown = n-t;
			sum = sum + combinations(unknown,m);
			long p ;
			long q ;
			q= combinations(n,m);
			p = q - sum;
			long  gcd = gcd(p,q);
			if(gcd != 1) {
				p = p/gcd;
				q = q/gcd;
			}
			long result = (p*mulInv(q))%1000000007;
			System.out.println(result);
		}
		sc.close();
	}
	
}
