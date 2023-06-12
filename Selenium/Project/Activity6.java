package LMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Activity6 {
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

        // getting the page title and verifying
        String TitleNew = driver.getTitle();

        if (TitleNew.contains("My Account")) {
            //Pass
            System.out.println("It Matches");

        } else {
            //Fail
            System.out.println("Doesnt Match");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on Login Button
        WebElement s = driver.findElement(By.xpath("//*[@id=\"uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91\"]/div[2]/div[2]/a"));
        s.click();

        //Find Username and Password ; enter them and Login
        driver.findElement(By.id("user_login")).sendKeys("root");

        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

        WebElement l = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
        l.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement verify = driver.findElement(By.xpath("//*[@id=\"uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91\"]/div[2]/div[4]/a"));
        String ver = verify.getText();

        if(ver.contains("Logout")){
            System.out.println("You are logged in");
            driver.close();
        }

        else{
            System.out.println("You aren't logged in");

        }

    }
}
