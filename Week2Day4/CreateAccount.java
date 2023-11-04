package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
		String Accname = "Shamshath123";
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("DemoCSr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();

		//Create Account Flow
		driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys(Accname);
		
		driver.findElement(By.name("description")).sendKeys("Automation Selenium Tester");
		
		//Select Industry
		WebElement Industry =driver.findElement(By.name("industryEnumId"));
		
		Select IndustryDD = new Select(Industry);
		
		IndustryDD.selectByIndex(3);//Computer Software
		
		//Select OwnerShip
		WebElement Ownership =driver.findElement(By.name("ownershipEnumId"));
				
		Select OwnershipDD = new Select(Ownership);
				
		OwnershipDD.selectByVisibleText("S-Corporation");//S-Corporation
		
		
		//Select OwnerShip
		WebElement Source =driver.findElement(By.id("dataSourceId"));
						
		Select SourceDD = new Select(Source);
						
		SourceDD.selectByValue("LEAD_EMPLOYEE");//Employee
		
		Thread.sleep(2000);
		//Select Marketing campaign
		
		WebElement MC =driver.findElement(By.name("marketingCampaignId"));
								
		Select MCDD = new Select(MC);
								
		MCDD.selectByIndex(6);// eCommerce Site Internal Campaign
		
		//Select State/Province campaign
		
		WebElement State =driver.findElement(By.name("generalStateProvinceGeoId"));
										
		Select StateDD = new Select(State);
										
		StateDD.selectByValue("TX");//Texas
		
		driver.findElement(By.className("smallSubmit")).click();//Create Account Button
		
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		if (Title.contains("Account Details"))
		{
		System.out.println("Account Created Successfully");
		}
		else
		{
			System.out.println("Account Creation failed");
				
			}
		
				driver.close();
			
		//
				
		
	}

}
