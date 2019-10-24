package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyElementDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_7")).click();
		WebElement MaleRadio =driver.findElement(By.id("u_0_7"));
		
		boolean bDisplayed= MaleRadio.isDisplayed();
		if(bDisplayed)
			System.out.println("male radio buttion displayed");
		else
			System.out.println("male radio buttion not displayed");
		boolean bSelected= MaleRadio.isSelected();
		if(bSelected)
			System.out.println("male radio buttion Selected");
		else
			System.out.println("male radio buttion not Selected");
	
    	boolean bEnabled= MaleRadio.isEnabled();
    	if(bEnabled)
		System.out.println("male radio buttion Enabled");
	    else
		System.out.println("male radio buttion not Enabled");

	}

}
