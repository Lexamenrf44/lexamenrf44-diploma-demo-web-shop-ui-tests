package com.tricentis.demowebshop.pages.topmenu.computers;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Computers {

    public Computers openDemoWebShop() {

        open((""));

        return this;
    }

    public Computers checkTopMenuComputersHover() {
        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).should(appear);
        $(withText("Notebooks")).should(appear);
        $(withText("Accessories")).should(appear);

        return this;
    }

    public Computers checkLeftMenuComputersButton() {
        $(".block-category-navigation [href*='/computers']").should(appear);
        $(".block-category-navigation [href*='/computers']").shouldBe(visible);

        return this;
    }

    public Computers moveToComputersSection() {

        $(".top-menu [href='/computers']").click();

        return this;
    }

    public Computers checkComputersSectionPage() {
        $("[class='page category-page']").should(appear);
        $("[class='page category-page']").should(visible);


        return this;
    }

    public Computers checkComputersSectionTitle() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Computers"));

        return this;
    }

    public Computers checkComputersSectionSubCategories() {
        $("[class='sub-category-grid']").should(appear);
        $("[class='sub-category-grid']").should(visible);

        return this;
    }

    public Computers moveToDesktopsBrowsePage() {

        $("[alt='Picture for category Desktops']").click();

        return this;
    }

    public Computers checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Desktops"));

        return this;
    }

    public Computers moveToNotebooksBrowsePage() {

        $("[alt='Picture for category Notebooks']").click();

        return this;
    }

    public Computers checkNotebooksSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Notebooks"));

        return this;
    }

    public Computers moveToAccessoriesBrowsePage() {

        $("[alt='Picture for category Accessories']").click();

        return this;
    }

    public Computers checkAccessoriesSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Accessories"));

        return this;
    }
}
