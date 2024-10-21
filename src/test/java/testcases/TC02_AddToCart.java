package testcases;

import org.testng.annotations.Test;
import pages.P02_AddItems;

import static common.PageBase.captureScreenshot;

public class TC02_AddToCart extends TestBase{

    @Test (priority = 1,description = "add item")
    public void clickAddToCartBtn01 (){

        new P02_AddItems(driver).selectItembtn01();
    }
    @Test (priority = 2,description = "add item")
    public void clickAddToCartBtn02 (){

        new P02_AddItems(driver).selectItembtn02();
    }
    @Test (priority = 3,description = "add item")
    public void clickAddToCartBtn03 (){

        new P02_AddItems(driver).selectItembtn03();
    }
    @Test (priority = 4,description = "add item")
    public void clickAddToCartBtn04 (){

        new P02_AddItems(driver).selectItembtn04();
    }
    /*@Test (priority = 5,description = "add item")
    public void clickAddToCartBtn05 (){

        new P02_AddItems(driver).selectItembtn05();
    }*/
    @Test (priority = 6,description = "add item")
    public void clickAddToCartBtn06 (){

        new P02_AddItems(driver).selectItembtn06();
    }


    @Test (priority = 7,description = "click on cart icon")
    public void clickonCartIcon(){

        new P02_AddItems(driver).gotoCart();

        captureScreenshot(driver,"Selected item");
    }



}
