package LMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity7 {
    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");

        // Click on All Courses
        WebElement all_crs = driver.findElement(By.xpath("//*[@id=\"menu-item-1508\"]/a"));
        all_crs.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //no.of courses
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='ld_course_list']//div/h3"));
        int courses_count = elements.size();
        System.out.println("The Total no of courses are ="+" "+courses_count);

        driver.close();
    }
}
