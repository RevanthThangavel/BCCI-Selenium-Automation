package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
		  driver.manage().window().maximize();
		  
		  Thread.sleep(1000); 
		  WebElement radioCheck=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		  
		  radioCheck.click();
//		  WebElement chkBox = 
		  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();

		  
		  
		  
		  
		  

	}

}
