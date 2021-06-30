package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


import java.util.List;

public class HomePage extends Utility {

    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBys({@FindBy( xpath = "//div[@class='header-menu']/ul[1]/li/a")})
    List<WebElement> homePageMenuTabs;

    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitleText;

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    WebElement computersLink;

    public String selectMenu(String menu) {

        String expectedText = null;
        for (WebElement element : homePageMenuTabs) {

            log.info("Getting text from element : "+element+"Compare it with "+menu);
            if (element.getText().equalsIgnoreCase(menu)) {
                expectedText = element.getText();

                log.info("Clicking on element: "+element.toString()+"<br>");
                element.click();
                break;
            }
        }
        return expectedText;
    }

    /*public void clickOnComputerLink(){
        Reporter.log("Clicking on computer Link : "+computersLink.toString()+"<br>");
        clickOnElement(computersLink);
        log.info("Clicking on computer Link : "+computersLink.toString());
    }*/
    public String getActualText() {

        log.info("getting title text " + pageTitleText.toString());
        return pageTitleText.getText();
    }

    public String getWelcomeText() {

        log.info("Getting welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
}
