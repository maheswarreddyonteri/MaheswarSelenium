package javabasics;

public class C1 {

	
	public int a=1;//instance variable
	public static int b=1;// static or class variable
	
	void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		C1 obj1 = new C1();
		
		System.out.println(obj1.a);
		System.out.println(C1.b);
		obj1.add();
		
		obj1.a = 10;
		C1.b = 30;
		
	obj1.add();
	
	
	C1 obj2 = new C1();
	obj2.add();
	
	obj2.a = 40;
	C1.b =60;
	 
	obj2.add();
	obj1.add();
	
	
	}
		
	}

	


