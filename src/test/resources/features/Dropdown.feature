@DropdownFeature
Feature: Dropdown feature

  Scenario: Select List Demo
    Given User open selenium easy dropdown page
    When User select one "Monday"
    Then User should see day selected "Monday"

  Scenario: Select Multiple List Demo First Selected
    Given User open selenium easy dropdown page
    When User select "Washington" and "Texas"
    And User click first selected button
    Then User should see "Washington"

  Scenario: Select Multiple List Demo Get All
    Given User open selenium easy dropdown page
    When User select "Washington" and "Texas"
    And User click get all button
    Then User should see countries are "Washington,Texas"
