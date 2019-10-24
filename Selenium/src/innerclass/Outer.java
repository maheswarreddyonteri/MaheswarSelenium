package innerclass;

public class Outer {
	
	void m1() {
		System.out.println("m1 method exicuted");
	}
	 class inner{
		void m2() {
			System.out.println("m2 method exicuted");
		}
	 }

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.m1();
		
		Outer.inner obj1 = obj.new inner();
		obj1.m2();
		Outer.inner obj2 = new Outer().new inner();
				obj2.m2();
		
		

	}

}
