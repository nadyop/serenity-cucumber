package com.nadyop.automation.testing.steps.serenity;

import com.nadyop.automation.testing.pages.DropdownPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by nad.
 * Date: 8/3/2019
 */
public class EndUserDropdownSteps {

    DropdownPage dropdownPage;

    @Step
    public void openPage() {
        dropdownPage.open();
    }

    @Step
    public void selectDay(String day) {
        dropdownPage.clickSelectDay(day);
    }

    @Step
    public void seeDay(String day) {
        dropdownPage.getTextDay(day);
    }

    @Step
    public void clickCountries(String country, String country2) {
        dropdownPage.clickSelectCountries(country, country2);
    }

    @Step
    public void clickFirstButton() {
        dropdownPage.clickFirst();
    }

    @Step
    public void clickGetAllButton() {
        dropdownPage.clickGetAll();
    }

    @Step
    public void seeCountryFirst(String country) {
        dropdownPage.getTextCountryFirst(country);
    }

    @Step
    public void seeCountryAll(String countries) {
        dropdownPage.getTextCountryAll(countries);
    }
}

