package com.tricentis.demowebshop.ui.pages.topmenu;

import com.tricentis.demowebshop.ui.pages.sections.ComputersSection;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TopMenuComputers {

    public TopMenuComputers checkTopMenuComputersHoverButton() {
        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).should(appear);
        $(withText("Notebooks")).should(appear);
        $(withText("Accessories")).should(appear);

        return this;
    }

    public TopMenuComputers goToComputersSection() {

        $(".top-menu [href*='/computers']").click();

        return this;
    }

}
