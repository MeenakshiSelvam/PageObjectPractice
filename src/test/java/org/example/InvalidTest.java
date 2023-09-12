package org.example;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InvalidTest {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);


        loginPage.fillUsername("chandru");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();


//        dashboardPage.verifyDashboard();

        driver.quit();

    }
}
