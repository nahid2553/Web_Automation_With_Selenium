package org.example.Pages;

import org.example.Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import javax.swing.text.Utilities;

public class FrontPageAutomation extends DriverSetup {

    @Test()
    public void frontPage() throws InterruptedException {
        contactListApp.get("https://thinking-tester-contact-list.herokuapp.com/");
        Thread.sleep(1000);

        WebElement checkTitleText=contactListApp.findElement(By.tagName("h1"));
        System.out.println(checkTitleText.getText());

        WebElement checkWelcomeMessage1=contactListApp.findElement(By.xpath("//div[@class='welcome-message'][1]"));
        System.out.println(checkWelcomeMessage1.getText());

        WebElement checkWelcomeMessage2=contactListApp.findElement(By.xpath("//div[@class='welcome-message'][2]"));
        System.out.println(checkWelcomeMessage2.getText());

        WebElement checkClickableText=contactListApp.findElement(By.linkText("here"));
        System.out.println(checkClickableText.getText());
        //checkWelcomeMessage.click();
        Thread.sleep(1000);

        WebElement logInFormEmail=contactListApp.findElement(By.id("email"));
        logInFormEmail.sendKeys("nahid@gmail.com");
        Thread.sleep(1000);

        WebElement logInFormPassword=contactListApp.findElement(By.id("password"));
        logInFormPassword.sendKeys("n567d00");
        Thread.sleep(1000);

        WebElement logInFormSubmitButton=contactListApp.findElement(By.id("submit"));
        logInFormSubmitButton.click();
        System.out.println(logInFormSubmitButton.getText());
        Thread.sleep(1000);

        WebElement checkWelcomeMessage3=contactListApp.findElement(By.xpath("//p[text()='Not yet a user? Click here to sign up!']"));
        System.out.println(checkWelcomeMessage3.getText());
        Thread.sleep(1000);

        WebElement signupButton=contactListApp.findElement(By.id("signup") );
        System.out.println(signupButton.getText());
        signupButton.click();
        Thread.sleep(5000);

    }
}

