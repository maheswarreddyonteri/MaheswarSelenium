package oops3;

public class C30 {

	
		public void add(int x, int y) {
			System.out.println("add in class c30:"   +(x+y));
			
		}

		public void add(int x, double y) {
			System.out.println(x+y);
			
		}
		public void add(double x, int y) {
			System.out.println(x+y);
			
		}
		public void add(int x, int y,int z) {
			System.out.println(x+y+z);
			
		}
		
		public static void main(String[] args) {
			C30 obj = new C30();
			obj.add(30, 70);
		}
	}


