package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span [@class='sn_menu_title']")
    private WebElement lbEmailUser;

    @FindBy(xpath = "//p/a")
    private WebElement createMail;

	@FindBy(xpath="//*[@class='row new']/a")
	private WebElement emailString;

	@FindBy(xpath="//*[@class='message_body']")
	private WebElement messageBody;


    public String getLbEmailUser() {
        return lbEmailUser.getText();
    }

    public void setCreateMail() {
        createMail.click();
    }

    public void myMails () {
        emailString.click();
    }
    public String getMessageBody() {
        return messageBody.getText();
    }

}
