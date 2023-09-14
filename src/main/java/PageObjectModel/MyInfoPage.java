package PageObjectModel;

import org.openqa.selenium.*;

import javax.print.attribute.standard.MediaSize;
import java.time.Duration;

public class MyInfoPage {

    WebDriver ldriver;
    private static final By FIRSTNAME = By.xpath("//input[@placeholder='First Name']");
    private static final By LASTNAME = By.xpath("//input[@placeholder='Last Name']");
    private static final By EMPID = By.xpath("//div[label[normalize-space()='Employee Id']]/parent::div//input");
   // private static final By NATIONALITY = By.xpath("(//div[@clear='false'][normalize-space()='-- Select --'])[1]");
  //  private static final By DOB = By.xpath(("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]");
    private static final By FEMALE = By.xpath("//label[normalize-space()='Female']");
    private static final By MALE = By.xpath("//label[normalize-space()='Male']");
    private static final By SAVE = By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]");

    public MyInfoPage(WebDriver rdriver) {
        ldriver = rdriver;
        ldriver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
        ldriver.findElement(By.xpath("//a[normalize-space()='Personal Details']")).click();
        ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    public void fillFirstname(String firstname) {
        ldriver.findElement(FIRSTNAME).click();
        ldriver.findElement(FIRSTNAME).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ldriver.findElement(FIRSTNAME).sendKeys(Keys.DELETE);
        ldriver.findElement(FIRSTNAME).sendKeys(firstname);
    }

    public void fillLastname(String lastname) {

        ldriver.findElement(LASTNAME).click();
        ldriver.findElement(LASTNAME).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ldriver.findElement(LASTNAME).sendKeys(Keys.DELETE);
        ldriver.findElement(LASTNAME).sendKeys(lastname);
    }

    public void enterEmpid(String empid) {

        ldriver.findElement(EMPID).click();
        ldriver.findElement(EMPID).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ldriver.findElement(EMPID).sendKeys(Keys.DELETE);
        ldriver.findElement(EMPID).sendKeys(empid);
    }

//    public void enterNationality(String nationality) {
//        ldriver.findElement(NATIONALITY).click();
//        ldriver.findElement(NATIONALITY).clear();
//        ldriver.findElement(NATIONALITY).sendKeys(nationality);
//    }

//    public void fillDob(String dob) {
//
//        ldriver.findElement(DOB).clear();
//        ldriver.findElement(DOB).sendKeys(dob);
//    }

    public void clickFemale() {
        ldriver.findElement(FEMALE).click();
    }

    public void clickMale() {
        ldriver.findElement(MALE).click();
    }

    public void clickSave()
    {
        ldriver.findElement(SAVE).click();
    }






}
