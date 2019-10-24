package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelLeaveEx {

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
		String srcDate ="2019-10-28";
		int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		for(int i=1;i<=rowCount;i++) {
			String appDate=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			String appSatus=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if((srcDate.equals(appDate))&&(appSatus.contains("Cancelled")))
				
			driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select/option[text()='Cancel']")).click();
			//	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			//	System.out.println("Status is caancelled");
				else
					System.out.println("Status isnot cancelled");
			}
		}

	

}
