package javabasics;

import java.util.Scanner;

public class decisionmaking2 {

	public static void main(String[] args) {
	
		
	   // int n=6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		int n = sc.nextInt();
	       sc.close();
		
		
		if(n%2 ==0)	
			System.out.println( "even");
		else
			System.out.println( "odd");
		

	}

}
