package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class BCCIAutomation {

    public static void main(String[] args) throws InterruptedException {

    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");
    	options.addArguments("--disable-gpu");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");
    	options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);

    	WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Implicit wait for dynamic loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 1. Open BCCI website
        driver.get("https://www.bcci.tv/international/women");

        // 2. Click on Men tab
        WebElement menTab =
                driver.findElement(By.xpath("//span[@class='menu-inner-text']"));
        menTab.click();

        // 3. Click on Players tab
        WebElement playersTab =
                driver.findElement(By.xpath("//a[@data-element_text='Players']"));
        playersTab.click();

        // 4. View Virat Kohli
        WebElement virat =
                driver.findElement(By.xpath("//a[@data-player_name='Virat Kohli']"));
        virat.click();
        driver.navigate().back();

        // 5. View Ravindra Jadeja
        WebElement jadeja =
                driver.findElement(By.xpath("//a[@data-player_name='Ravindra Jadeja']"));
        jadeja.click();
        driver.navigate().back();

        // 6. View KL Rahul
        WebElement rahul =
                driver.findElement(By.xpath("//a[@data-player_name='Kl Rahul']"));
        rahul.click();
        driver.navigate().back();

        // 7. Get all player cards (DIV based, stable XPath)
        List<WebElement> playerCards =
                driver.findElements(
                    By.xpath("(//a[contains(@href,'/players/')])[position()<=11]")
                );

        for (int i = 0; i < playerCards.size(); i++) {

            WebElement player = playerCards.get(i);

            // Get actual values from attributes
            String name = player.getAttribute("data-player_name");


            System.out.println("Name : " + name);
        }
  
        driver.quit();
    }
}

    

