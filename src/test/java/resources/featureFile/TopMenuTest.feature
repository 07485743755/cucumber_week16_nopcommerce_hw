Feature: Top menu tab test
  As a user I want to navigate to all top menu tab page

  @Smoke,@Sanity,@Regression
  Scenario Outline: User should navigate to "<topMenuTab>" page successfully
    Given I am on homePage
    When  I click on "<topMenuTab>"
    Then  I should navigate to "<topMenuTab>" page successfully

    Examples:
      | topMenuTab        |
      | Computers         |
      | Electronics       |
      | Apparel           |
      | Digital downloads |
      | Books             |
      | Jewelry           |
      | Gift Cards        |