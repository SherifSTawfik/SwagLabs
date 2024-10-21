package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;

import static common.PageBase.captureScreenshot;

public class TC01_Login extends TestBase{

    String username = "standard_user";
    String password = "secret_sauce";



    @Test (priority = 1, description = "Login with valid cred")
    public void LoginWithValidCredentials() throws InterruptedException {

        Assert.assertTrue(new P01_LoginPage(driver).isLoginBtnClickable());

        new P01_LoginPage(driver).enterUser(username).enterPassword(password).clickLogin();

        // TODO: take screenshot after login
        captureScreenshot(driver,"LoginScreenshot");

        Assert.assertEquals(new P01_LoginPage(driver).getLabelTXT(),"Products");


    }



}
