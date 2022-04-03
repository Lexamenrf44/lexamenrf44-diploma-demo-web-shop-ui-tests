package com.tricentis.demowebshop.ui.pages.sections;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComputersSection {

    public ComputersSection checkComputersSectionPage() {
        $("[class='page category-page']").should(appear);
        $("[class='page category-page']").shouldBe(visible);


        return this;
    }

    public ComputersSection checkComputersSectionTitle() {
        $(".page-category .page-title").should(appear);
        $(".page-category .page-title").shouldBe(visible);
        $(".page-category .page-title").shouldHave(text("Computers"));

        return this;
    }

    public ComputersSection checkComputersSectionMainPageSubCategories() {
        $(".page-body .sub-category-grid").should(appear);
        $(".page-body .sub-category-grid").should(visible);
        $$(".item-box").shouldHave(size(3));
        $(".page-body .sub-category-grid .item-box .title [href*='/desktops']").shouldHave(text("Desktops"));
        $(".page-body .sub-category-grid .item-box .title [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".page-body .sub-category-grid .item-box .title [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSection checkComputersSectionLeftSideMenuSubCategories() {
        $(".block-category-navigation .list .active [href*='/computers']").shouldHave(text("Computers"));
        $$(".block-category-navigation .list .sublist .inactive").shouldHave(size(3));
        $(".block-category-navigation .list .sublist .inactive [href*='/desktops']").shouldHave(text("Desktops"));
        $(".block-category-navigation .list .sublist .inactive [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".block-category-navigation .list .sublist .inactive [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSection checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Desktops"));

        return this;
    }

}
