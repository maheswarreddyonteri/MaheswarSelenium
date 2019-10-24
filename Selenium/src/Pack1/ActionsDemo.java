package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.facebook.com/");
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		
		Actions obj=new Actions(driver);
		//obj.moveToElement(driver.findElement(By.name("websubmit"))).click();
		obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		

	}

}
