package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class DropDownExample {

	private static Object List;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement dp1=driver.findElement(By.id("fruits"));
		Select select=new Select(dp1);
		select.selectByIndex(4);
		
		select.selectByValue("1");
		
		select.selectByVisibleText("Pine Apple");
		
		WebElement multiselect = driver.findElement(By.id("superheros"));
		Select multiselectbox=new Select(multiselect);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(6);
		multiselectbox.selectByIndex(4);
		List<WebElement> multibox =multiselectbox.getOptions();
		
		WebElement trysendkeys =driver.findElement(By.id("country"));
		trysendkeys.sendKeys("Paraguay");
		
		WebElement trylanguage = driver.findElement(By.id("lang"));
		Select pmglang = new Select(trylanguage);
		pmglang.selectByValue("java");
		
		java.util.List<WebElement> listofoptions =pmglang.getOptions();
		int  size= listofoptions.size();
		System.out.println("num of list is "+size);
		
		driver.quit();
		

	}

}
