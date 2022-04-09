package com.tricentis.demowebshop.ui.pages.components;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TopMenuComputersComponent {

    public TopMenuComputersComponent checkTopMenuComputersHoverButton() {
        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).should(appear);
        $(withText("Notebooks")).should(appear);
        $(withText("Accessories")).should(appear);

        return this;
    }

    public TopMenuComputersComponent goToComputersSection() {

        $(".top-menu [href*='/computers']").click();

        return this;
    }

    public TopMenuComputersComponent goToDesktopSubCategorySection() {

        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).click();

        return this;
    }

}
