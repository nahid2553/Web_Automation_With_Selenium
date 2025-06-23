package org.example.Pages;

import org.example.Utilities.DriverSetup;

public class SignUpPage extends DriverSetup {

    public void signUpPage(){
        contactListApp.get("https://thinking-tester-contact-list.herokuapp.com/");

    }

}
