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

    @Owner("lexamenrf44")
    @Feature("RegistrationForm")
    @Story("Реализовать страницу регистрации в магазине Demo Web Shop")
    @DisplayName("Тестирование отображения страницы регистрации магазина")
    @Severity(SeverityLevel.NORMAL)
    @Test
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

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать страницу регистрации в магазине Demo Web Shop")
    @DisplayName("Тестирование отображения страницы регистрации магазина")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void registrationEmptyPageSubmitTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });
    }

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать страницу регистрации в магазине Demo Web Shop")
    @DisplayName("Тестирование отображения страницы регистрации магазина")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void registrationGenderSelectTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationFormPage.goToRegistrationPage();
        });

        step("Выбрать пол", () -> {
            registrationFormPage.selectUserGender(FEMALE);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationFormPage.submitUserRegistrationForm();
        });

        step("Проверить поле Имя", () -> {
            registrationFormPage.checkFirstNameField();
        });
    }

}
