package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassTest extends BaseTest {
    @Test
    public void test1() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbEmailUser(), validUser.email);
    }

    @Test
    public void test2() throws InterruptedException {
        app.login.login(validUser);
        app.dashboard.setCreateMail();
        app.createEmail.createEmail(validEmail);
        Thread.sleep(2000);
        app.createEmail.IncomeLetters();
        Thread.sleep(2000);
        app.dashboard.myMails();
        Assert.assertTrue(app.dashboard.getMessageBody().contains(validEmail.bodyText));
    }
}
