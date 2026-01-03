package test;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) { 
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://letcode.in/alert");
		  driver.manage().window().maximize();
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		  
		  driver.findElement(By.id("accept")).click();
		  Alert simplealrt =wait.until(ExpectedConditions.alertIsPresent());
		  String s1 =simplealrt.getText();
		  System.out.println("the txt is "+s1);
		  simplealrt.accept();
		  
		  driver.findElement(By.id("confirm")).click();
		  Alert confirmalrt=wait.until(ExpectedConditions.alertIsPresent());
		  confirmalrt.dismiss();
		  
		  driver.findElement(By.id("prompt")).click();
		  Alert promptalrt =wait.until(ExpectedConditions.alertIsPresent());
		  String name ="revanth";
		  promptalrt.sendKeys("name");
		  promptalrt.accept();
		  System.out.println("output is "+name);

		  driver.quit();
		  
	}

}
