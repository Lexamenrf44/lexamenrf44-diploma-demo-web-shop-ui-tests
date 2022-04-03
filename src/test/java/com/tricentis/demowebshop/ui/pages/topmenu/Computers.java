package com.tricentis.demowebshop.ui.pages.topmenu;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class Computers {

    public Computers openDemoWebShop() {

        open((""));

        return this;
    }

    public Computers checkTopMenuComputersHoverButton() {
        $(".top-menu [href*='/computers']").hover();
        $(withText("Desktops")).should(appear);
        $(withText("Notebooks")).should(appear);
        $(withText("Accessories")).should(appear);

        return this;
    }

    public Computers goToComputersSection() {

        $(".top-menu [href*='/computers']").click();

        return this;
    }

    public Computers checkComputersSectionPage() {
        $("[class='page category-page']").should(appear);
        $("[class='page category-page']").shouldBe(visible);


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
        $$(".item-box").shouldHave(size(3));
        $(".page-body .sub-category-grid .item-box .title [href*='/desktops']").shouldHave(text("Desktops"));
        $(".page-body .sub-category-grid .item-box .title [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".page-body .sub-category-grid .item-box .title [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public Computers goToDesktopsBrowsePage() {

        $("[alt='Picture for category Desktops']").click();

        return this;
    }

    public Computers checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Desktops"));

        return this;
    }

    public Computers goToNotebooksBrowsePage() {

        $("[alt='Picture for category Notebooks']").click();

        return this;
    }

    public Computers checkNotebooksSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Notebooks"));

        return this;
    }

    public Computers goToAccessoriesBrowsePage() {

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