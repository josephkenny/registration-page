package com.webstaurantstore.registrationpage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebstaurantStoreRegistrationPage {
    private WebDriver driver;

    @FindBy(id = "email")
    WebElement emailTextBox;

    @FindBy(id = "billname")
    WebElement nameTextBox;

    @FindBy(id = "billcompany")
    WebElement companyTextBox;

    @FindBy(id = "billcompany_type")
    Select companyTypeDropDownMenu;

    @FindBy(id = "billaddr")
    WebElement billingAddressTextBox;

    @FindBy(id = "billzip")
    WebElement zipCodeTextBox;

    @FindBy(id = "billphone")
    WebElement phoneNumberTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    public WebstaurantStoreRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email) {
        emailTextBox.sendKeys(email);
    }

    public void setName(String name) {
        nameTextBox.sendKeys(name);
    }

    public void setCompany(String company) {
        companyTextBox.sendKeys(company);
    }

    public void setCompanyType(String companyType) {
        companyTypeDropDownMenu = new Select(driver.findElement(By.id("billcompany_type")));
        companyTypeDropDownMenu.selectByVisibleText(companyType);
    }

    public void setBillingAddress(String billingAddress) {
        billingAddressTextBox.sendKeys(billingAddress);
    }

    public void setZipCode(String zipCode) {
        zipCodeTextBox.sendKeys(zipCode);
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumberTextBox.sendKeys(phoneNumber);
    }

    public void setPassword(String password) {
        passwordTextBox.sendKeys(password);
    }
}
