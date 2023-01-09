package automate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@BeforeTest
	
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
	    System.out.println("browser launched succesfully");			
	}
	
	@BeforeMethod
	
public void url() {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		 System.out.println("entered url");	

	}
	
	@Test
	public void entertext() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//input[@id='searchInput']/self::input")).sendKeys("covid");
		System.out.println("entered text");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).click();
        System.out.println("Entered into covid page");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='తెలుగు']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='ಕನ್ನಡ']")).click();
       Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='हिन्दी']")).click();
        Thread.sleep(5000);
        driver.navigate().back();	 
	}

	@AfterClass
	
	public void closebrowser() {
		
		System.out.println("close browser");
	}
	
@AfterTest
	
	public void deletecachecookiesanything() {
		System.out.println("deletecookies");

	}
	
}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
