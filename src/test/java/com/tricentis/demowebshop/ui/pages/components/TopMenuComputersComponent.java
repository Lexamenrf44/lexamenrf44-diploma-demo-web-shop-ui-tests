package com.tricentis.demowebshop.ui.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TopMenuComputersComponent {

    SelenideElement computersSection = $(".top-menu [href*='/computers']");

    public TopMenuComputersComponent checkTopMenuComputersHoverButton() {
        computersSection.hover();
        $(withText("Desktops")).should(appear);
        $(withText("Notebooks")).should(appear);
        $(withText("Accessories")).should(appear);

        return this;
    }

    public TopMenuComputersComponent goToComputersSection() {
        computersSection.click();

        return this;
    }

    public TopMenuComputersComponent goToDesktopSubCategorySection() {

        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).click();

        return this;
    }

}
