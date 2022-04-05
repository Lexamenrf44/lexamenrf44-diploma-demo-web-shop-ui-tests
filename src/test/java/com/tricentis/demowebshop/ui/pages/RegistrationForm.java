package com.tricentis.demowebshop.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {

    SelenideElement genderRadio = $("#genterWrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            passwordInput = $("#userNumber"),
            registerButton = $(".register-next-step-button");

    public RegistrationForm goToRegistrationPage() {

        $(".header-links [href*='/register']").click();

        return this;
    }

    public RegistrationForm checkRegistrationPage() {

        $(".registration-page").should(appear);
        $(".registration-page").shouldBe(visible);
        $(".registration-page .page-title").shouldHave(text("Register"));
        $(".registration-page .page-body").should(appear);
        $(".registration-page .page-body").shouldBe(visible);

        return this;
    }

    public RegistrationForm selectUserGender(String gender) {
        genderRadio.find(byText(gender)).click();

        return this;
    }

    public RegistrationForm enterFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationForm enterLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationForm enterUserEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationForm enterPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public RegistrationForm enterConfirmPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public RegistrationForm submitUserRegistrationForm() {
        registerButton.click();

        return this;
    }
}
