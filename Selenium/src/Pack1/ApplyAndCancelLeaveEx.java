package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyAndCancelLeaveEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		
		
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		
		//apply leave
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		if(driver.findElement(By.xpath("//h1[text()='Apply Leave']")).isDisplayed())
			System.out.println("apply leave page is displayed");
		else
			System.out.println("apply leave page is not displayed");
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[2]")).click();
		
		String inpDate="2019-10-16";
    	WebElement frmDate=	driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
		frmDate.click();
		frmDate.sendKeys(inpDate);
		frmDate.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		
		WebElement toDate=	driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
		toDate.click();
		toDate.clear();
		toDate.sendKeys(inpDate);
		toDate.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();  
		//navigate my leave method
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		int row=0;
		boolean bTag=false;
		for(int i=1;i<=rowCount;i++)
		{
			String appDate=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			String appSatus=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			if((inpDate.equals(appDate))&&(appSatus.contains("Pending Approval")))
			{
				bTag=true;
				row=i;
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select/option[text()='Cancel']")).click();
				driver.findElement(By.xpath("//input[@id='btnSave']")).click();	
				break;
			}
		}	
		if(bTag)
		{
			String appStatus =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[6]")).getText();
			if(appStatus.contains("Cancelled"))
				System.out.println("leave is cancelled");
			else
			System.out.println("leave is not cancelled ");
		}
		else
		{
			System.out.println("leave with pending approval not found");
		}
	}
}


