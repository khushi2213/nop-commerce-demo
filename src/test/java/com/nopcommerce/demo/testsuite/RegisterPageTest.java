package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
        computerPage = new ComputerPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterPageText();
    }

    @Test(groups = {"smoke", "regression"})
    public void  verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){

        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.verifyFirstNameRequiredErrorMessageText();
        registerPage.verifyLastNameRequiredErrorMessageText();
        registerPage.verifyEmailRequiredErrorMessageText();
        registerPage.verifyPasswordRequiredErrorMessageText();

    }


    @Test(groups = {"smoke","sanity","regression"})
    public void  VerifyThatUserShouldCreateAccountSuccessfully(){

        homePage.clickOnRegisterLink();
        registerPage.selectGender("Female");
        registerPage.enterFirstName("Khushi");
        registerPage.enterLastName("Pandey");
        registerPage.selectDateOfBirth("22","November","1991");
        loginPage.enterEmailId("Khushi122@gmail.com");
        loginPage.enterPassword("Khushi123");
        registerPage.enterConfirmPassword("Khushi123");
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationCompletedText();

    }

}