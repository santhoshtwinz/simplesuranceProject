#Author: santhoshkumarsktn@gmail.com
@Insurance
Feature: Create insurance policy for mobile phones

  Scenario Outline: This scenario is create a new insurance using the given set of test data
    Given User navigates to the base page of the insurance site
    And the user enters valid <username> and <password>
    When the user navigates to the create insurance page from profilepage
    And the user adds the <serialNo>, <deviceName>, <invoiceName>, <orderNumber> and navigates to second page
    And the user enters the <firstName>, <lastName>, <email>, <streetName>, <houseNumber>, <zip>, <city>, <country>, <taxCode> and navigates to payment page
    Then adds the payment details and create the Insurance

    Examples: 
      | username                             | password                | serialNo   | deviceName | invoiceName | orderNumber | firstName | email         | lastName | streetName  | houseNumber | zip   | city   | country | taxCode |
      | testsellingpartner2@simplesurance.de | TestSellingPartner2Pass | SER-111111 | NAME-1111  | INV-11111   | ORD-1111    | Santhosh  | test@test.com | kumar    | Am Karlsbad |          16 | 10785 | Berlin | DE      |   11111 |
