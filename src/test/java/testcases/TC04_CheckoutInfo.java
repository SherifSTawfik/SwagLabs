package testcases;

import org.testng.annotations.Test;
import pages.P04_CheckoutPage;

import static common.PageBase.captureScreenshot;
import static util.Utility.RandomNameGenerator.generateRandomName;
import static util.Utility.RandomNumberGenerator.generateRandomNumberString;

public class TC04_CheckoutInfo extends TestBase{

    String firstname = generateRandomName();
    String lastname = generateRandomName();
    String zipcode = generateRandomNumberString(1000,5000);

    @Test (priority = 1,description = "enter checkout data")
    public void entercheckoutdata(){

        new P04_CheckoutPage(driver).enterFirstName(firstname).enterLastName(lastname).enterZipCode(zipcode).clickContinueBtn();
        captureScreenshot(driver,"checkout data");
    }

}
