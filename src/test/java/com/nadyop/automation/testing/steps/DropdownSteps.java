package com.nadyop.automation.testing.steps;

import com.nadyop.automation.testing.steps.serenity.EndUserDropdownSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by nad.
 * Date: 8/3/2019
 */
public class DropdownSteps {

    @Steps
    EndUserDropdownSteps endUserDropdownSteps;

    @Given("^User open selenium easy dropdown page$")
    public void userOpenSeleniumEasyDropdownPage() throws Throwable {
        endUserDropdownSteps.openPage();
    }

    @When("^User select one \"([^\"]*)\"$")
    public void userSelectOne(String day) throws Throwable {
        endUserDropdownSteps.selectDay(day);
    }

    @Then("^User should see day selected \"([^\"]*)\"$")
    public void userShouldSeeDaySelected(String day) throws Throwable {
        endUserDropdownSteps.seeDay(day);
    }

    @When("^User select \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSelect(String country, String country2) throws Throwable {
        endUserDropdownSteps.clickCountries(country, country2);
    }

    @And("^User click first selected button$")
    public void userClickFirstSelectedButton() throws Throwable {
        endUserDropdownSteps.clickFirstButton();
    }

    @And("^User click get all button$")
    public void userClickGetAllButton() throws Throwable {
        endUserDropdownSteps.clickGetAllButton();
    }

    @Then("^User should see \"([^\"]*)\"$")
    public void userShouldSeeCountry(String country) throws Throwable {
        endUserDropdownSteps.seeCountryFirst(country);
    }

    @Then("^User should see countries are \"([^\"]*)\"$")
    public void userShouldSeeCountries(String countries) throws Throwable {
        endUserDropdownSteps.seeCountryAll(countries);
    }
}
