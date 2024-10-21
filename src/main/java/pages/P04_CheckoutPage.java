package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_CheckoutPage extends PageBase {
    public P04_CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By First_Name = By.id("first-name");
    private final By Last_Name = By.id("last-name");
    private final By Postal_Code = By.id("postal-code");
    private final By ContinueBtn = By.xpath("(//input)[@class=\"btn_primary cart_button\"]");


    public P04_CheckoutPage enterFirstName(String firstname){

        new CustomeDecorator(driver,First_Name,0).sendKeys(firstname);
        return this;
    }

    public P04_CheckoutPage enterLastName(String lastname){

        new CustomeDecorator(driver,Last_Name,0).sendKeys(lastname);
        return this;
    }

    public P04_CheckoutPage enterZipCode(String zipcode){

        new CustomeDecorator(driver,Postal_Code,0).sendKeys(zipcode);
        return this;
    }

    public P04_CheckoutPage clickContinueBtn(){

        new CustomeDecorator(driver,ContinueBtn,2000).click();
        return this;
    }


}
