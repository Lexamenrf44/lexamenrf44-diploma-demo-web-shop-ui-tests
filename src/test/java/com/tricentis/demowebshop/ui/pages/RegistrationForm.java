package com.tricentis.demowebshop.ui.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {

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

}
