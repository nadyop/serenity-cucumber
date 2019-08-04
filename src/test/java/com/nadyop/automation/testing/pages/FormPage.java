package com.nadyop.automation.testing.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nad.
 * Date: 8/3/2019
 */

@DefaultUrl("https://www.seleniumeasy.com/test/basic-first-form-demo.html")
public class FormPage extends PageObject {

    @FindBy(xpath = "//input[@placeholder=\"Please enter your Message\"]")
    private WebElementFacade inputMessage;

    @FindBy(xpath = "//button[@onclick='showInput();']")
    private WebElementFacade buttonShowMessage;

    @FindBy(xpath = "//span[@id='display']")
    private List<WebElementFacade> textMessage;

    @FindBy(xpath = "//label[@id='value1']")
    private WebElementFacade labelTwoInput;

    @FindBy(xpath = "//input[@id='sum1']")
    private WebElementFacade inputA;

    @FindBy(xpath = "//input[@id='sum2']")
    private WebElementFacade inputB;

    @FindBy(xpath = "//button[@onclick='return total()']")
    private WebElementFacade buttonGetTotal;

    @FindBy(xpath = "//span[@id='displayvalue']")
    private List<WebElementFacade> textTotal;

    public List<String> getTextMessage() {
        return textMessage.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    public void inputMessage(String message) {
        inputMessage.type(message);
    }

    public void clickShowMessage() {
        buttonShowMessage.click();
    }

    public void getTotalLabel() {
        labelTwoInput.shouldBeVisible();
    }

    public void inputA(String a) {
        inputA.type(a);
    }

    public void inputB(String b) {
        inputB.type(b);
    }

    public void clickGetTotal() {
        buttonGetTotal.click();
    }

    public List<String> getTextTotal() {
        return textTotal.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
