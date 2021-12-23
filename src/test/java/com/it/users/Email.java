package com.it.users;

public class Email {
    public String email1;
    public String subject;
    public String bodyText;

    public Email(String email1, String subject, String bodyText) {
        this.email1 = email1;
        this.subject = subject;
        this.bodyText = bodyText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (email1 != null ? !email1.equals(email.email1) : email.email1 != null) return false;
        if (subject != null ? !subject.equals(email.subject) : email.subject != null) return false;
        return bodyText != null ? bodyText.equals(email.bodyText) : email.bodyText == null;
    }

    @Override
    public int hashCode() {
        int result = email1 != null ? email1.hashCode() : 0;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (bodyText != null ? bodyText.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email1='" + email1 + '\'' +
                ", subject='" + subject + '\'' +
                ", bodyText='" + bodyText + '\'' +
                '}';
    }
}
