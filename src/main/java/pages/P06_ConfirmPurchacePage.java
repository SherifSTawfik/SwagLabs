package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_ConfirmPurchacePage extends PageBase {
    public P06_ConfirmPurchacePage(WebDriver driver) {
        super(driver);
    }

    private final By userMenuToLogout = By.xpath("(//div)[@class=\"bm-burger-button\"]");

    private final By logoutBtn = By.id("logout_sidebar_link");



    public P06_ConfirmPurchacePage clickOnUserMenu(){

        new CustomeDecorator(driver,userMenuToLogout,0).click();

        return this;
    }

    public P06_ConfirmPurchacePage clickLogout(){

        new CustomeDecorator(driver,logoutBtn,2000).click();

        return this;
    }


}
