package com.it.tests;

import com.it.App;
import com.it.users.Email;
import com.it.users.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();
    static Email validEmail = EmailFactory.getValidEmail();

    @AfterSuite
    public void afterSuite() {
        app.close();
    }
}
