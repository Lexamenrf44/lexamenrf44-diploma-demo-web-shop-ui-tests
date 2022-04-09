package com.tricentis.demowebshop.ui.pages;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComputersSectionPage {

    public ComputersSectionPage checkComputersSectionPage() {
        $("[class='page category-page']").should(appear);
        $("[class='page category-page']").shouldBe(visible);


        return this;
    }

    public ComputersSectionPage checkComputersSectionTitle() {
        $(".category-page .page-title").should(appear);
        $(".category-page .page-title").shouldBe(visible);
        $(".category-page .page-title").shouldHave(text("Computers"));

        return this;
    }

    public ComputersSectionPage checkComputersSectionMainPageSubCategories() {
        $(".page-body .sub-category-grid").should(appear);
        $(".page-body .sub-category-grid").should(visible);
        $$(".item-box").shouldHave(size(3));
        $(".page-body .sub-category-grid .item-box .title [href*='/desktops']").shouldHave(text("Desktops"));
        $(".page-body .sub-category-grid .item-box .title [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".page-body .sub-category-grid .item-box .title [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSectionPage checkComputersSectionLeftSideMenuSubCategories() {
        $(".block-category-navigation .list .active [href*='/computers']").shouldHave(text("Computers"));
        $$(".block-category-navigation .list .sublist .inactive").shouldHave(size(3));
        $(".block-category-navigation .list .sublist .inactive [href*='/desktops']").shouldHave(text("Desktops"));
        $(".block-category-navigation .list .sublist .inactive [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".block-category-navigation .list .sublist .inactive [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSectionPage checkDesktopsSection() {
        $(".category-page .page-title").should(appear);
        $(".category-page .page-title").shouldBe(visible);
        $(".category-page .page-title").shouldHave(text("Desktops"));
        $(".category-page .page-body").should(appear);
        $(".category-page .page-body").shouldBe(visible);
        $(".page-body .product-grid").should(appear);
        $(".page-body .product-grid").shouldBe(visible);

        return this;
    }

}
