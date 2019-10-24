package javabasics;

public class Highestnumber {

	public static void main(String[] args) {
	
		int a = 60;
		int b = 40;
		int c = 50;
		
		if(a>b && a>c)
			System.out.println("a is greater");
		else	if(b>a && b>c)
			System.out.println("b is greater");
		else	if(c>a && c>b)
			 System.out.println("c is greater");
		else	if(a==b && b==c && c==a)
			System.out.println("three are equal");
		else	if(a==c)
			System.out.println("a and c are equal");
		else	if(!(a==b))
			System.out.println("a and b not equal");
		else	if(!(b==c))
			System.out.println("b and c not equal");

	}

}
