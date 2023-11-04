package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

    WebDriver ld;
   // private static final By USERNAME = By.xpath("//input[@name='username']");

    @FindBy(xpath = "//input[@name = 'username']")
    private WebElement USERNAME;

  //  private static final By PASSWORD = By.xpath("//input[@name='password']");

    @FindBy(xpath = "//input[@name='password']")
    private WebElement PASSWORD;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement LOGIN_BUTTON;
    //private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    public LoginPage2(WebDriver rdriver)
    {
        ld = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    public void fillUsername(String username) {
        USERNAME.clear();
        USERNAME.sendKeys(username);
    }
    public void fillPassword(String password) {
        PASSWORD.clear();
        PASSWORD.sendKeys(password);
    }
    public void clickLogin() {

        LOGIN_BUTTON.click();
    }



}
