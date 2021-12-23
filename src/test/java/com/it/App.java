package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.CreateEmailHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public CommonHelper common;
    public DashboardHelper dashboard;
    public CreateEmailHelper createEmail;

    public App() {
        login = new LoginHelper();
        common = new CommonHelper();
        dashboard = new DashboardHelper();
        createEmail = new CreateEmailHelper();
    }

    public void close() {
        common.closeApp();
    }
}
