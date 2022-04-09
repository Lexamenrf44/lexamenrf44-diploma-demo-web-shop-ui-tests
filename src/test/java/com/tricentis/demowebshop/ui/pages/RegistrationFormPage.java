package com.tricentis.demowebshop.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage {

    SelenideElement registrationGoToButton = $(".header-links [href*='/register']"),
            registrationPage = $(".registration-page"),
            registrationPageTitle = $(".registration-page .page-title"),
            registrationPageBody = $(".registration-page .page-body"),
            genderRadio = $(".inputs"),
            firstNameInput = $("#FirstName"),
            lastNameInput = $("#LastName"),
            emailInput = $("Email"),
            passwordInput = $("#Password"),
            passwordConfirmInput = $("#ConfirmPassword"),
            registerButton = $(".register-next-step-button");

    public RegistrationFormPage goToRegistrationPage() { registrationGoToButton.click();
        return this;
    }

    public RegistrationFormPage checkRegistrationPage() {
        registrationPage.should(appear).shouldBe(visible);
        registrationPageTitle.should(appear).shouldBe(visible).shouldHave(text("Register"));
        registrationPageBody.should(appear).shouldBe(visible);

        return this;
    }

    public RegistrationFormPage selectUserGender(String gender) {
        genderRadio.find(byText(gender)).click();

        return this;
    }

    public RegistrationFormPage enterFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage enterLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage enterUserEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationFormPage enterPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public RegistrationFormPage enterConfirmPassword(String password) {
        passwordConfirmInput.setValue(password);

        return this;
    }

    public RegistrationFormPage submitUserRegistrationForm() {
        registerButton.click();

        return this;
    }

    public RegistrationFormPage checkFirstNameField() {
       $("span [for='FirstName']").shouldHave(text("First name is required."));

        return this;
    }
}
