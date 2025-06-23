package org.example.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver contactListApp;

    @BeforeSuite
    public void openBrowser(){
        contactListApp=new EdgeDriver();
        contactListApp.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser(){
        contactListApp.quit();
        //contactListApp.close();
    }
}
