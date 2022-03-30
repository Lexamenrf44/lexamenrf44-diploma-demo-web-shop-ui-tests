package com.tricentis.demowebshop.tests;

import com.tricentis.demowebshop.configuration.TestBase;
import com.tricentis.demowebshop.pages.topmenu.computers.Computers;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DemoWebShopTopMenuTests extends TestBase {

    Computers computers = new Computers();

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("Проверить секцию 'Computers'")
    @DisplayName("Тестирование секции 'Computers'")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void basicTest() {

        step("Открыть Demo Web Shop", () -> {
            computers.openDemoWebShop();
        });

        step("Перейти в раздел 'Computers'", () -> {
            computers.moveToComputersSection();
        });

        step("Проверка отображения секции 'Computers'", () -> {
            computers.checkComputersSection();
        });

    }

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
