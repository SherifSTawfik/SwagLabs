package testcases;

import org.testng.annotations.Test;
import pages.P03_YourCart;

import static common.PageBase.captureScreenshot;

public class TC03_ClickCheckout extends TestBase{

    @Test(priority = 1,description = "click on checkout button")
    public void clickonCheckoutBtn(){

        new P03_YourCart(driver).clickOnCheckoutBtn();
        captureScreenshot(driver,"Checkout page");
    }

}
