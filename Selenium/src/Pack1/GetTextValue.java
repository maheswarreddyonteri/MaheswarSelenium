package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextValue {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://testingmasters.com/hrm/");
		//Get Text Value
        
		String appTextBefore=driver.findElement(By.name("txtUsername")).getAttribute("value");
		System.out.println("Textbox value before is: "+ appTextBefore);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		
		String appTextAfter=driver.findElement(By.name("txtUsername")).getAttribute("value");
		System.out.println("Textbox value before is: "+ appTextAfter);
		
		//get current url
		String URL=driver.getCurrentUrl();
		System.out.println("url is : "+ URL +"\n");
		
		//get page source
		String PageSource=driver.getPageSource();
		System.out.println("page source is : "+ PageSource);
		

	}

}
