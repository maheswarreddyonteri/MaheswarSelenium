package Array_collections;

import java.util.Scanner;

public class DisplyNameEnterName {

	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter count");
		
		int n=sc.nextInt();
		
		String[]cities = new String[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter city name:  ");
		
			cities[i]=sc.next();
		}
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		
		}
	
	}}

	


