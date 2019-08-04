package com.nadyop.automation.testing.steps.serenity;

import com.nadyop.automation.testing.pages.FormPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by nad.
 * Date: 8/3/2019
 */
public class EndUserFormSteps {

    FormPage formPage;

    @Step
    public void openPage() {
        formPage.open();
    }

    @Step
    public void inputMessage(String message) {
        formPage.inputMessage(message);
    }

    @Step
    public void clickShowMessage() {
        formPage.clickShowMessage();
    }

    @Step
    public void seeMessage(String message) {
        List<String> result = formPage.getTextMessage();
        assertThat("This is a new message", result, hasItem(message));
    }

    @Step
    public void seeTwoInput() {
        formPage.getTotalLabel();
    }

    @Step
    public void inputA(String a) {
        formPage.inputA(a);
    }

    @Step
    public void inputB(String b) {
        formPage.inputB(b);
    }

    @Step
    public void clickGetTotal() {
        formPage.clickGetTotal();
    }

    @Step
    public void seeTotal(String total) {
        List<String> result = formPage.getTextTotal();
        assertThat("Total not found", result, hasItem(total));
    }
}
