package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();

	        driver.get("https://spcentral.amazon.in/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xxxxxxxxxx");
	        driver.findElement(By.xpath("//input[@id='continue']")).click();
	        Thread.sleep(3000);
	        Alert a = driver.switchTo().alert();
	        a.accept();
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xxxxxx");
	        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	        String at = driver.getTitle();
	        String et = "Gmail";
	        driver.quit();
	        if(at.equalsIgnoreCase(et))
	        {
	        	System.out.println("positive");
	        }else
	        {
	        	System.out.println("negative");
	        }
	        

	} 

}
