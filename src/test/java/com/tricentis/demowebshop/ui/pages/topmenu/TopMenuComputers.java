package com.tricentis.demowebshop.ui.pages.topmenu;

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

    public TopMenuComputers goToDesktopsBrowsePage() {

        $("[alt='Picture for category Desktops']").click();

        return this;
    }

    public TopMenuComputers checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Desktops"));

        return this;
    }

    public TopMenuComputers goToNotebooksBrowsePage() {

        $("[alt='Picture for category Notebooks']").click();

        return this;
    }

    public TopMenuComputers checkNotebooksSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Notebooks"));

        return this;
    }

    public TopMenuComputers goToAccessoriesBrowsePage() {

        $("[alt='Picture for category Accessories']").click();

        return this;
    }

    public TopMenuComputers checkAccessoriesSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Accessories"));

        return this;
    }
}
