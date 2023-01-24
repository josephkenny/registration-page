package com.webstaurantstore.registrationpage.test;

import com.webstaurantstore.registrationpage.pages.WebstaurantStoreHomePage;
import com.webstaurantstore.registrationpage.pages.WebstaurantStoreRegistrationPage;
import org.testng.annotations.Test;

public class WebstaurantStoreRegistrationTest extends WebstaurantStoreTestBase {

    @Test
    public void fillOutRegistrationPage() {
        WebstaurantStoreHomePage webstaurantStoreHomePage = new WebstaurantStoreHomePage(driver);
        WebstaurantStoreRegistrationPage webstaurantStoreRegistrationPage = webstaurantStoreHomePage.clickRegisterButton();
        webstaurantStoreRegistrationPage.setEmail("example@email.com");
        webstaurantStoreRegistrationPage.setName("John Doe");
        webstaurantStoreRegistrationPage.setCompany("XYZ Corporation");
        webstaurantStoreRegistrationPage.setCompanyType("Restaurant - Chain");
        webstaurantStoreRegistrationPage.setBillingAddress("123 Main St.");
        webstaurantStoreRegistrationPage.setZipCode("12345");
        webstaurantStoreRegistrationPage.setPhoneNumber("555-555-555");
        webstaurantStoreRegistrationPage.setPassword("password");
    }
}
