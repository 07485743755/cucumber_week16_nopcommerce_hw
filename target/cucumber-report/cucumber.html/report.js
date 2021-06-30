$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featureFile/TestSuite.feature");
formatter.feature({
  "line": 1,
  "name": "Filter and  shopping cart Test",
  "description": "\r\nAs a user ,I want to add product in shopping cart successfully and\r\nverify product sorted as per selected filter",
  "id": "filter-and--shopping-cart-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4087348800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should able to add product in shopping cart successfully",
  "description": "",
  "id": "filter-and--shopping-cart-test;user-should-able-to-add-product-in-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Sanity,"
    },
    {
      "line": 15,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am on homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I Click on Computers tab",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click on Desktop tab",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select A to Z filter value\"5\"from filter Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select AddToCart button for Build your OwnComputerPage",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to navigate Build your own computer Page successfully with title text\"Build your own computer\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I select \"1\"(2.2 GHz Intel Pentium Dual-Core E2200) from processor drop down",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I select \"5\"(8GB [+$60.00]) from RAM dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select \"400 GB [+$100.00]\" radio button from HDD",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select \"Vista Premium [+$60.00]\" radio button from OS",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select MicrosoftOffice check box",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select Total Commander check box",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I am able to see Price \"$1,475.00\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I am click on Add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I am able to see pop up message \"The product has been added to your shopping cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I am Click on pop up close button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I am hover mouse on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on Go to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I am able to navigate cart page with title\"Shopping cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I change the quantity of selected product \"2\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I select update shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I am able to see product price \"$2,950.00\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I check the terms of service check box",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I click on check out button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I am navigate to Login page with welcome text\"Welcome, Please Sign In!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I click on check out as guest button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I enter first name \"Harry\" in first name field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter last name\"Potter\" in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter email id (user name\"harryPotter\" and domain\"@gmail.com\")in email field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select country \"United Kingdom\" from country drop down",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I select city \"Leicester\" from city drop down",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I enter address \"75,Corporation road\" in address field",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I enter post code\"LE45NJ\" in post code field",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I enter phone number \"07896543215\" in phone number field",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I select next day air shipping radio button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on shipping continue button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I select credit card radio button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click on payment continue button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I select \"MasterCard\" from visa drop down",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I enter card holder name \"Harry Potter\" in card holder field and card number\"5465222828379708\" in card number field",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I enter expire month \"01\"",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I enter expire year \"2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I enter card code \"283\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on payment confirmation button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I am able to see selected payment method \"Payment Method: Credit Card\"",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "I am able to see selected shipping method \"Shipping Method: Next Day Air\"",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I am able to see total price \"$2,950.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I click on confirm order button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "I should navigate to completed page successfully with title text \"Thank you\"",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "I am able to see order confirmation message\"Your order has been successfully processed!\"",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I click continue button",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I should navigate home page with welcome text \"Welcome to our store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuTestMyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 101673600,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnComputersTab()"
});
formatter.result({
  "duration": 1218645500,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnDesktopTab()"
});
formatter.result({
  "duration": 1526273200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 29
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectAToZFilterValueFromFilterDropdown(String)"
});
formatter.result({
  "duration": 1161166300,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectAddToCartButtonForBuildYourOwnComputerPage()"
});
formatter.result({
  "duration": 1089460900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 80
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToNavigateBuildYourOwnComputerPageSuccessfullyWithTitleText(String)"
});
formatter.result({
  "duration": 2067380400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 10
    },
    {
      "val": "2",
      "offset": 13
    },
    {
      "val": "2",
      "offset": 15
    },
    {
      "val": "2200",
      "offset": 46
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectGHzIntelPentiumDualCoreEFromProcessorDropDown(String,int,int,int)"
});
formatter.result({
  "duration": 1151576400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    },
    {
      "val": "8",
      "offset": 13
    },
    {
      "val": "60",
      "offset": 20
    },
    {
      "val": "00",
      "offset": 23
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectGB$FromRAMDropdown(String,int,int,int)"
});
formatter.result({
  "duration": 1172835500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400 GB [+$100.00]",
      "offset": 10
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectRadioButtonFromHDD(String)"
});
formatter.result({
  "duration": 1139861100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Premium [+$60.00]",
      "offset": 10
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectRadioButtonFromOS(String)"
});
formatter.result({
  "duration": 1130655900,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectMicrosoftOfficeCheckBox()"
});
formatter.result({
  "duration": 1037636800,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectTotalCommanderCheckBox()"
});
formatter.result({
  "duration": 1089374200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,475.00",
      "offset": 24
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeePrice(String)"
});
formatter.result({
  "duration": 1080556900,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iAmClickOnAddToCartButton()"
});
formatter.result({
  "duration": 94599200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 33
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeePopUpMessage(String)"
});
formatter.result({
  "duration": 1059402400,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iAmClickOnPopUpCloseButton()"
});
formatter.result({
  "duration": 70488700,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iAmHoverMouseOnShoppingCart()"
});
formatter.result({
  "duration": 189080200,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnGoToCartButton()"
});
formatter.result({
  "duration": 1115818300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 43
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToNavigateCartPageWithTitle(String)"
});
formatter.result({
  "duration": 2073549800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 43
    }
  ],
  "location": "TestSuiteMyStepdefs.iChangeTheQuantityOfSelectedProduct(String)"
});
formatter.result({
  "duration": 1163939500,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 678002300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,950.00",
      "offset": 32
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeeProductPrice(String)"
});
formatter.result({
  "duration": 1048728000,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iCheckTheTermsOfServiceCheckBox()"
});
formatter.result({
  "duration": 106150100,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnCheckOutButton()"
});
formatter.result({
  "duration": 1330438000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 46
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmNavigateToLoginPageWithWelcomeText(String)"
});
formatter.result({
  "duration": 2064282100,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnCheckOutAsGuestButton()"
});
formatter.result({
  "duration": 940813700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry",
      "offset": 20
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterFirstNameInFirstNameField(String)"
});
formatter.result({
  "duration": 3103518000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Potter",
      "offset": 18
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterLastNameInLastNameField(String)"
});
formatter.result({
  "duration": 124625100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "harryPotter",
      "offset": 28
    },
    {
      "val": "@gmail.com",
      "offset": 52
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterEmailIdUserNameAndDomainInEmailField(String,String)"
});
formatter.result({
  "duration": 110190900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 18
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectCountryFromCountryDropDown(String)"
});
formatter.result({
  "duration": 147165400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leicester",
      "offset": 15
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectCityFromCityDropDown(String)"
});
formatter.result({
  "duration": 1112466700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "75,Corporation road",
      "offset": 17
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterAddressInAddressField(String)"
});
formatter.result({
  "duration": 109319800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LE45NJ",
      "offset": 18
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterPostCodeInPostCodeField(String)"
});
formatter.result({
  "duration": 98299300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07896543215",
      "offset": 22
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterPhoneNumberInPhoneNumberField(String)"
});
formatter.result({
  "duration": 145709100,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnContinueButton()"
});
formatter.result({
  "duration": 88323700,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectNextDayAirShippingRadioButton()"
});
formatter.result({
  "duration": 2096427400,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnShippingContinueButton()"
});
formatter.result({
  "duration": 71647800,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iSelectCreditCardRadioButton()"
});
formatter.result({
  "duration": 2089110800,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnPaymentContinueButton()"
});
formatter.result({
  "duration": 72759000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MasterCard",
      "offset": 10
    }
  ],
  "location": "TestSuiteMyStepdefs.iSelectFromVisaDropDown(String)"
});
formatter.result({
  "duration": 2151362600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 26
    },
    {
      "val": "5465222828379708",
      "offset": 77
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterCardHolderNameInCardHolderFieldAndCardNumberInCardNumberField(String,String)"
});
formatter.result({
  "duration": 2196829000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 22
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterExpireMonth(String)"
});
formatter.result({
  "duration": 1096853600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 21
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterExpireYear(String)"
});
formatter.result({
  "duration": 1082517300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "283",
      "offset": 19
    }
  ],
  "location": "TestSuiteMyStepdefs.iEnterCardCode(String)"
});
formatter.result({
  "duration": 1100934500,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnPaymentConfirmationButton()"
});
formatter.result({
  "duration": 71416400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Payment Method: Credit Card",
      "offset": 42
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeeSelectedPaymentMethod(String)"
});
formatter.result({
  "duration": 2058197800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shipping Method: Next Day Air",
      "offset": 43
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeeSelectedShippingMethod(String)"
});
formatter.result({
  "duration": 42309100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,950.00",
      "offset": 30
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeeTotalPrice(String)"
});
formatter.result({
  "duration": 45883100,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickOnConfirmOrderButton()"
});
formatter.result({
  "duration": 78088200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you",
      "offset": 66
    }
  ],
  "location": "TestSuiteMyStepdefs.iShouldNavigateToCompletedPageSuccessfullyWithTitleText(String)"
});
formatter.result({
  "duration": 2055916100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order has been successfully processed!",
      "offset": 44
    }
  ],
  "location": "TestSuiteMyStepdefs.iAmAbleToSeeOrderConfirmationMessage(String)"
});
formatter.result({
  "duration": 44338000,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteMyStepdefs.iClickContinueButton()"
});
formatter.result({
  "duration": 1333532000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to our store",
      "offset": 47
    }
  ],
  "location": "TestSuiteMyStepdefs.iShouldNavigateHomePageWithWelcomeText(String)"
});
formatter.result({
  "duration": 50618100,
  "status": "passed"
});
formatter.after({
  "duration": 720689300,
  "status": "passed"
});
});