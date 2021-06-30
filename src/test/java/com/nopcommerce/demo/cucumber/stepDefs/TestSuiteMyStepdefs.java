package com.nopcommerce.demo.cucumber.stepDefs;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuiteMyStepdefs {
    @When("^I Click on Computers tab$")
    public void iClickOnComputersTab() {
        new HomePage().selectMenu("Computers");
    }

    @And("^I click on Desktop tab$")
    public void iClickOnDesktopTab() throws InterruptedException {
        Thread.sleep(1000);
        new ComputersPage().clickOnDesktop();
    }


    @And("^I select Z to A  value \"([^\"]*)\"filter from filter drop down$")
    public void iSelectZToAValueFilterFromFilterDropDown(String value) throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().selectFilterFromSortByFilterDropDown(value);
    }

    @Then("^I am able to see product sorted as per Z to A filter$")
    public void iAmAbleToSeeProductSortedAsPerZToAFilter() throws InterruptedException {
        Thread.sleep(1000);
        List<String> productNameList = new DesktopPage().getProductNameList();
        List<String> sortedProductNameList = new ArrayList<>(productNameList);
        Collections.sort(sortedProductNameList, Collections.reverseOrder());
        Assert.assertEquals("Product not sorted as per filter", sortedProductNameList, productNameList);

    }

    @And("^I select A to Z filter value\"([^\"]*)\"from filter Dropdown$")
    public void iSelectAToZFilterValueFromFilterDropdown(String value) throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().selectSortByFilterAToZ(value);

    }

    @And("^I select AddToCart button for Build your OwnComputerPage$")
    public void iSelectAddToCartButtonForBuildYourOwnComputerPage() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().selectAddToCartButtonForBuildYourOwnComputer();
    }

    @Then("^I am able to navigate Build your own computer Page successfully with title text\"([^\"]*)\"$")
    public void iAmAbleToNavigateBuildYourOwnComputerPageSuccessfullyWithTitleText(String expectedStr) throws InterruptedException {

        Thread.sleep(2000);
        String actualPageTitleText = new BuildYourOwnComputerPage().getWelcomeText();
        Assert.assertEquals(expectedStr, actualPageTitleText);
    }

    @When("^I select \"([^\"]*)\"\\((\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+)\\) from processor drop down$")
    public void iSelectGHzIntelPentiumDualCoreEFromProcessorDropDown(String value,int arg0,int arg1,int arg2) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectProcessor(value);
    }

    @And("^I select \"([^\"]*)\"\\((\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\]\\) from RAM dropdown$")
    public void iSelectGB$FromRAMDropdown(String value,int arg0,int arg1,int arg2) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectRamFromDropDown(value);
    }

    @And("^I select \"([^\"]*)\" radio button from HDD$")
    public void iSelectRadioButtonFromHDD(String hdd) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectHddRadioButton(hdd);
    }

    @And("^I select \"([^\"]*)\" radio button from OS$")
    public void iSelectRadioButtonFromOS(String os) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectOsRadioButton(os);
    }

    @And("^I select MicrosoftOffice check box$")
    public void iSelectMicrosoftOfficeCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().checkOnCheckBoxMicroSoftOffice();
    }

    @And("^I select Total Commander check box$")
    public void iSelectTotalCommanderCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().checkOnCheckBoxTotalCommander();
    }

    @Then("^I am able to see Price \"([^\"]*)\"$")
    public void iAmAbleToSeePrice(String expectedPrice) throws InterruptedException {
        Thread.sleep(1000);
        String actualPrice = new BuildYourOwnComputerPage().getTextFromPrice();
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @When("^I am click on Add to cart button$")
    public void iAmClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().selectAddToCart();
    }

    @Then("^I am able to see pop up message \"([^\"]*)\"$")
    public void iAmAbleToSeePopUpMessage(String expectedPopUpMessage) throws InterruptedException {
        Thread.sleep(1000);
        String actualPopUpMessage = new BuildYourOwnComputerPage().getTextFromAddToCartPopup();
        Assert.assertEquals(expectedPopUpMessage, actualPopUpMessage);
    }

    @When("^I am Click on pop up close button$")
    public void iAmClickOnPopUpCloseButton() {
        new BuildYourOwnComputerPage().setPopUpCloseButton();
    }

    @And("^I am hover mouse on shopping cart$")
    public void iAmHoverMouseOnShoppingCart() {

        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^I click on Go to cart button$")
    public void iClickOnGoToCartButton() throws InterruptedException {
        Thread.sleep(500);
        new BuildYourOwnComputerPage().selectGoToCartButton();
    }

    @Then("^I am able to navigate cart page with title\"([^\"]*)\"$")
    public void iAmAbleToNavigateCartPageWithTitle(String expectedWelcomeText) throws InterruptedException {
        Thread.sleep(2000);
        String actualWelcomeText = new CartPage().getWelcomeText();
        Assert.assertEquals(expectedWelcomeText, actualWelcomeText);
    }

    @When("^I change the quantity of selected product \"([^\"]*)\"$")
    public void iChangeTheQuantityOfSelectedProduct(String quantity) throws InterruptedException {
        Thread.sleep(1000);
        new CartPage().changeQuantityOfSelectedProduct(quantity);
    }

    @And("^I select update shopping cart button$")
    public void iSelectUpdateShoppingCartButton() {
        new CartPage().selectUpdateShoppingCart();
    }

    @Then("^I am able to see product price \"([^\"]*)\"$")
    public void iAmAbleToSeeProductPrice(String expectedPrice) throws InterruptedException {
        Thread.sleep(1000);
        String actualPrice=new CartPage().getTextFromTotalPrice();
        Assert.assertEquals(expectedPrice,actualPrice);
    }

    @When("^I check the terms of service check box$")
    public void iCheckTheTermsOfServiceCheckBox() {
        new CartPage().selectTermsOfService();
    }

    @And("^I click on check out button$")
    public void iClickOnCheckOutButton() {
        new CartPage().selectCheckOutButton();
    }

    @Then("^I am navigate to Login page with welcome text\"([^\"]*)\"$")
    public void iAmNavigateToLoginPageWithWelcomeText(String expectedWelcomeText) throws InterruptedException {
        Thread.sleep(2000);
        String actualWelcomeText=new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedWelcomeText,actualWelcomeText);
    }
    @When("^I click on check out as guest button$")
    public void iClickOnCheckOutAsGuestButton() {
        new LoginPage().clickOnCheckOutAsGuestButton();
    }

    @And("^I enter first name \"([^\"]*)\" in first name field$")
    public void iEnterFirstNameInFirstNameField(String firstName) throws InterruptedException {
        Thread.sleep(3000);
        new CheckOutPage().enterFirstName(firstName);
    }

    @And("^I enter last name\"([^\"]*)\" in last name field$")
    public void iEnterLastNameInLastNameField(String lastName)  {
        new CheckOutPage().enterLastName(lastName);

    }

    @And("^I enter email id \\(user name\"([^\"]*)\" and domain\"([^\"]*)\"\\)in email field$")
    public void iEnterEmailIdUserNameAndDomainInEmailField(String userName, String domain)  {
        new CheckOutPage().enterEmailID(userName,domain);
    }

    @And("^I select country \"([^\"]*)\" from country drop down$")
    public void iSelectCountryFromCountryDropDown(String countryName)  {
        new CheckOutPage().selectCountryFromDropDown(countryName);
    }

    @And("^I select city \"([^\"]*)\" from city drop down$")
    public void iSelectCityFromCityDropDown(String cityName) throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutPage().enterCityName(cityName);
    }

    @And("^I enter address \"([^\"]*)\" in address field$")
    public void iEnterAddressInAddressField(String address)  {
        new CheckOutPage().enterAddress(address);
    }

    @And("^I enter post code\"([^\"]*)\" in post code field$")
    public void iEnterPostCodeInPostCodeField(String postCode)  {
        new CheckOutPage().enterPostCode(postCode);
    }

    @And("^I enter phone number \"([^\"]*)\" in phone number field$")
    public void iEnterPhoneNumberInPhoneNumberField(String phoneNumber)  {
        new CheckOutPage().enterPhoneNumber(phoneNumber);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().selectContinueButton();
    }

    @And("^I select next day air shipping radio button$")
    public void iSelectNextDayAirShippingRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutPage().selectNextDayAirRadioButton();
    }

    @And("^I click on shipping continue button$")
    public void iClickOnShippingContinueButton() {
        new CheckOutPage().selectShippingContinueButton();
    }

    @And("^I select credit card radio button$")
    public void iSelectCreditCardRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutPage().selectCreditCardRadioButton();
    }

    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() {
        new CheckOutPage().selectPaymentContinueButton();
    }

    @And("^I select \"([^\"]*)\" from visa drop down$")
    public void iSelectFromVisaDropDown(String cardName) throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutPage().selectCardFromDropDown(cardName);
    }

    @And("^I enter card holder name \"([^\"]*)\" in card holder field and card number\"([^\"]*)\" in card number field$")
    public void iEnterCardHolderNameInCardHolderFieldAndCardNumberInCardNumberField(String cardHolderName, String cardNo) throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutPage().enterCardHolderName(cardHolderName);
        new CheckOutPage().enterCardNumber(cardNo);
    }

    @And("^I enter expire month \"([^\"]*)\"$")
    public void iEnterExpireMonth(String expMonth) throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutPage().enterExpireMonth(expMonth);
    }

    @And("^I enter expire year \"([^\"]*)\"$")
    public void iEnterExpireYear(String expYear) throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutPage().enterExpireYear(expYear);
    }

    @And("^I enter card code \"([^\"]*)\"$")
    public void iEnterCardCode(String cardCode) throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutPage().enterCardCode(cardCode);
    }

    @And("^I click on payment confirmation button$")
    public void iClickOnPaymentConfirmationButton() {
        new CheckOutPage().clickOnPaymentConfirmationButton();
    }

    @Then("^I am able to see selected payment method \"([^\"]*)\"$")
    public void iAmAbleToSeeSelectedPaymentMethod(String expectedPaymentMethod) throws InterruptedException {
        Thread.sleep(2000);
        String actualPaymentMethod=new CheckOutPage().getTextFromPaymentMethod();
        Assert.assertEquals(expectedPaymentMethod,actualPaymentMethod);
    }

    @And("^I am able to see selected shipping method \"([^\"]*)\"$")
    public void iAmAbleToSeeSelectedShippingMethod(String expectedShippingMethod)  {
        String actualShippingMethod=new CheckOutPage().getTextFromShippingMethod();
        Assert.assertEquals(expectedShippingMethod,actualShippingMethod);

    }

    @And("^I am able to see total price \"([^\"]*)\"$")
    public void iAmAbleToSeeTotalPrice(String expectedTotalPrice)  {
        String actualTotalPrice=new CheckOutPage().getTextFromTotalPrice();
        Assert.assertEquals(expectedTotalPrice,actualTotalPrice);
    }

    @When("^I click on confirm order button$")
    public void iClickOnConfirmOrderButton() {
        new CheckOutPage().selectConfirmOrderButton();
    }

    @Then("^I should navigate to completed page successfully with title text \"([^\"]*)\"$")
    public void iShouldNavigateToCompletedPageSuccessfullyWithTitleText(String expectedTitleText) throws InterruptedException {
        Thread.sleep(2000);
        String actualTitleText=new CompletedPage().getTextFromThankYou();
        Assert.assertEquals(expectedTitleText,actualTitleText);
    }

    @And("^I am able to see order confirmation message\"([^\"]*)\"$")
    public void iAmAbleToSeeOrderConfirmationMessage(String expectedOrderConfirmationMessage)  {
        String actualOrderConfirmationMessage=new CompletedPage().getTextOfOrderConfirmation();
        Assert.assertEquals(expectedOrderConfirmationMessage,actualOrderConfirmationMessage);
    }


    @When("^I click continue button$")
    public void iClickContinueButton() {
        new CompletedPage().selectContinueButton();
    }

    @Then("^I should navigate home page with welcome text \"([^\"]*)\"$")
    public void iShouldNavigateHomePageWithWelcomeText(String expectedWelcomeText)  {

        String actualWelcomeText=new HomePage().getWelcomeText();
        Assert.assertEquals(expectedWelcomeText,actualWelcomeText);
    }
}
