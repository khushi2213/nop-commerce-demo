package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement selectOperatingSystem;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement selectSoftwareCheckBoxes;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[contains(.,'The product has been added to your shopping cart')]")
    WebElement productAddedToCartText;


    public void selectProcessorFromDropDown(String processor) {
        selectByVisibleTextFromDropDown(selectProcessor, processor);
    }

    public void selectRAMFromDropDown(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
    }

    public void selectHDDRadioButton(String hdd) {
        clickOnElement(selectHdd);
    }

    public void selectOSRadioButton(String os) {
        clickOnElement(selectOperatingSystem);
    }

    public void selectSoftwareCheckBox(String software) {
        clickOnElement(selectSoftwareCheckBoxes);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String verifyProductAddedToCartText() {
        return getTextFromElement(productAddedToCartText);
    }

}
