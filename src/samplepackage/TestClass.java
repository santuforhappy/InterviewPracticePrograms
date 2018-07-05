package samplepackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static void main(String[] args) throws Exception
	{
		//Validating user able to navigate Create navigate screen by clicking on "I'm not a robot check box"
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebDriverWait w = new WebDriverWait(driver,30);
		WebElement e = driver.findElement(By.id("header-account-menu"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header-account-menu']")));
		a.click(e).build().perform();
		driver.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(10000);
		JavascriptExecutor js =  (JavascriptExecutor) driver;
//		js.executeScript("document.getElementsByClassName('recaptcha-checkbox-checkmark')[0].setAttribute('class','No_class')");
		js.executeScript("document.getElementsByXpath('//*[@class='recaptcha-checkbox-checkmark']')[0].click()");
		Robot r = new Robot();
		for(int i=0;i<19;i++)
		{
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'human')]/..")).click();
		String pagename = driver.getTitle();
		System.out.println(pagename);
		try
		{
		if(pagename.contains("Create an account"))
		{
		driver.findElement(By.id("create-account-firstname")).sendKeys("test1");
		driver.findElement(By.id("create-account-lastname")).sendKeys("last1");
		driver.findElement(By.id("create-account-emailId")).sendKeys("test@test.com");
		driver.findElement(By.id("create-account-password")).sendKeys("test123");
		driver.findElement(By.id("create-account-confirm-password")).sendKeys("test123");
		driver.findElement(By.id("create-account-expedia-policy")).click();
		driver.findElement(By.id("create-account-submit-button")).click();
		}
		}
		catch(Exception e3)
		{
		System.out.println("As application asking the Captcha we are unable to automate");
		
		}
		

	}

}
