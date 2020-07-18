package tcsCodeVita;

import java.util.*;  

class Coins 
{ 
  
	public static int findCount(int n) 
	{ 
	    return (int) (Math.log(n)/Math.log(2)+1); 
	} 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int N[] = new int[T];
    	for(int i = 0;i < T ; i++) {
	       N[i] = sc.nextInt();
    	}
    	for(int i = 0; i <T;i++) {
    		if(i != T-1)
    		System.out.println(findCount(N[i]));
    		else
    			System.out.print(findCount(N[i]));
    	}
    	sc.close();
    } 
} 


