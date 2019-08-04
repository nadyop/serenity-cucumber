package com.nadyop.automation.testing.steps;

import com.nadyop.automation.testing.steps.serenity.EndUserFormSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by nad.
 * Date: 8/3/2019
 */
public class FormSteps {

    @Steps
    EndUserFormSteps userFormSteps;

    @Given("^User open selenium easy form page$")
    public void userOpenSeleniumEasyFormPage() throws Throwable {
        userFormSteps.openPage();
    }

    @When("^User input message \"([^\"]*)\"$")
    public void userInputMessage(String message) throws Throwable {
        userFormSteps.inputMessage(message);
    }

    @And("^User click add show message button$")
    public void userClickAddShowMessageButton() throws Throwable {
        userFormSteps.clickShowMessage();
    }

    @Then("^User should see message \"([^\"]*)\"$")
    public void userShouldSeeMessage(String message) throws Throwable {
        userFormSteps.seeMessage(message);
    }

    @Given("^User see two input fields form$")
    public void userSeeTwoInputFieldsForm() throws Throwable {
        userFormSteps.seeTwoInput();
    }

    @When("^User input a \"([^\"]*)\"$")
    public void userInputA(String a) throws Throwable {
        userFormSteps.inputA(a);
    }

    @And("^User input b \"([^\"]*)\"$")
    public void userInputB(String b) throws Throwable {
        userFormSteps.inputB(b);
    }

    @And("^User click get total button$")
    public void userClickGetTotalButton() throws Throwable {
        userFormSteps.clickGetTotal();
    }

    @Then("^User should see total \"([^\"]*)\"$")
    public void userShouldSeeTotal(String total) throws Throwable {
        userFormSteps.seeTotal(total);
    }
}
