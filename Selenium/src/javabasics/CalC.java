package javabasics;

public class CalC {
	
	private int a;
	private int b;
	CalC(){
		this.a=0;
		this.b=0;
		System.out.println("CalC1 is exicuted" );
	}
	CalC(int x, int y){
		this.a=x;
		this.b=y; 
		System.out.println("CalC int is exicuted" );
	}
	CalC(int x, double y){
		this.a=x;
		this.b= (int)y; 
		System.out.println("CalC int,double is exicuted" );
	}
void add() {
	System.out.println(  "add method  ="  + (a+b));
	
}


public static void main(String[] args) {
	CalC obj = new CalC();
	obj.add();
}
}
