package LMS;

// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity2 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");

        // identify element
        WebElement p=driver.findElement(By.xpath("//*[@id=\"uagb-infobox-74cd79b6-b855-4e72-81bc-e70591de1896\"]/div/div/div/div[1]/h1"));
        System.out.println("Home page title: " + p.getText());

        String HeadingLM = p.getText();

        if(HeadingLM.contains("Learn from Industry Experts")) {
            //Pass
            System.out.println("Page Header matches - Learn from Industry Experts");
            // Close the browser
            driver.close();

        }

        else {
            //Fail
            System.out.println("Page header doesnt match : Learn from Industry Experts");
        }

    }

}
