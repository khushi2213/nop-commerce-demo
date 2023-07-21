package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    SoftAssert softAssert = new SoftAssert();

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
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLoginLink();
        loginPage.getWelcomeText();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("xyz@gmail.com");
        loginPage.enterPassword("123");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage();

    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Khushi122@gmail.com");
        loginPage.enterPassword("Khushi123");
        loginPage.clickOnLoginButton();
      // homePage.verifyLoginLinkIsVisible();

  //      softAssert.assertEquals(homePage.verifyLogOutLinkIsDisplayed(),"Log out","LogOut Link is Display");
   //     softAssert.assertAll();


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessfully() {

        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Khushi122@gmail.com");
        loginPage.enterPassword("Khushi123");
        loginPage.clickOnLoginButton();
    //    homePage.clickOnLogoutLink();
     //   homePage.verifyLogOutLinkIsDisplayed();

    //  softAssert.assertEquals(homePage.verifyLoginLinkIsVisible(),"Log in","LogIn Link is Display");
   //   softAssert.assertAll();


    }
}
