package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://testingmasters.com/hrm/");
	
        WebElement element=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        for(int i=1; i<=3;i++) {
        	js.executeScript("arguments[0].style.border='solid 3px black'", element);
        	Thread.sleep(3000);
        	js.executeScript("arguments[0].style.border=''", element);
        }

	}

}
