package com.tricentis.demowebshop.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComputersSectionPage {

    SelenideElement computersSection = $("[class='page category-page']"),
                    computersSectionTitle = $(".category-page .page-title"),
                    computersSectionSubcategoryGrid = $(".page-body .sub-category-grid"),
                    computersSectionDesktopsSubcategory = $(".page-body .sub-category-grid .item-box .title [href*='/desktops']"),
                    computersSectionNotebooksSubcategory = $(".page-body .sub-category-grid .item-box .title [href*='/notebooks']"),
                    computersSectionAccessoriesSubcategory = $(".page-body .sub-category-grid .item-box .title [href*='/accessories']"),
                    leftMenuComputers = $(".block-category-navigation .list .active [href*='/computers']"),
                    desktopsSubmenu = $(".block-category-navigation .list .sublist .inactive [href*='/desktops']"),
                    notebooksSubmenu = $(".block-category-navigation .list .sublist .inactive [href*='/notebooks']"),
                    accessoriesSubmenu = $(".block-category-navigation .list .sublist .inactive [href*='/accessories']"),
                    desktopsSectionTitle = $(".category-page .page-title"),
                    desktopsSectionBody = $(".category-page .page-body"),
                    desktopsSectionProductGrid = $(".page-body .product-grid");

    public ComputersSectionPage checkComputersSectionPage() { computersSection.should(appear).shouldBe(visible);
        return this;
    }

    public ComputersSectionPage checkComputersSectionTitle() { computersSectionTitle.should(appear).shouldBe(visible).shouldHave(text("Computers"));
        return this;
    }

    public ComputersSectionPage checkComputersSectionMainPageSubCategories() {
        computersSectionSubcategoryGrid.should(appear).should(visible);
        $$(".item-box").shouldHave(size(3));
        computersSectionDesktopsSubcategory.should(appear).shouldBe(visible).shouldHave(text("Desktops"));
        computersSectionNotebooksSubcategory.should(appear).shouldBe(visible).shouldHave(text("Notebooks"));
        computersSectionAccessoriesSubcategory.should(appear).shouldBe(visible).shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSectionPage checkComputersSectionLeftSideMenuSubCategories() {
        leftMenuComputers.shouldBe(visible).shouldHave(text("Computers"));
        $$(".block-category-navigation .list .sublist .inactive").shouldHave(size(3));
        desktopsSubmenu.shouldBe(visible).shouldHave(text("Desktops"));
        notebooksSubmenu.shouldBe(visible).shouldHave(text("Notebooks"));
        accessoriesSubmenu.shouldBe(visible).shouldHave(text("Accessories"));

        return this;
    }

    public ComputersSectionPage checkDesktopsSection() {
        desktopsSectionTitle.should(appear).shouldBe(visible).shouldHave(text("Desktops"));
        desktopsSectionBody.should(appear).shouldBe(visible);
        desktopsSectionProductGrid.should(appear).shouldBe(visible);

        return this;
    }

}
