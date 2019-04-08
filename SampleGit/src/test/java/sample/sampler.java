package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampler {
	@Test
	public void Test1()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swamy\\DSrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("added Title 2");
		System.out.println("chekcked out for git merge request");

		System.out.println("merge requewst 2");

		System.out.println("chekcked out for git merge request");

		driver.close();
		
	}

}
 