package POMdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name(objectRepository.login_US)).sendKeys("batman");
		driver.findElement(By.name(objectRepository.login_PS)).sendKeys("batman");
		driver.findElement(By.name("login")).click();


	}

}
