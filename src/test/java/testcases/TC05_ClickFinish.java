package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P05_FinishPurchasePage;

public class TC05_ClickFinish extends TestBase{

    @Test (priority = 1,description = "Finish purchase")
    public void clickFinishpurchaceBtn () throws InterruptedException {

        new P05_FinishPurchasePage(driver).clickFinishBtn();

        Assert.assertEquals(new P05_FinishPurchasePage(driver).getconfMSG(), "THANK YOU FOR YOUR ORDER");
    }
}
