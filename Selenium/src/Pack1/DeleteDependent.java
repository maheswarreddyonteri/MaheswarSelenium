package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteDependent {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Premaltha Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.name("Submit")).click();
		
		 driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		 driver.findElement(By.xpath("//a[text()='Dependents']")).click();
		 
		 int rowcount= driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
			boolean bTag=false;
			for(int i=1;i<=rowcount;i++)
			{
				
				
				//String dependentBirthDate=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
				String dependentName=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
				if(dependentName.contains("Balu"))
				{
					bTag=true;
					driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).click();
					driver.findElement(By.xpath("//input[@id='delDependentBtn']")).click();	
					break;	
				}
			}
				
			}	
			
	}


