package pages;

import actions.CustomeDecorator;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_AddItems extends PageBase {
    public P02_AddItems(WebDriver driver) {
        super(driver);
    }

    private final By AddToCartBtn01 = By.xpath("(//button)[@class=\"btn_primary btn_inventory\"][1]");
    private final By AddToCartBtn02 = By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button");
    private final By AddToCartBtn03 = By.xpath("(//button)[@class=\"btn_primary btn_inventory\"][3]");
    private final By AddToCartBtn04 = By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[4]/div[3]/button");
    private final By AddToCartBtn05 = By.xpath("(//button)[@class=\"btn_primary btn_inventory\"][5]");
    private final By AddToCartBtn06 = By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[6]/div[3]/button");

    private final By CartBtn = By.id("shopping_cart_container");

    public P02_AddItems selectItembtn01 (){

        new CustomeDecorator(driver,AddToCartBtn01,1000).click();
        return this;
    }
    public P02_AddItems selectItembtn02 (){

        new CustomeDecorator(driver,AddToCartBtn02,1000).click();
        return this;
    }
    public P02_AddItems selectItembtn03 (){

        new CustomeDecorator(driver,AddToCartBtn03,1000).click();
        return this;
    }
    public P02_AddItems selectItembtn04 (){

        new CustomeDecorator(driver,AddToCartBtn04,1000).click();
        return this;
    }
    public P02_AddItems selectItembtn05 (){

        new CustomeDecorator(driver,AddToCartBtn05,1000).click();
        return this;
    }
    public P02_AddItems selectItembtn06 (){

        new CustomeDecorator(driver,AddToCartBtn06,1000).click();
        return this;
    }




    public P02_AddItems gotoCart (){

        new CustomeDecorator(driver,CartBtn,0).click();
        return this;
    }




}
