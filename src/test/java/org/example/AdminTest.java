package org.example;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import PageObjectModel.LoginPage2;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AdminTest {
    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginPage2 loginPage = new LoginPage2(driver);
            DashboardPage dashboardPage = new DashboardPage(driver);

            loginPage.fillUsername("Admin");
            loginPage.fillPassword("admin123");
            loginPage.clickLogin();

            dashboardPage.verifyDashboard();
            System.out.println("The page heading is --- " +dashboardPage.getHeading());




        // Take screenshot of dashboard
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("dashboard.png");
            try {
                FileUtils.copyFile(screenshotFile, destinationFile);
            } catch (IOException e) {
                 throw new RuntimeException(e);
             }




            driver.quit();
        }
    }

