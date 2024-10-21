package testcases;

import common.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static common.PageBase.quitBrowser;
import static drivers.DriverFactory.getNewInstance;
import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {

    static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        MyScreenRecorder.startRecording("SwagLabs");
    }

    @BeforeTest
    public void setupdriver()
    {
        setDriver(getNewInstance(""));

        driver = getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/v1/");


    }

    @AfterTest
    public void teardown() {

        quitBrowser(driver);
    }
    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();
    }


}
