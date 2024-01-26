package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class ThirdClass {
	
	//public static WebDriver driver1,driver2,driver3;
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void lunchBrowser(String browser)
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
	
	/*@Test
	/*public void RunEdge()
	{
		//driver=new EdgeDriver();
		driver1.get("https://www.google.com/");
		System.out.println("This method open the browser in third class");
	}*/
	@Test
	public void RunChrome()
	{
		//driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("This method open the  browser in third class");
	}

	/*@Test
	public void RunFirefox()
	{
		//driver=new FirefoxDriver();
		driver3.get("https://www.wikipedia.org/");
		System.out.println("This method open the browser in third class");
	}*/
	

}

