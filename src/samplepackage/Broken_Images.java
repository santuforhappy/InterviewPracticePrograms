package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Images {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		List<WebElement> allimges = driver.findElements(By.tagName("img"));
		for(WebElement e : allimges){
			String width = e.getAttribute("naturalWidth");
			System.out.println(width);
			if(width.equalsIgnoreCase("0")){
				System.out.println("Broken");
			}
		}
	}
}
