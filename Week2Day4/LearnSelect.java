package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("DemoCSr");
		driver.findElement(By.name("pass")).sendKeys("crmsfa");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Create Lead")).click();
			
		String Title = driver.getTitle();
		if (Title.contains("Forgotten"))
		{
		System.out.println("Landed Page : Forgotten");
		}
		
		}

	}


