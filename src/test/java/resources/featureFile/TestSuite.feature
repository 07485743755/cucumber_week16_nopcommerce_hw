Feature:Filter and  shopping cart Test

  As a user ,I want to add product in shopping cart successfully and
  verify product sorted as per selected filter

  @Smoke,@Sanity,@Regression
  Scenario: User should able to see product sorted as per Z to A filter

    Given I am on homePage
    When  I Click on Computers tab
    And I click on Desktop tab
    And I select Z to A  value "6"filter from filter drop down
    Then I am able to see product sorted as per Z to A filter

  @Smoke,@Sanity,@Regression
  Scenario: User should able to see product asorted as per Z to A filter

    Given I am on homePage
    When  I Click on Computers tab
    And I click on Desktop tab
    And I select Z to A  value "6"filter from filter drop down
    Then I am able to see product sorted as per Z to A filter

  @Sanity,@Regression
  Scenario: User should able to add product in shopping cart successfully
    Given I am on homePage
    When I Click on Computers tab
    And I click on Desktop tab
    And I select A to Z filter value"5"from filter Dropdown
    And I select AddToCart button for Build your OwnComputerPage
    Then I am able to navigate Build your own computer Page successfully with title text"Build your own computer"
    When I select "1"(2.2 GHz Intel Pentium Dual-Core E2200) from processor drop down
    And I select "5"(8GB [+$60.00]) from RAM dropdown
    And  I select "400 GB [+$100.00]" radio button from HDD
    And  I select "Vista Premium [+$60.00]" radio button from OS
    And I select MicrosoftOffice check box
    And I select Total Commander check box
    Then I am able to see Price "$1,475.00"
    When I am click on Add to cart button
    Then I am able to see pop up message "The product has been added to your shopping cart"
    When I am Click on pop up close button
    And  I am hover mouse on shopping cart
    And  I click on Go to cart button
    Then I am able to navigate cart page with title"Shopping cart"
    When I change the quantity of selected product "2"
    And I select update shopping cart button
    Then I am able to see product price "$2,950.00"
    When I check the terms of service check box
    And I click on check out button
    Then I am navigate to Login page with welcome text"Welcome, Please Sign In!"
    When I click on check out as guest button
    And I enter first name "Harry" in first name field
    And I enter last name"Potter" in last name field
    And I enter email id (user name"harryPotter" and domain"@gmail.com")in email field
    And I select country "United Kingdom" from country drop down
    And I select city "Leicester" from city drop down
    And I enter address "75,Corporation road" in address field
    And I enter post code"LE45NJ" in post code field
    And I enter phone number "07896543215" in phone number field
    And I click on continue button
    And I select next day air shipping radio button
    And I click on shipping continue button
    And I select credit card radio button
    And I click on payment continue button
    And I select "MasterCard" from visa drop down
    And I enter card holder name "Harry Potter" in card holder field and card number"5465222828379708" in card number field
    And I enter expire month "01"
    And I enter expire year "2022"
    And I enter card code "283"
    And I click on payment confirmation button
    Then I am able to see selected payment method "Payment Method: Credit Card"
    And I am able to see selected shipping method "Shipping Method: Next Day Air"
    And I am able to see total price "$2,950.00"
    When I click on confirm order button
    Then I should navigate to completed page successfully with title text "Thank you"
    And I am able to see order confirmation message"Your order has been successfully processed!"
    When I click continue button
    Then I should navigate home page with welcome text "Welcome to our store"
















