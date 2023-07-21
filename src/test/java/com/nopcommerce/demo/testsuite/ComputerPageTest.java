package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {

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

   @Test(groups ={"sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        computerPage.clickOnComputerTab();
        computerPage.verifyComputersText();
    }

    @Test(groups ={"smoke","Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopLink();
        desktopsPage.verifyDesktopText();
    }

    @Test(dataProvider = "NopCom Test", dataProviderClass = TestData.class, groups = {"smoke", "regression"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software) {

        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopLink();
        desktopsPage.selectProductFromDesktopPage("Build your own computer");
        buildYourOwnComputerPage.selectProcessorFromDropDown(processor);
        buildYourOwnComputerPage.selectRAMFromDropDown(ram);
        buildYourOwnComputerPage.selectHDDRadioButton(hdd);
        buildYourOwnComputerPage.selectOSRadioButton(os);
        buildYourOwnComputerPage.selectSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyProductAddedToCartText();

    }
}

