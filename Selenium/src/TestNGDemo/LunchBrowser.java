package TestNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LunchBrowser {
	
	@Test
	
	public void lunch () {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    System.out.println("browser lunched");
}
}