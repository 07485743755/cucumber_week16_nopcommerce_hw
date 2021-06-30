package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.Random;

public class CheckOutPage extends Utility {


    private static final Logger log= LogManager.getLogger(CheckOutPage.class.getName());

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField ;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @FindBy(id ="BillingNewAddress_City" )
    WebElement cityField;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeField;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @FindBy(xpath ="(//input[contains(@id,'shippingoption')])[2]" )
    WebElement nextDayAirRadioButton;
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement shippingContinueButton;
    @FindBy(xpath = "(//input[contains(@id,'paymentmethod')])[2]")
    WebElement creditCardRadioButton;
    @FindBy(xpath = "//button[@onclick='PaymentMethod.save()']")
    WebElement paymentMethodContinueButton;
    @FindBy(id ="CreditCardType" )
    WebElement selectCreditCard;
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;
    @FindBy(id = "CardCode")
    WebElement cardCodeField;
    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
    WebElement paymentConfirmationButton;
    @FindBy(xpath ="//li[@class='payment-method']" )
    WebElement paymentMethodConformationText;
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodConformationText;
    @FindBy(xpath ="//span[@class='value-summary']/child::strong" )
    WebElement totalPriceText;
    @FindBy(xpath ="//button[@onclick='ConfirmOrder.save()']" )
    WebElement confirmOrderButton;




    public void enterFirstName(String firstname){


        log.info("Enter firstname "+firstname+" in first field"+firstNameField.toString());
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastName){

        log.info("Enter last name "+lastName+" in last name field"+lastNameField.toString());
        sendTextToElement(lastNameField,lastName);
    }
    public void enterEmailID(String username,String domain){


        log.info("Send email id "+username+"random number"+generateRandomNumber()+"Domain"+domain+"In emailid field "+emailIdField.toString());
        sendTextToElement(emailIdField,username+ generateRandomNumber() +domain);
    }

    public void selectCountryFromDropDown(String visibleText ){
        log.info("Select visible text "+visibleText+" In country field "+country.toString());
        selectByVisibleTextFromDropDown(country,visibleText);
    }
    public void enterCityName(String cityName){
        log.info("Enter city name "+cityName+" in city field"+cityField.toString());
        sendTextToElement(cityField,cityName);
    }
    public void enterAddress(String address){

        log.info("Enter address"+address+" in address field"+addressField.toString());
        sendTextToElement(addressField,address);
    }
    public void enterPostCode(String postalCode){

        log.info("Enter post code"+postalCode+" in postal code field"+postalCodeField.toString());
        sendTextToElement(postalCodeField, postalCode);
    }
    public void enterPhoneNumber(String phoneNumber){

        log.info("Enter phone number"+phoneNumber+" in phone number field"+phoneNumberField.toString());
        sendTextToElement(phoneNumberField,phoneNumber);
    }

    public void selectContinueButton(){

        log.info("Clicking on continue button "+continueButton.toString());
        clickOnElement(continueButton);
    }

    public void selectNextDayAirRadioButton(){

        log.info("Clicking on next day air delivery radio button "+nextDayAirRadioButton.toString());
        clickOnElement(nextDayAirRadioButton);
    }

    public void selectShippingContinueButton(){

        log.info("Clicking on shipping continue button "+shippingContinueButton.toString());
        clickOnElement(shippingContinueButton);
    }

    public void selectCreditCardRadioButton(){

        log.info("Clicking on credit card radio button "+creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void selectPaymentContinueButton(){

        log.info("Clicking on payment continue button "+paymentMethodContinueButton.toString());
        clickOnElement(paymentMethodContinueButton);
    }

    public void selectCardFromDropDown(String value){

        log.info("Select card "+value+" from drop down "+selectCreditCard.toString());
        selectByValueFromDropDown(selectCreditCard,value);
    }

    public void enterCardHolderName(String cardHolderName){

        log.info("Send text "+cardHolderName+" In card holder field "+cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField,cardHolderName);
    }

    public void enterCardNumber(String cardNumber){

        log.info("Send text "+cardNumber+" In card number field "+cardNumberField.toString());
        sendTextToElement(cardNumberField,cardNumber);
    }

    public void enterExpireMonth(String expireMonth){

        log.info("Send text "+expireMonth+" In expire month field "+expireMonthField.toString());
        sendTextToElement(expireMonthField,expireMonth);
    }

    public void enterExpireYear(String expireYear){

        log.info("Send text "+expireYear+" In expire year field "+expireYear.toString());
        sendTextToElement(expireYearField,expireYear);
    }

    public void enterCardCode(String cardCode){

        log.info("Send text "+cardCode+" In card code field "+cardCodeField.toString());
        sendTextToElement(cardCodeField,cardCode);
    }

    public void clickOnPaymentConfirmationButton(){

        log.info("Clicking on payment confirmation button "+paymentConfirmationButton.toString());
        clickOnElement(paymentConfirmationButton);
    }

    public String getTextFromPaymentMethod(){

        log.info("Getting payment method confirmation text from "+paymentMethodContinueButton.toString());
        return getTextFromElement(paymentMethodConformationText);
    }

    public String getTextFromShippingMethod(){

        log.info("Getting shipping method confirmation text from "+shippingMethodConformationText.toString());
        return getTextFromElement(shippingMethodConformationText);
    }

    public String getTextFromTotalPrice(){

        log.info("Getting total price text from "+totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void selectConfirmOrderButton(){

        log.info("Clicking on confirm order button "+confirmOrderButton.toString());
        clickOnElement(confirmOrderButton);
    }
}
