package javabasics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	       
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value :");
	    	int n = sc.nextInt();
	    	sc.close();
	    	int temp=n,rem=0,rev=0;
	    	while(n>0) {
	    		rem=n%10;
	    		rev=(rev*10)+rem;
	    		n=n/10;
	    	}
if(rev==temp)
	System.out.println(rev+" is a palindrome munber");
else
	System.out.println(rev+" is not a palindrome munber");
	}

}
