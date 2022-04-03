package com.tricentis.demowebshop.ui.tests;

import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.DemoWebShop;
import com.tricentis.demowebshop.ui.pages.leftsidemenu.LeftSideMenuComputers;
import com.tricentis.demowebshop.ui.pages.topmenu.TopMenuComputers;
import com.tricentis.demowebshop.ui.pages.sections.ComputersSection;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DemoWebShopTopMenuComputersTests extends TestBase {

    DemoWebShop demoWebShop = new DemoWebShop();
    TopMenuComputers topMenuComputers = new TopMenuComputers();
    LeftSideMenuComputers leftSideMenuComputers = new LeftSideMenuComputers();
    ComputersSection computersSection = new ComputersSection();

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("На главной странице, в верхнем панели меню реализовать ховер-кнопку, ведущую на страницу компьютеров")
    @DisplayName("Тестирование отображения ховер-кнопки 'Computers' в верхнем меню")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void computersTopMenuComputersHoverButtonTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Проверка отображения ховера 'Computers'", () -> {
            topMenuComputers.checkTopMenuComputersHoverButton();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("На главной странице, в левой боковой панели категорий реализовать кнопку, ведущую на страницу компьютеров")
    @DisplayName("Тестирование отображения кнопки 'Computers' в левом боковом меню")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void computersCategoryLeftMenuComputersButtonTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Проверка отображения кнопки 'Computers' в боковом меню категорий", () -> {
            leftSideMenuComputers.checkLeftMenuComputersButton();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("Реализовать отдельную страницу для компьютеров")
    @DisplayName("Тестирование отображения страницы 'Computers'")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void computersSectionTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToComputersSection();
        });

        step("Проверка отображения страницы компьютеров", () -> {
            topMenuComputers.checkComputersSectionPage();
        });

        step("Проверка отображения заголовка страницы компьютеров", () -> {
            topMenuComputers.checkComputersSectionTitle();
        });

        step("Проверка отображения подкатегорий на странице компьютеров", () -> {
            topMenuComputers.checkComputersSectionSubCategories();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("Реализовать отдельную страницу для стационарных компьютеров")
    @DisplayName("Тестирование отображения страницы стационарных компьютеров в секции компьютеров")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void computersDesktopsBrowsePageTest() {

        step("Открыть Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToComputersSection();
        });

        step("Перейти на страницу стационарных компьютеров", () -> {
            topMenuComputers.goToDesktopsBrowsePage();
        });

        step("Проверка отображения страницы стационарных компьютеров", () -> {
            topMenuComputers.checkDesktopsSection();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("Реализовать отдельную страницу для ноутбуков")
    @DisplayName("Тестирование отображения страницы ноутбуков в секции компьютеров")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void computersNotebooksBrowsePageTest() {

        step("Открыть Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToComputersSection();
        });

        step("Перейти на страницу ноутбуков", () -> {
            topMenuComputers.goToNotebooksBrowsePage();
        });

        step("Проверка отображения страницы 'Desktops'", () -> {
            topMenuComputers.checkNotebooksSection();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("Реализовать отдельную страницу для аксессуаров")
    @DisplayName("Тестирование отображения страницы аксессуаров в секции компьютеров")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void computersAccessoriesBrowsePageTest() {

        step("Открыть Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToComputersSection();
        });

        step("Перейти на страницу аксессуаров", () -> {
            topMenuComputers.goToAccessoriesBrowsePage();
        });

        step("Проверка отображения страницы аксессуаров", () -> {
            topMenuComputers.checkAccessoriesSection();
        });

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
