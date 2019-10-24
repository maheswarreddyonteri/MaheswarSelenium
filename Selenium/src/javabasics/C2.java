package javabasics;

public class C2 {
	
	public int a=1;//instance variable
	public static int b=5;//static or class variable
	
	void add() {
		int a = 5;
		C2.b = 10;
		 System.out.println(a+b);
		 
	}
	
	void sub() {
		int a = 10;
		System.out.println(a-b);
		
	}

	public static void main(String[] args) {
		
		C2 obj1 = new C2();
		System.out.println(obj1.a);
		System.out.println(C2.b);
		obj1.add();
		obj1.sub();
		
		
		

	}

}
