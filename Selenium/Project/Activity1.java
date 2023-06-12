package LMS;

// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;


public class Activity1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");
        // Get the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Home page title: " + pageTitle);

        // to Make sure it matches “Alchemy LMS – An LMS Application '' exactly.
        if(pageTitle.contains("Alchemy LMS – An LMS Application")) {
            //Pass
            System.out.println("Page title contains : Alchemy LMS – An LMS Application");
            // Close the browser
            driver.close();

        }

        else {
            //Fail
            System.out.println("Page title doesn't  contain : Alchemy LMS – An LMS Application ");
        }


    }
}
