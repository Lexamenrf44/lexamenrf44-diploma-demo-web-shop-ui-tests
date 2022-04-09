package com.tricentis.demowebshop.ui.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TopMenuComponent {

    SelenideElement topMenuComputersHoverButton = $(".top-menu [href*='/computers']"),
    topMenuComputersHoverDesktopsSubsection = $(withText("Desktops")),
    topMenuComputersHoverNotebooksSubsection = $(withText("Notebooks")),
    topMenuComputersHoverAccessoriesSubsection = $(withText("Accessories"));

    public TopMenuComponent checkTopMenuComputersHoverButton() {
        topMenuComputersHoverButton.hover();
        topMenuComputersHoverDesktopsSubsection.should(appear);
        topMenuComputersHoverNotebooksSubsection.should(appear);
        topMenuComputersHoverAccessoriesSubsection.should(appear);

        return this;
    }

    public TopMenuComponent goToComputersSection() {
        topMenuComputersHoverButton.click();

        return this;
    }

    public TopMenuComponent goToDesktopSubCategorySection() {

        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).click();

        return this;
    }

}
