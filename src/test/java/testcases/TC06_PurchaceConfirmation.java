package testcases;


import org.testng.annotations.Test;
import pages.P06_ConfirmPurchacePage;

public class TC06_PurchaceConfirmation extends TestBase{

    @Test (priority = 2,description = "go to user menu")
    public void clickonLogoutUserMenu(){

        new P06_ConfirmPurchacePage(driver).clickOnUserMenu();
    }

    @Test (priority = 3,description = "click on logout")
    public void clickOnLogoutBtn(){

        new P06_ConfirmPurchacePage(driver).clickLogout();

    }



}
