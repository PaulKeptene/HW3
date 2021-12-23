package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage extends BasePage {
    @FindBy(name = "to")
    private WebElement sendTo;

    @FindBy(name = "subject")
    private WebElement subject;

    @FindBy(id = "text")
    private WebElement textField;

    @FindBy(name = "send")
    private WebElement sendButton;

    @FindBy(xpath="//* [@class='list_line']/li[2]//a")
    private WebElement incomeLetters;

    public void createEmail (String to, String subj, String text) {
        sendTo.clear();
        sendTo.sendKeys(to);
        subject.clear();
        subject.sendKeys(subj);
        textField.sendKeys(text);
        sendButton.click();
    }

    public void IncomeLetters () {
        incomeLetters.click();
    }
}
