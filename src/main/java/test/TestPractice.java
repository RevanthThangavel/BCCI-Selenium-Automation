package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement Testpractice = driver.findElement(By.id("name"));
		Testpractice.sendKeys("revanth");
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("xxxxxxxxxx");
		driver.findElement(By.id("textarea")).sendKeys("xxxxxxxxxx");
		driver.findElement(By.xpath("//*[@id=\'post-body-1307673142697428135\']/div[3]/div[1]/label")).click()
;		
		List<WebElement> daybox = driver.findElements(By.xpath("//label[@class='form-check-label']"));
		for(WebElement box :daybox) {
			
			String text =box.getText();
			
			if(!text.equalsIgnoreCase("Sunday")) {
				box.click();
			}
		}
		
		WebElement country = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select ctry= new Select(country);
		ctry.selectByValue("india");
		
		WebElement selectcolor =driver.findElement(By.id("colors"));
		Select multislt = new Select(selectcolor);
		multislt.selectByValue("blue");
		multislt.selectByValue("red");
		multislt.selectByValue("green");


	}

}
