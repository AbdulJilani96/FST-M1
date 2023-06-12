package LMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");

        // click on My Account
        WebElement r = driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a"));
        r.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // getting the page title and verifying
        String TitleNew = driver.getTitle();

        if (TitleNew.contains("My Account")) {
            //Pass
            System.out.println("It Matches");
            // Close the browser
            driver.close();

        } else {
            //Fail
            System.out.println("Doesnt Match");
        }


    }

}
