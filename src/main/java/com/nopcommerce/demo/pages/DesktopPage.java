package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class DesktopPage extends Utility {


    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(id ="products-orderby" )
    WebElement sortFilterLink;

    @FindBys({@FindBy( xpath = "//div[@class='product-grid']//h2")})
    List<WebElement> productNameListLink;

    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerLink;
    @FindBy(xpath ="//div[@data-productid='1']//div[@class='buttons']" )
    WebElement addToCartButtonForBuildYourOwnComputer;

    public void selectFilterFromSortByFilterDropDown(String value) {

        log.info("Select filter Z to A from" + sortFilterLink.toString() );
        selectByValueFromDropDown(sortFilterLink, value);
    }

    public void selectSortByFilterAToZ(String value) {

        log.info("Select filter A to Z from" + sortFilterLink.toString() );
        selectByValueFromDropDown(sortFilterLink, value);
    }

    public List<String> getProductNameList() throws InterruptedException {

        log.info("Get product name list from " + productNameListLink.toString() );
        return setProductNameList(productNameListLink);
    }

    public void selectAddToCartButtonForBuildYourOwnComputer() {

        log.info("Clicking on Build your own computer add to cart button " + addToCartButtonForBuildYourOwnComputer.toString());
        clickOnElement(addToCartButtonForBuildYourOwnComputer);
    }
}
