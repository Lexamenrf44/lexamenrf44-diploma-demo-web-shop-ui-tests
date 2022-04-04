package com.tricentis.demowebshop.ui.tests;

import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.DemoWebShop;
import com.tricentis.demowebshop.ui.pages.RegistrationForm;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class DemoWebShopRegistrationTests extends TestBase {

    DemoWebShop demoWebShop = new DemoWebShop();
    RegistrationForm registrationForm = new RegistrationForm();

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать страницу регистрации в магазине Demo Web Shop")
    @DisplayName("Тестирование отображения страницы регистрации магазина")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void registrationPageTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Переход на форму регистрации Demo Web Shop", () -> {
            registrationForm.goToRegistrationPage();
        });
    }

}
