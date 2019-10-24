package oops4;

public class ExceptionHadlingEx {
	
	
	public static void div(int a, int b) {
		
		try {
			double c=a/b;
		
		System.out.println(c);
		}
		catch (Exception e) {
	//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		
		div(20,15);
		div(15,0);
		div(0,15);
	}       
}
