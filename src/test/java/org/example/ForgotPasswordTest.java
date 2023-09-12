package org.example;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import PageObjectModel.ResetPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ForgotPasswordTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        ResetPassword reset = new ResetPassword(driver);

        reset.clickForgotPassword();

        reset.fillUsername("Admin");

        reset.clickresetPassword();





        driver.quit();

    }
}
