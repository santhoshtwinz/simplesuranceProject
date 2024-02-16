#Author: santhoshkumarsktn@gmail.com
@Insurance
Feature: Bulk insurance creation

  Scenario Outline: This scenario is create a new insurance using the CSV file upload
    Given User navigates to the base page of the insurance site
    And the user enters valid <username> and <password>
    When the user changes the language and lands in the import page from profilepage
    And uploads the csv file to create a bulk insurance
    Then validates the response after the insurance is created
  

    Examples: 
      | username                             | password                |
      | testsellingpartner2@simplesurance.de | TestSellingPartner2Pass |
