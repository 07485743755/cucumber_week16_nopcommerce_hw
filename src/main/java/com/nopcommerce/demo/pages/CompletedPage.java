package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CompletedPage extends Utility {

    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement thankYouText;
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement orderConfirmationText;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    private static final Logger log= LogManager.getLogger(CompletedPage.class.getName());

    public String getTextFromThankYou(){

        log.info("Getting thank you text from "+thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getTextOfOrderConfirmation(){

        log.info("Getting order confirmation text from "+orderConfirmationText.toString());
        return getTextFromElement(orderConfirmationText);
    }

    public void selectContinueButton(){

        log.info("Clicking on continue button"+continueButton.toString());
        clickOnElement(continueButton);
    }
}
