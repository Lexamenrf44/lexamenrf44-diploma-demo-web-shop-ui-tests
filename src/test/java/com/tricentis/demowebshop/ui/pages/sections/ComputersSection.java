package com.tricentis.demowebshop.ui.pages.sections;

import com.tricentis.demowebshop.ui.pages.topmenu.TopMenuComputers;

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

    public ComputersSection checkComputersSectionSubCategories() {
        $(".page-body .sub-category-grid").should(appear);
        $(".page-body .sub-category-grid").should(visible);
        $$(".item-box").shouldHave(size(3));
        $(".page-body .sub-category-grid .item-box .title [href*='/desktops']").shouldHave(text("Desktops"));
        $(".page-body .sub-category-grid .item-box .title [href*='/notebooks']").shouldHave(text("Notebooks"));
        $(".page-body .sub-category-grid .item-box .title [href*='/accessories']").shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSection goToDesktopsBrowsePage() {

        $("[alt='Picture for category Desktops']").click();

        return this;
    }

    public ComputersSection checkDesktopsSection() {
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);
        $("[class='page-title']").shouldHave(text("Desktops"));

        return this;
    }

}
