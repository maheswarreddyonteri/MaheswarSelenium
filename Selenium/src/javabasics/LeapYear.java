package javabasics;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year :");
		int n=sc.nextInt();
		sc.close();
		
	if(n%4 == 0)
		System.out.println(n+"  is a leap year");
	else
		System.out.println(n+"  is not a leap year");
		
	}

}
