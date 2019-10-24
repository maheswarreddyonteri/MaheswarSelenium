package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyLeaveStatusEx {

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
		
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		boolean bTag=true;
		for(int i=1;i<=rowCount;i++)
		{
			String cellappText =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if(!(cellappText.contains("cancelled"))) 
			{
				bTag=false;
			}
		}
			if(bTag)
				System.out.println("Status is displyed correctly");
			else
					System.out.println("Status is not displyed correctly");
			
		}
		
		

	}


