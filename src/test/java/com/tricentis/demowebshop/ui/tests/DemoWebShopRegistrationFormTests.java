package com.tricentis.demowebshop.ui.tests;

import com.github.javafaker.Faker;
import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.MainPage;
import com.tricentis.demowebshop.ui.pages.RegistrationFormPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.tricentis.demowebshop.ui.constants.RegistrationFormConstants.Gender.FEMALE;
import static io.qameta.allure.Allure.step;

public class DemoWebShopRegistrationFormTests extends TestBase {

    MainPage mainPage = new MainPage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String confirmPassword = faker.internet().password();

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать страницу регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отображения страницы регистрации магазина")
    void registrationPageTest() {

        step("Открыть Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Проверка отображения формы регистрации Demo Web Shop", () -> {
            registrationFormPage.checkRegistrationPage();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки незаполненной формы регистрации нового пользователя")
    void registrationEmptyFormSubmitTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkFirstNameField()
                                .checkLastNameField()
                                .checkEmailField()
                                .checkPasswordField()
                                .checkConfirmPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки полностью заполненной формы регистрации нового пользователя")
    void registrationFilledFormSubmitTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Выбрать пол", () -> {
            registrationFormPage.selectUserGender(FEMALE);
        });

        step("Заполнить поле First Name", () -> {
            registrationFormPage.enterFirstName(firstName);
        });

        step("Заполнить поле Last Name", () -> {
            registrationFormPage.enterLastName(lastName);
        });

        step("Заполнить поле Email", () -> {
            registrationFormPage.enterUserEmail(email);
        });

        step("Заполнить поле Password", () -> {
            registrationFormPage.enterPassword(password);
        });

        step("Заполнить поле Confirm Password", () -> {
            registrationFormPage.enterConfirmPassword(password);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка формы успешной регистрации нового пользователя", () -> {
            registrationFormPage.checkSuccessfulRegistration();
        });

        step("Проверка формы нового пользователя", () -> {
            registrationFormPage.checkRegisteredUserLogin(email);
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки формы регистрации нового пользователя с заполненным полем First Name")
    void registrationFirstNameFieldFilledOnlyTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Заполнить поле First Name", () -> {
            registrationFormPage.enterFirstName(firstName);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkLastNameField()
                    .checkEmailField()
                    .checkPasswordField()
                    .checkConfirmPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки формы регистрации нового пользователя с заполненным полем Last Name")
    void registrationLastNameFieldFilledOnlyTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Заполнить поле Last Name", () -> {
            registrationFormPage.enterLastName(lastName);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkFirstNameField()
                    .checkEmailField()
                    .checkPasswordField()
                    .checkConfirmPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки формы регистрации нового пользователя с заполненным полем Email")
    void registrationEmailFieldFilledOnlyTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Заполнить поле Email", () -> {
            registrationFormPage.enterUserEmail(email);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkFirstNameField()
                    .checkLastNameField()
                    .checkPasswordField()
                    .checkConfirmPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки формы регистрации нового пользователя с заполненным полем Password")
    void registrationPasswordFieldFilledOnlyTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Заполнить поле Email", () -> {
            registrationFormPage.enterPassword(password);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkFirstNameField()
                    .checkLastNameField()
                    .checkEmailField()
                    .checkConfirmPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки формы регистрации нового пользователя с заполненным полем Confirm Password")
    void registrationConfirmPasswordFieldFilledOnlyTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Заполнить поле Email", () -> {
            registrationFormPage.enterConfirmPassword(password);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkFirstNameField()
                    .checkLastNameField()
                    .checkEmailField()
                    .checkPasswordField();
        });
    }

    @Test
    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать функционал регистрации новых пользователей в магазине Demo Web Shop")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отправки заполненной формы регистрации нового пользователя с разными паролями")
    void registrationDifferentPasswordsFilledTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Выбрать пол", () -> {
            registrationFormPage.selectUserGender(FEMALE);
        });

        step("Заполнить поле First Name", () -> {
            registrationFormPage.enterFirstName(firstName);
        });

        step("Заполнить поле Last Name", () -> {
            registrationFormPage.enterLastName(lastName);
        });

        step("Заполнить поле Email", () -> {
            registrationFormPage.enterUserEmail(email);
        });

        step("Заполнить поле Password", () -> {
            registrationFormPage.enterPassword(password);
        });

        step("Заполнить поле Confirm Password", () -> {
            registrationFormPage.enterDifferentConfirmPassword(confirmPassword);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверка заполненной формы", () -> {
            registrationFormPage.checkDifferentConfirmPasswordField();
        });

    }

}
