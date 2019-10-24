package javabasics;

import java.util.Scanner;

public class Fctorialnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value :");
	    	int n = sc.nextInt();
	    	sc.close();
	   int fact = 1;
	   for(int i=n;i>=1;i--)
	   {
		   fact = fact*i;
		   System.out.println("Factor of "+n+" is :"+fact);
	   }

	}

}
