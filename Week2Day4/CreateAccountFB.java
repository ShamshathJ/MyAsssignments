package Week2Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("Shamshath");
		driver.findElement(By.name("lastname")).sendKeys("Zameer");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("shamshathmca@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shamshathmca@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		
		WebElement day = driver.findElement(By.name("birthday_day"));		
		Select DD = new Select(day);
		DD.selectByIndex(10);
		
		WebElement Month = driver.findElement(By.name("birthday_month"));		
		Select MD = new Select(Month);
		MD.selectByValue("9");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));		
		Select YD = new Select(Year);
		YD.selectByVisibleText("1986");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement RD = driver.findElement(By.xpath("//input[@value='1']"));
		RD.click();
		
		driver.close();
		
		

	}

}
