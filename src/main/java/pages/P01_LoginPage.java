package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    //TODO: Inherit from PageBase
public class P01_LoginPage extends PageBase {
    public P01_LoginPage(WebDriver driver) {
        super(driver);
    }

    //TODO: Locate Elements (Locators)
    final By USERNAME = By.xpath("(//input)[1]");
    final By PASSWORD = By.xpath("(//input)[2]");
    final By LOGIN_BTN = By.xpath("(//input)[3]");


    //TODO: Public action methods (functions)
    public P01_LoginPage enterUser (String username)
    {
        new CustomeDecorator(driver, this.USERNAME, 0).sendKeys(username);
        return this;
    }
    public P01_LoginPage enterPassword (String password)
    {
        new CustomeDecorator(driver, this.PASSWORD, 0).sendKeys(password);
        return this;

    }
    public P01_LoginPage clickLogin () throws InterruptedException {
        new CustomeDecorator(driver, this.LOGIN_BTN, 1000).click();
        Thread.sleep(3000);
        return this;

    }

    public boolean isLoginBtnClickable (){

        return driver.findElement(this.LOGIN_BTN).isEnabled();

    }

    public String getLabelTXT () {

        return driver.findElement(By.xpath("(//div)[@class=\"product_label\"]")).getText();

    }





}
