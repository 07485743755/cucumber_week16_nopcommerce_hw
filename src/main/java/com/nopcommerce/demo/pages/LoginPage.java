package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {

    private static final Logger log= LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement welcomeText;
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkOutAsGuestButton;

    public String getWelcomeText(){

        log.info("Getting welcome Text"+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckOutAsGuestButton(){

        log.info("Clicking on checkOutAsGuest button"+checkOutAsGuestButton.toString());
        clickOnElement(checkOutAsGuestButton);
    }
}
