package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import dataObjects.FlightFinderData;
import dataObjects.Logindata;
import pageObjects.FlightFinderView;
import pageObjects.LoginView;

public class AbstractTest {
	
	WebDriver driver;
	LoginView loginview;
	Logindata logindata;
	FlightFinderData flightfinderdata;
	FlightFinderView flightfinderview;

	@BeforeTest
	public void AbstractTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");

		PageFactory.initElements(driver, LoginView.class); 
		// to provide driver to loginview class,initializing driver to loginview class
		logindata = new Logindata();
		loginview = new LoginView();
		
		PageFactory.initElements(driver, FlightFinderView.class);
		flightfinderdata = new FlightFinderData();
		flightfinderview = new FlightFinderView();

	}
	
	@AfterTest
	public void closeEnv()
	{
		driver.close();
	}

}
