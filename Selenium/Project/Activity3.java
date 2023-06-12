package LMS;

// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity3 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");

        WebElement p=driver.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]/div/div/div/div[2]/h3"));

        String TitleTextbox = p.getText();
        System.out.println("Home page title: " + p.getText());

        if(TitleTextbox.contains("Actionable Training")) {
            //Pass
            System.out.println("It Matches");
            // Close the browser
            driver.close();

        }

        else {
            //Fail
            System.out.println("Doesnt Match");
        }
    }
}
