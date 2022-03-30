package com.tricentis.demowebshop.pages.topmenu.computers;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Computers {

    public Computers openDemoWebShop() {

        open((""));

        return this;
    }

    public Computers checkComputersHover() {
        $("[href*='/computers']").hover().should(appear).shouldBe(visible);

        return this;
    }

    public Computers moveToComputersSection() {

        $("[href*='/computers']").click();

        return this;
    }

    public Computers checkComputersSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);;

        return this;
    }

    public Computers moveToDesktopsBrowsePage() {

        $("[alt='Picture for category Desktops']").click();

        return this;
    }

    public Computers checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);;

        return this;
    }

    public Computers moveToNotebooksBrowsePage() {

        $("[alt='Picture for category Notebooks']").click();

        return this;
    }

    public Computers checkNotebooksSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);;

        return this;
    }

    public Computers moveToAccessoriesBrowsePage() {

        $("[alt='Picture for category Accessories']").click();

        return this;
    }

    public Computers checkAccessoriesSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);;

        return this;
    }
}
