package com.it.helpers;

import com.it.pages.CreateEmailPage;
import com.it.users.Email;

public class CreateEmailHelper extends CreateEmailPage {
    public void createEmail (Email email) {
        createEmail(email.email1,email.subject, email.bodyText);
    }
}
