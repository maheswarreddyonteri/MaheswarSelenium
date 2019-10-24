package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddDependents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		if(driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed())
			System.out.println("dashboard page opened");
		else
			System.out.println("dasboard page notopend");
		
		
	    driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed())
			System.out.println("MYinfo page opened");
		else
			System.out.println("MYinfo page not opened");
		
		driver.findElement(By.xpath("//a[text()='Dependents']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()='Assigned Dependents']")).isDisplayed())
			System.out.println("Dependents page opened");
		else
			System.out.println("Dependents page not opened");
		
		driver.findElement(By.xpath("//input[@id='btnAddDependent']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("Balu");
		driver.findElement(By.xpath("//select[@id='dependent_relationshipType']/option[text()='Child']")).click();
		
		String inpDate="2000-08-25";
	
		WebElement frmDate=driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']"));
		frmDate.clear();
		frmDate.sendKeys(inpDate);
		frmDate.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click(); 
		
		int rowcount= driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
		int row=0;
		boolean bTag=false;
		for(int i=1;i<=rowcount;i++)
		{
	
			String dependentBirthDate=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
			String dependentName=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
			if((inpDate.equals(dependentBirthDate))&&(dependentName.contains("Balu")))
			{
				bTag=true;
				row=i;
			//	driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).click();
			//	driver.findElement(By.xpath("//input[@id='delDependentBtn']")).click();	
				break;
			}
			
		}
			if(bTag) {
				
			
			String depName=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+row+"]/td[2]")).getText();	
				if(depName.contains("Balu"))	
		         	System.out.println("dependent added");
			  else
				System.out.println("dependent not added");
			}	

	else
	{
		System.out.println("dependent not found");
	}
}		
}


