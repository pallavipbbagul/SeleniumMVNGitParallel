package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {
	
	//public static WebDriver driver1,driver2,driver3;
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void lunchBrowser2(String browser)
	{
		if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			//driver2=new EdgeDriver();
			//driver3=new EdgeDriver();
			System.out.println("Edge borwser should be lunched");
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			//driver2=new ChromeDriver();
			//driver3=new ChromeDriver();
			System.out.println("Chrome borwser should be lunched");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			//driver2=new FirefoxDriver();
			//driver3=new FirefoxDriver();
			System.out.println("FirefoxDriver borwser should be lunched");
		}
	}
	@Test
	public void SecondClassRunEdge()
	{
		//driver1=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("This method open the browser SecondClass");
	}
/*	@Test
	public void SecondClassRunChrome()
	{
		//driver=new ChromeDriver();
		driver2.get("https://www.youtube.com/");
		System.out.println("This method open the browser SecondClass");
	}

	@Test
	public void SecondClassRunFirefox()
	{
		//driver=new FirefoxDriver();
		driver3.get("https://www.wikipedia.org/");
		System.out.println("This method open the browser SecondClass");
	}*/

}

