package LMS;

// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity4 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");

        // get the title of second most favourite course
        WebElement q = driver.findElement(By.xpath("//*[@id=\"post-71\"]/div[2]/h3"));

        String TitleCourse = q.getText();
        System.out.println("Home page title: " + q.getText());

        if (TitleCourse.contains("Email Marketing Strategies")) {
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
