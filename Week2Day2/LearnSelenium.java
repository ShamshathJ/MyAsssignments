package Week2Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
