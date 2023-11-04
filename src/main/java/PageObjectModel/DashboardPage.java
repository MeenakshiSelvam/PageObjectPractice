package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    WebDriver ldriver;

    public DashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void verifyDashboard() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("dashboard"));

        String actual_url = ldriver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";


        if(expected_url.equals(actual_url)) {
            System.out.println("Matching...");
        } else {
            System.out.println("Not matching...");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e){}
    }
    By heading = By.xpath("//h6[normalize-space()='Dashboard']");

    public String getHeading() {
            String head = ldriver.findElement(heading).getText();
            System.out.println(ldriver.getTitle()); //dont need to locate title, we can directly use getTitle() function with driver.
            return head;
        }

}
