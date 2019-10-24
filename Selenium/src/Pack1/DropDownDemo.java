package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement month= driver.findElement(By.name("birthday_month"));
		List<WebElement> items= month.findElements(By.tagName("option"));
		
	/*	for(int i=0;i<items.size();i++) {
			String txt=items.get(i).getText();
			System.out.println(txt);
		
		}*/
		for(WebElement item:items)
			System.out.println(item.getText());
 
	}

}
