package com.tricentis.demowebshop.ui.pages.leftsidemenu;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ComputersCategory {

    public ComputersCategory checkLeftMenuComputersButton() {
        $(".block-category-navigation [href*='/computers']").should(appear);
        $(".block-category-navigation [href*='/computers']").shouldBe(visible);

        return this;
    }

}
