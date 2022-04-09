package com.tricentis.demowebshop.ui.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TopMenuComponent {

    SelenideElement computersHoverButton = $(".top-menu [href*='/computers']"),
                    hoverDesktops = $(withText("Desktops")),
                    hoverNotebooks = $(withText("Notebooks")),
                    hoverAccessories = $(withText("Accessories"));

    public TopMenuComponent checkTopMenuComputersHoverButton() {
        computersHoverButton.hover();
        hoverDesktops.should(appear).shouldBe(visible).shouldHave(text("Desktops"));
        hoverNotebooks.should(appear).shouldBe(visible).shouldHave(text("Notebooks"));
        hoverAccessories.should(appear).shouldBe(visible).shouldHave(text("Accessories"));

        return this;
    }

    public TopMenuComponent goToComputersSection() {
        computersHoverButton.click();

        return this;
    }

    public TopMenuComponent goToDesktopSubCategorySection() {
        computersHoverButton.hover();
        hoverDesktops.click();

        return this;
    }

}
