package com.tricentis.demowebshop.ui.tests;

import com.github.javafaker.Faker;
import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.DemoWebShop;
import com.tricentis.demowebshop.ui.pages.RegistrationForm;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.tricentis.demowebshop.ui.constants.RegistrationFormConstants.Gender.FEMALE;
import static com.tricentis.demowebshop.ui.constants.RegistrationFormConstants.Gender.MALE;
import static io.qameta.allure.Allure.step;

public class DemoWebShopRegistrationTests extends TestBase {

    DemoWebShop demoWebShop = new DemoWebShop();
    RegistrationForm registrationForm = new RegistrationForm();

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
            demoWebShop.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationForm.goToRegistrationPage();
        });

        step("Проверка отображения формы регистрации Demo Web Shop", () -> {
            registrationForm.checkRegistrationPage();
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
            demoWebShop.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationForm.goToRegistrationPage();
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationForm.submitUserRegistrationForm();
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
            demoWebShop.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationForm.goToRegistrationPage();
        });

        step("Выбрать пол", () -> {
            registrationForm.selectUserGender(FEMALE);
        });

        step("Отправить форму регистрации пользователя", () -> {
            registrationForm.submitUserRegistrationForm();
        });

        step("Проверить поле Имя", () -> {
            registrationForm.checkFirstNameField();
        });
    }

}
