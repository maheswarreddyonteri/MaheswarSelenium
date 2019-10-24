package javabasics;

public class swapnumbers {
	
	public static void main(String[] args) {
	
	int a = 500;
	int b = 300;
	
	
	System.out.println("value of a is: " + a);
	System.out.println("value of b is : " + b);
	
	/*
	 int temp = a;
	 a=b;
	 b=temp;*/
	
	b=a+b;
	a=b-a;
	b=b-a;
	
	 
	 System.out.println("value after swap a is: " + a);
	 System.out.println("value after swap b is : " + b);
		
	 
	
	}
	
}
