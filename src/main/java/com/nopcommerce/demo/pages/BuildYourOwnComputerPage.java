package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


import java.util.List;

public class BuildYourOwnComputerPage extends Utility {


    private static final Logger log= LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement welcomeText;

    @FindBy(xpath = "(//select[contains(@id,'product_attribute')])[1]")
    WebElement processorAttribute;

    @FindBy(xpath = "(//select[contains(@id,'product_attribute')])[2]")
    WebElement ramAttribute;

    @FindBys({@FindBy(xpath = "(//ul[@class='option-list'])[1]//label")})
    List<WebElement> hDDRadioButton;

    @FindBys({@FindBy( xpath = "(//ul[@class='option-list'])[2]//label")})
    List< WebElement > oSRadioButton;

    @FindBys({@FindBy( xpath = "(//ul[@class='option-list'])[3]//input")})
    List<WebElement > softwareCheckBox;

    @FindBy(xpath = "(//input[contains(@id,'product_attribute')])[5]")
    WebElement checkBoxMicroSoftOffice;

    @FindBy(xpath = "(//input[contains(@id,'product_attribute')])[7]")
    WebElement checkBoxTotalCommander;

    @FindBy(xpath = "//span[contains(@id,'price-value')]")
    WebElement priceLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-button')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement popUpTextFromAddToCart;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement popUpCloseButton;

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartButton;

    public String getWelcomeText(){

        log.info("Getting welcome text "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void selectProcessor(String value){

        log.info("Select processor from drop down "+processorAttribute.toString());
        selectByValueFromDropDown(processorAttribute,value);
    }

    public void selectRamFromDropDown(String value){

        log.info("Select ram from drop down: "+ramAttribute.toString());
        selectByValueFromDropDown(ramAttribute,value);
    }

    public void selectHddRadioButton(String hdd) {

        for (WebElement element : hDDRadioButton) {

            log.info("Getting text"+element.getText()+"From element "+element.getText()+" and compare with hdd"+hdd);
            if (element.getText().equalsIgnoreCase(hdd)) {
                log.info("Clicking on element "+element.toString());
                element.click();
                break;
            }
        }
    }

    public void selectOsRadioButton(String os) {

        for (WebElement element : oSRadioButton) {

            log.info("Getting text"+element.getText()+"From element "+element.getText()+" and compare with os"+os);
            if (element.getText().equalsIgnoreCase(os)) {

                log.info("Clicking on element "+element.toString());
                element.click();
                break;
            }
        }
    }

    public void checkOnCheckBoxMicroSoftOffice(){
        if(!checkBoxMicroSoftOffice.isSelected()){
            log.info("Clicking on :"+checkBoxMicroSoftOffice.toString());
            checkBoxMicroSoftOffice.click();
        }
    }

    public void checkOnCheckBoxTotalCommander(){


        log.info("Clicking on : "+checkBoxTotalCommander.toString());
        clickOnElement(checkBoxTotalCommander);
    }
    public String getTextFromPrice(){

        log.info("Getting price text from "+priceLink.toString());
        return getTextFromElement(priceLink);
    }

    public void selectAddToCart(){

        log.info("Clicking on add to cart button "+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getTextFromAddToCartPopup(){

        log.info("Getting popup text from "+popUpTextFromAddToCart.toString());
        return getTextFromElement(popUpTextFromAddToCart);
    }

    public void setPopUpCloseButton(){


        log.info(("Accept pop up close button "+popUpCloseButton.toString()));
        clickOnElement(popUpCloseButton);
    }

    public void mouseHoverOnShoppingCart(){

        log.info("Mouse hover to shopping cart link "+shoppingCartLink.toString());
        mouseHoverToElement(shoppingCartLink);
    }

    public void selectGoToCartButton(){

        log.info("Clicking on go to cart button "+goToCartButton.toString());
        clickOnElement(goToCartButton);
    }
}
