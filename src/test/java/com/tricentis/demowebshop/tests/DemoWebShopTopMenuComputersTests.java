package com.tricentis.demowebshop.tests;

import com.tricentis.demowebshop.configuration.TestBase;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DemoWebShopTopMenuComputersTests extends TestBase {

    @Test
    void computersHoverTest() {

        open((""));
        $("[href*='/computers']").hover().should(appear).shouldBe(visible);

    }

    @Test
    void computersNotebooksBrowsePageTest() {

        open((""));
        $("[href*='/computers']").click();
        $("[alt='Picture for category Notebooks']").click();
        $("[class='page-title']").should(appear);
        $("[class='page-title']").shouldBe(visible);

    }

    @Test
    void computersDesktopsProductTest() {

        open((""));
        $("[href*='/computers']").hover();
        $("[href*='/desktops']").click();
        $("[class='product-grid']").should(appear);
        $("[class='product-grid']").shouldBe(visible);
    }


}
