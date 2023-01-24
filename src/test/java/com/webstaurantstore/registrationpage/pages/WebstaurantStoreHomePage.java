package com.webstaurantstore.registrationpage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebstaurantStoreHomePage {
    private WebDriver driver;

    @FindBy(linkText = "Register")
    WebElement registerButton;

    public WebstaurantStoreHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebstaurantStoreRegistrationPage clickRegisterButton() {
        registerButton.click();
        return new WebstaurantStoreRegistrationPage(driver);
    }
}
