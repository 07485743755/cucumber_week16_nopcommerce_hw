package com.nopcommerce.demo.cucumber.stepDefs;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuTestMyStepdefs {

    @Given("^I am on homePage$")
    public void iAmOnHomePage() {

    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String menu)  {

        new HomePage().selectMenu(menu);

    }

    @Then("^I should navigate to \"([^\"]*)\" page successfully$")
    public void iShouldNavigateToPageSuccessfully(String menu) {
        String expectedWelcomeText=menu;
        String actualWelComeText=new HomePage().getActualText();
        Assert.assertEquals(expectedWelcomeText,actualWelComeText);

    }
}
