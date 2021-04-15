Feature: My Store Address

  Scenario Outline: user can add an address
    Given an open browser with MyStore address page
    When user enters first name <firstName>
    And  user enters last name <lastName>
    And user enters address <address>
    And user enters postcode <postcode>
    And user enters city <city>
    And form is submitted
    Then success message is printed
    Examples:
    |firstName |lastName       | address        |postcode | city     |
    |Mike      |Taylor         |Galley Rd 15    |12482    |Worcester |
    |Jane      |Foods          |Main St 98      |92744    |Chadwick  |
    |Christoph |Michaels       |Garden Rd 11    |52336    |Leeds     |
    |deAndro   |Flaunders      |Barnacle Ave 87 |35888    |Elgin     |
    |Cornelia  |Staunderweight |Fenwick St 9    |02856    |London    |