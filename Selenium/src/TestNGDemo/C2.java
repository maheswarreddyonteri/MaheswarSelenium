package TestNGDemo;

import org.testng.annotations.Test;

public class C2 {
	
	

	@Test(priority=2)
	public void tc01() {
		System.out.println("testing executed c1");
    }
	
	@Test(priority=1 ,enabled=false)
	public void tc02() {
		System.out.println("testing executed c2");
    }
	@Test(priority=4)
	public void tc03() {
		System.out.println("testing executed c3");
    }
	@Test(priority=3)
	public void tc04() {
		System.out.println("testing executed c4");
    }
	

}
