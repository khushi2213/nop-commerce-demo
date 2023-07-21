package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerPageText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']")
    WebElement genderRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredErrorText;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthYear;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredErrorText;

    public String verifyRegisterPageText() {
        return getTextFromElement(registerPageText);
    }

    public void selectGender(String text) {
        clickOnElement(genderRadioButton);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameBox, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameBox, lastname);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(monthOfBirthMonth, month);
        selectByVisibleTextFromDropDown(yearOfBirthYear, year);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordBox, confirmpassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyRegistrationCompletedText() {
        return getTextFromElement(registrationCompletedText);
    }

    public String verifyFirstNameRequiredErrorMessageText() {
        return getTextFromElement(firstNameRequiredErrorText);
    }

    public String verifyLastNameRequiredErrorMessageText() {
        return getTextFromElement(lastNameRequiredErrorText);
    }

    public String verifyEmailRequiredErrorMessageText() {
        return getTextFromElement(emailRequiredErrorText);
    }

    public String verifyPasswordRequiredErrorMessageText() {
        return getTextFromElement(passwordRequiredErrorText);
    }
}
