package com.tricentis.demowebshop.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage {

    SelenideElement genderRadio = $(".inputs"),
            firstNameInput = $("#FirstName"),
            lastNameInput = $("#LastName"),
            emailInput = $("Email"),
            passwordInput = $("#Password"),
            passwordConfirmInput = $("#ConfirmPassword"),
            registerButton = $(".register-next-step-button");

    public RegistrationFormPage goToRegistrationPage() {

        $(".header-links [href*='/register']").click();

        return this;
    }

    public RegistrationFormPage checkRegistrationPage() {

        $(".registration-page").should(appear);
        $(".registration-page").shouldBe(visible);
        $(".registration-page .page-title").shouldHave(text("Register"));
        $(".registration-page .page-body").should(appear);
        $(".registration-page .page-body").shouldBe(visible);

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
