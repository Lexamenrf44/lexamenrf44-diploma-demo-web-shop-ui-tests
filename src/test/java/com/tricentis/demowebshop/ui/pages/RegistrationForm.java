package com.tricentis.demowebshop.ui.pages;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {

    public RegistrationForm goToRegistrationPage() {

        $(".header-links [href*='/register']").click();

        return this;
    }
}
