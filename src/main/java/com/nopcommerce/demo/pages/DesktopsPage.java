package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    public DesktopsPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProductFromDesktopPage;

    public String verifyDesktopText(){
        return getTextFromElement(desktopText);
    }

    public void selectProductFromDesktopPage(String product) {
        clickOnElement(selectProductFromDesktopPage);

    }
}
