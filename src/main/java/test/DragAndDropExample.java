package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  
		  driver.switchTo().frame(0);
		  
		  WebElement Draging =driver.findElement(By.id("draggable"));
		  WebElement Droping= driver.findElement(By.id("droppable"));
		  
		  new Actions(driver).dragAndDrop(Draging, Droping ).perform();
		  
		  
		  

	}

}
