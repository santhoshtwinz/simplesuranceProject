#Author: santhoshkumarsktn@gmail.com
@Insurance
Feature: Filter and Sortation for Insurance site

  Scenario Outline: This scenario is create a new insurance using the given set of test data
    Given User navigates to the base page of the insurance site
    And the user enters valid <username> and <password>
    When the user changes the language and lands in the list page from profilepage
    And checks the sort functionality in the policy number column
    Then checks whether the filer and search functionality works fine

    Examples: 
      | username                             | password                |
      | testsellingpartner2@simplesurance.de | TestSellingPartner2Pass |
