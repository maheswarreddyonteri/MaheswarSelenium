package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathDEMO {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		

		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("row count is: "+rowcount);

		List<WebElement> cols= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		int colcount = cols.size();
		System.out.println("column count is: "+colcount);
		
		WebElement cell= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]"));
		String celltext = cell.getText();
		System.out.println("cell text is: "+celltext);
		
for(int i=1;i<=rowcount;i++) {
		WebElement celltxt= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[3]"));
		String celltext1 = celltxt.getText();
		System.out.println("cell text is: "+celltext1);
}
	}

}
