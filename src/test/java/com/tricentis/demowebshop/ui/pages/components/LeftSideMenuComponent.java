package com.tricentis.demowebshop.ui.pages.components;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LeftSideMenuComponent {

    public LeftSideMenuComponent checkLeftMenuComputersButton() {
        $(".block-category-navigation [href*='/computers']").should(appear);
        $(".block-category-navigation [href*='/computers']").shouldBe(visible);
        $(".block-category-navigation [href*='/computers']").shouldHave(text("Computers"));

        return this;
    }

    public LeftSideMenuComponent goToComputersSection() {
        $(".block-category-navigation .list [href*='/computers']").click();

        return this;
    }

}
