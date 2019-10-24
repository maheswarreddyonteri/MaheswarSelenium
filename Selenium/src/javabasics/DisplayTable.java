package javabasics;

import java.util.Scanner;

public class DisplayTable {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value :");
	    	int n = sc.nextInt();
	    	sc.close();
	    	
	    	for(int i=1;i<=10;i++)
	    	{
	    	//	System.out.println(n+" * "+i+" = "+(n*i));
	    		String row = n+" * "+i+" = "+(n*i);
	    		 System.out.println(row);
	    	}
	    		
	    	
		
		

	}

}
