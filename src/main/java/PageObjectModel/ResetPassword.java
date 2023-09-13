package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword {
    WebDriver ldriver;
    private static final By FORGOT_PASSWORD = By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'])[1]");
    private static final By USERNAME = By.xpath("//input[@placeholder='Username']");
    private static final By RESET = By.xpath("//button[normalize-space()='Reset Password']");

    public ResetPassword(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void clickForgotPassword()
    {

        ldriver.findElement(FORGOT_PASSWORD).click();
    }
    public void fillUsername(String username) {
        ldriver.findElement(USERNAME).clear();
        ldriver.findElement(USERNAME).sendKeys(username);
    }

    public void clickresetPassword() {
        ldriver.findElement(RESET).click();
    }



}




