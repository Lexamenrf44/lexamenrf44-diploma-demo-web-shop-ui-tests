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
            emailInput = $("#Email"),
            passwordInput = $("#Password"),
            passwordConfirmInput = $("#ConfirmPassword"),
            registerButton = $(".register-next-step-button"),
            firstNameErrorMessage = $("span [for='FirstName']"),
            lastNameErrorMessage = $("span [for='LastName']"),
            emailErrorMessage = $("span [for='Email']"),
            passwordErrorMessage = $("span [for='Password']"),
            passwordConfirmErrorMessage = $("span [for='ConfirmPassword']"),
            registrationCompletePage = $(".registration-result-page"),
            registrationCompletePageTitle = $(".registration-result-page .page-title"),
            registrationCompletePageBody = $(".registration-result-page .page-body"),
            registeredUser = $(".header-links [href*='/customer/info']");

    public RegistrationFormPage goToRegistrationPage() { registrationGoToButton.click();
        return this;
    }

    public RegistrationFormPage checkRegistrationPage() {
        registrationPage.should(appear).shouldBe(visible);
        registrationPageTitle.should(appear).shouldBe(visible).shouldHave(text("Register"));
        registrationPageBody.should(appear).shouldBe(visible);

        return this;
    }

    public RegistrationFormPage selectUserGender(String gender) { genderRadio.find(byText(gender)).click();
        return this;
    }

    public RegistrationFormPage enterFirstName(String value) { firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage enterLastName(String value) { lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage enterUserEmail(String email) { emailInput.setValue(email);
        return this;
    }

    public RegistrationFormPage enterPassword(String password) { passwordInput.setValue(password);
        return this;
    }

    public RegistrationFormPage enterConfirmPassword(String password) { passwordConfirmInput.setValue(password);
        return this;
    }

    public RegistrationFormPage enterDifferentConfirmPassword(String confirmPassword) { passwordConfirmInput.setValue(confirmPassword);
        return this;
    }

    public RegistrationFormPage submitUserRegistrationForm() { registerButton.click();
        return this;
    }

    public RegistrationFormPage checkFirstNameField() { firstNameErrorMessage.should(appear).shouldBe(visible).shouldHave(text("First name is required."));
        return this;
    }

    public RegistrationFormPage checkLastNameField() { lastNameErrorMessage.should(appear).shouldBe(visible).shouldHave(text("Last name is required."));
        return this;
    }

    public RegistrationFormPage checkEmailField() { emailErrorMessage.should(appear).shouldBe(visible).shouldHave(text("Email is required."));
        return this;
    }

    public RegistrationFormPage checkPasswordField() { passwordErrorMessage.should(appear).shouldBe(visible).shouldHave(text("Password is required."));
        return this;
    }

    public RegistrationFormPage checkConfirmPasswordField() { passwordConfirmErrorMessage.should(appear).shouldBe(visible).shouldHave(text("Password is required."));
        return this;
    }

    public RegistrationFormPage checkDifferentConfirmPasswordField() { passwordConfirmErrorMessage.should(appear).shouldBe(visible).shouldHave(text("The password and confirmation password do not match."));
        return this;
    }

    public RegistrationFormPage checkSuccessfulRegistration() {
        registrationCompletePage.should(appear).shouldBe(visible);
        registrationCompletePageTitle.should(appear).shouldBe(visible).shouldHave(text("Register"));
        registrationCompletePageBody.should(appear).shouldBe(visible).shouldHave(text("Your registration completed"));

        return this;
    }
    public RegistrationFormPage checkRegistrationEmail(String email) { registeredUser.shouldHave(text(email));
        return this;
    }
}
