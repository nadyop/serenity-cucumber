@FormFeature
Feature: Form feature

  Scenario: Single Input Field
    Given User open selenium easy form page
    When User input message "This is a new message"
    And User click add show message button
    Then User should see message "This is a new message"

  Scenario: Two Input Fields
    Given User open selenium easy form page
    When User input a "2"
    And User input b "3"
    And User click get total button
    Then User should see total "5"
