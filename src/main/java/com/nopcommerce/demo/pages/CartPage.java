package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends Utility {

    private static final Logger log= LogManager.getLogger(CartPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement welcomeText;

    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantityLink ;

    @FindBy(xpath = "//button[contains(text(),'Update shopping cart')]")
    WebElement updateShoppingCartLink;

    @FindBy(xpath = "//td[@class='subtotal']/child::span")
    WebElement totalPriceLink;

    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckBox;

    @FindBy(id = "checkout")
    WebElement checkOutButton;

    public String getWelcomeText(){

        log.info("Getting welcome text from "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void changeQuantityOfSelectedProduct(String quantity){

        log.info("Change Quantity "+quantity+" On element "+quantityLink.toString());
        changeTheQuantityOnElement(quantityLink,quantity);
    }

    public void selectUpdateShoppingCart(){

        log.info("Clicking on update shopping cart "+updateShoppingCartLink.toString());
        clickOnElement(updateShoppingCartLink);
    }

    public String getTextFromTotalPrice(){

        log.info("Getting total price text from "+totalPriceLink.toString());
        return   getTextFromElement(totalPriceLink);
    }

    public void selectTermsOfService(){

        log.info("Clicking on terms of service "+termsOfServiceCheckBox.toString());
        clickOnElement(termsOfServiceCheckBox);
    }

    public void selectCheckOutButton(){

        log.info("Clicking on check out button "+checkOutButton.toString());
        clickOnElement(checkOutButton);
    }

}
