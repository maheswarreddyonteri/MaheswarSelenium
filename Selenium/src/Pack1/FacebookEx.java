package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("firstname")).sendKeys("maheswar");
		driver.findElement(By.name("lastname")).sendKeys("reddy");
		driver.findElement(By.name("reg_email__")).sendKeys("7207210822");
		driver.findElement(By.name("reg_passwd__")).sendKeys("maheswar"); 
		
		Select sel_day = new Select(driver.findElement(By.id("day")));
		sel_day.selectByVisibleText("16");
		Select sel_month = new Select(driver.findElement(By.id("month")));
		sel_month.selectByVisibleText("Aug");
		Select sel_year = new Select(driver.findElement(By.id("year")));
		sel_year.selectByVisibleText("1996");
		
		

		
	}


}
