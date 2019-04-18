package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		testHomePage();
		testLoginPage();
		testRegisterPage();
		
	}
	
	// Tests the home page login button
	public static void testHomePage( ) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
		    driver.get("http://fd04gdsd.com.s3-website-us-west-2.amazonaws.com/home");
		    Thread.sleep(2000);
		    String pageTitle= driver.getTitle();
			String expectedTitle= "YouBuy";
			
			if(pageTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println(pageTitle);
			}
			else {
				System.out.println("Page title Test Unsuccessful");
			}
			Thread.sleep(2000);
		    driver.findElement(By.className("mat-button-wrapper")).click();
		    Thread.sleep(5000);
		    System.out.println("Test Completed");
			
	}
	
	// Tests the login functionality with a correct username and password
	public static void testLoginPage( ) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://fd04gdsd.com.s3-website-us-west-2.amazonaws.com/login");
		driver.findElement(By.name("username")).sendKeys("seun");
		driver.findElement(By.name("password")).sendKeys("aero4321");
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		System.out.println("Test Completed");
		driver.close();
		
		
	}
	
	public static void testRegisterPage( ) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://fd04gdsd.com.s3-website-us-west-2.amazonaws.com/signup");
		driver.findElement(By.name("name")).sendKeys("john");
		driver.findElement(By.name("username")).sendKeys("goodjohn");
		driver.findElement(By.name("email")).sendKeys("john@goodman.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.name("phone")).sendKeys("12345678");
		driver.findElement(By.name("address")).sendKeys("100 Frankfurt Street");
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		System.out.println("Test Completed");
		driver.close();
		
		
	}
	
	
	
	
	
	
		
	
}
