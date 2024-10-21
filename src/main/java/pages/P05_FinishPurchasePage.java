package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_FinishPurchasePage extends PageBase {


    public P05_FinishPurchasePage(WebDriver driver) {
        super(driver);
    }

    private final By FinishBtn = By.xpath("(//a)[@class=\"btn_action cart_button\"]");


    public P05_FinishPurchasePage clickFinishBtn() throws InterruptedException {

        new CustomeDecorator(driver,FinishBtn,0).click();
        Thread.sleep(3000);
        return this;
    }

    public String getconfMSG(){

       return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/h2")).getText();
    }

}
