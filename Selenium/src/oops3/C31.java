package oops3;

public class C31 extends C30 {

	public void add(int x, int y) {
		System.out.println("add in class C31  :"  +(x+y));
	}
	
	public void add(int x, int y,int z, int p) {
		System.out.println(x+y+z+p);
	}
	public static void main(String[] args) {
	  C31 obj = new C31();
	  
	  obj.add(1, 3, 7, 6);
	  obj.add(37, 43);
	  obj.add(24.5, 25);

	}

}
