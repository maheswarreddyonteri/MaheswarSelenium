package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerceExLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
      driver.get("https://www.nopcommerce.com/login.aspx");
      
      
      driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerLogin$LoginForm$UserName")).sendKeys("maheswar");
      driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerLogin$LoginForm$Password")).sendKeys("maheswar");
      driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerLogin$LoginForm$LoginButton")).click();
      
      driver.findElementByClassName("ico-logout").click();
      
      
	}

}
