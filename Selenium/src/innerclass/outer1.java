package innerclass;


public class outer1 {

		void m1() {
			System.out.println("m1 method exicuted");
		}
	public static	 class inner1{
			void m2() {
				System.out.println("m2 method exicuted");
			}
		 }

		public static void main(String[] args) {
			
			outer1 obj = new outer1();
			obj.m1();
			
			outer1.inner1 obj2 = new outer1.inner1();
			
					obj2.m2();
	    new outer1.inner1().m2();

	}

}
