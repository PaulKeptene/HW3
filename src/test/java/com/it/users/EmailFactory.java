package com.it.users;

import java.util.ResourceBundle;

public class EmailFactory {
     static ResourceBundle email = ResourceBundle.getBundle("mail");

    static public Email getValidEmail() {
        return new Email(
                email.getString("email1"),
                email.getString("subject"),
                email.getString("bodyText")
        );
    }
}
