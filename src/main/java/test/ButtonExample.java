package test;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://letcode.in/button");
		  driver.manage().window().maximize();
		  
		  //button position
		  WebElement getposition=driver.findElement(By.id("position"));
		  Point xy=getposition.getLocation();
		  int xvalues=xy.getX();
		  int yvalues=xy.getY();
		  System.out.println("x values is "+xvalues + "y values is "+yvalues);
		  
		  //find color
		  WebElement buttoncolor =driver.findElement(By.id("color"));
		  String color =buttoncolor.getCssValue("background-color");
		  System.out.println("background color is "+color);
		  
		  //findSize
		  WebElement buttonsize =driver.findElement(By.id("property"));
		  int height =buttonsize.getSize().getHeight();
		  int width = buttonsize.getSize().getWidth();
		  System.out.println("heght is "+ height+ "width is "+ width);
		  
		  //is enables
		  WebElement enabled =driver.findElement(By.id("isDisabled"));
		  Boolean result =enabled.isEnabled();
		  System.out.println("result is "+result);
		  
		  //click and hold
		  WebElement clicknhold =driver.findElement(By.id("isDisabled"));
		  Actions a = new Actions(driver);
		  a.moveToElement(clicknhold).clickAndHold().perform();
		  Thread.sleep(3000);
		  a.release().perform();
		  String showntext=clicknhold.getText();
		  System.out.println("shown text is "+ showntext);
		  

		  driver.close();
	}

}











