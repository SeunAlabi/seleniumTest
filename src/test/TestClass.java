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
		testSearchBox(); 
		testFullPage();
		
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
		    driver.close();
			
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
	// Tests the register functionality with a correct all correct details
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
	
	//tests the search box functionality
	public static void testSearchBox() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://fd04gdsd.com.s3-website-us-west-2.amazonaws.com");
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[1]/div/input")).sendKeys("android");
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		System.out.println("Test Completed");
		driver.close();
		
	}
	
	//Tests the login, search, Detail and Send message functionalities all at once 
	public static void testFullPage() throws InterruptedException{
		 WebDriver driver = new ChromeDriver();
		driver.get("http://fd04gdsd.com.s3-website-us-west-2.amazonaws.com");
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("seun");
		driver.findElement(By.name("password")).sendKeys("aero4321");
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[1]/div/input")).sendKeys("android");
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[1]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-product-list/div/app-product[1]/mat-card/mat-card-actions/button[3]/span")).click();
		driver.findElement(By.xpath("//*[@id='mat-input-10']")).sendKeys("I like it");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-product-detail/mat-card/div/div/div[1]/button/span")).click();
		Thread.sleep(2000);
		
		
		System.out.println("Test Completed");
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
