package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	/*	List<WebElement> links= driver.findElements(By.tagName("a"));
		int n=links.size();
		System.out.println(n);
		
		for(WebElement link:links) {
			String txt = link.getText();
			System.out.println(txt);  
		}  */
		
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select obj_mon = new Select(month);
		obj_mon.selectByVisibleText("Apr");

		

	}

}
