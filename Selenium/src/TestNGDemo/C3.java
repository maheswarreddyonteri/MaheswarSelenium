package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C3 {
	
	
	
	@BeforeMethod
	public void BM() {
		System.out.println("testing executed BM");
    }
	
	@AfterMethod
	public void AM() {
		System.out.println("testing executed AM");
    }
	@BeforeClass
	public void BC() {
		System.out.println("testing executed BC");
    }
	@AfterClass
	public void AC() {
		System.out.println("testing executed AC");
    }
	@Test
	public void tc01() {
		System.out.println("testing executed c1");
    }
	
	@Test
	public void tc02() {
		System.out.println("testing executed c2");
    }
	
	



}
