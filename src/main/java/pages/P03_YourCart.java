package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_YourCart extends PageBase {
    public P03_YourCart(WebDriver driver) {
        super(driver);
    }

    private final By checkOutBtn = By.xpath("(//a)[@class=\"btn_action checkout_button\"]");


    public P03_YourCart clickOnCheckoutBtn (){

        new CustomeDecorator(driver,checkOutBtn,0).click();
        return this;
    }

}
