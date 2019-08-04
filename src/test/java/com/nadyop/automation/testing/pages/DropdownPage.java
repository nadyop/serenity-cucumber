package com.nadyop.automation.testing.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.ArrayList;

/**
 * Created by nad.
 * Date: 8/3/2019
 */
@DefaultUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html")
public class DropdownPage extends PageObject {

    private ArrayList<String> list = new ArrayList<String>();

    @FindBy(xpath = "//select[@id='select-demo']")
    private WebElementFacade selectDay;

    @FindBy(xpath = "//p[@class='selected-value']")
    private WebElementFacade valueDay;

    @FindBy(xpath = "//select[@name='States']")
    private WebElementFacade selectCountry;

    @FindBy(xpath = "//option[@value='Washington']")
    private WebElementFacade optionWashington;

    @FindBy(xpath = "//option[@value='Texas']")
    private WebElementFacade optionTexas;

    @FindBy(xpath = "//button[@value='Print First']")
    private WebElementFacade buttonFirst;

    @FindBy(xpath = "//button[@value='Print All']")
    private WebElementFacade buttonGetAll;

    @FindBy(xpath = "//p[@class='getall-selected']")
    private WebElementFacade textCountries;

    public void clickSelectDay(String day) {
        selectDay.selectByValue(day);
    }

    public void getTextDay(String day) {
        valueDay.containsText("Day selected :- " + day);
    }

    public void clickSelectCountries(String country, String country2) {
        list.add(selectCountry.selectByValue(country).getSelectedValue());
        list.add(selectCountry.selectByValue(country2).getSelectedValue());
    }

    public void clickFirst() {
        buttonFirst.click();
    }

    public void clickGetAll() {
        buttonGetAll.click();
    }

    public void getTextCountryFirst(String country) {
        country = list.get(0);
        textCountries.containsText("First selected option is : " + country);
    }

    public void getTextCountryAll(String countries) {
        countries = list.toString();
        textCountries.containsText("Options selected are : " + countries);
    }
}
