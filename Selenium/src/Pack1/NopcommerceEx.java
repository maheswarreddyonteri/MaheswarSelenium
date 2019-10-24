package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopcommerceEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
      driver.get("https://www.nopcommerce.com/register.aspx");
      
      
        driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$txtFirstName")).sendKeys("maheswar");
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$txtLastName")).sendKeys("reddy");
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$Email")).sendKeys("balureddy807@gmail.com");
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$UserName")).sendKeys("maheswar"); 
		
		
		Select sel_country = new Select(driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$ddlCountry")));
		sel_country.selectByValue("41");
		Select sel_yourrole = new Select(driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$ddlRole")));
		sel_yourrole.selectByValue("10");
		
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$cbNewsletter")).click();
		
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$Password")).sendKeys("maheswar"); 
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$ConfirmPassword")).sendKeys("maheswar"); 
		driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton")).click();
		
		
			
		
		
			
	}

}
