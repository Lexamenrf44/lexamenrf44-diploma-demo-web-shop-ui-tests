package com.tricentis.demowebshop.tests;

import com.tricentis.demowebshop.configuration.TestBase;
import com.tricentis.demowebshop.pages.topmenu.computers.Computers;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DemoWebShopComputersTests extends TestBase {

    Computers computers = new Computers();

    @Owner("lexamenrf44")
    @Feature("Computers section")
    @Story("На главной странице, в верхнем панели меню реализовать ховер-кнопку, ведущую на страницу компьютеров")
    @DisplayName("Тестирование отображения ховер-кнопки 'Computers' в верхнем меню")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void computersTopMenuComputersHoverButtonTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            computers.openDemoWebShop();
        });

        step("Проверка отображения ховера 'Computers'", () -> {
            computers.checkTopMenuComputersHoverButton();
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
            computers.openDemoWebShop();
        });

        step("Проверка отображения кнопки 'Computers' в боковом меню категорий", () -> {
            computers.checkLeftMenuComputersButton();
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
            computers.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            computers.goToComputersSection();
        });

        step("Проверка отображения страницы компьютеров", () -> {
            computers.checkComputersSectionPage();
        });

        step("Проверка отображения заголовка страницы компьютеров", () -> {
            computers.checkComputersSectionTitle();
        });

        step("Проверка отображения подкатегорий на странице компьютеров", () -> {
            computers.checkComputersSectionSubCategories();
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
            computers.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            computers.goToComputersSection();
        });

        step("Перейти на страницу стационарных компьютеров", () -> {
            computers.goToDesktopsBrowsePage();
        });

        step("Проверка отображения страницы стационарных компьютеров", () -> {
            computers.checkDesktopsSection();
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
            computers.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            computers.goToComputersSection();
        });

        step("Перейти на страницу ноутбуков", () -> {
            computers.goToNotebooksBrowsePage();
        });

        step("Проверка отображения страницы 'Desktops'", () -> {
            computers.checkNotebooksSection();
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
            computers.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            computers.goToComputersSection();
        });

        step("Перейти на страницу аксессуаров", () -> {
            computers.goToAccessoriesBrowsePage();
        });

        step("Проверка отображения страницы аксессуаров", () -> {
            computers.checkAccessoriesSection();
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
