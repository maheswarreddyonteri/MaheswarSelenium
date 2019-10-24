package javabasics;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value :");
	    	int n = sc.nextInt();
	    	sc.close();
	   int   Counter=0;
	    	
	   for(int i=2 ;i<= (n/2) ; i++)
	   {   
	   if(n%i == 0)	
	    Counter++;
	   
	   }
	    
	   if(Counter == 0)
		   System.out.println(n+" is prime number");
	   else
		   System.out.println(n+" is not prime number");

	}

}
