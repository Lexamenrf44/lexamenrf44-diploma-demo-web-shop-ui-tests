package com.tricentis.demowebshop.ui.tests;

import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.MainPage;
import com.tricentis.demowebshop.ui.pages.components.LeftSideMenuComponent;
import com.tricentis.demowebshop.ui.pages.components.TopMenuComponent;
import com.tricentis.demowebshop.ui.pages.ComputersSectionPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class DemoWebShopComputersTests extends TestBase {

    MainPage mainPage = new MainPage();
    TopMenuComponent topMenuComponent = new TopMenuComponent();
    LeftSideMenuComponent leftSideMenuComponent = new LeftSideMenuComponent();
    ComputersSectionPage computersSectionPage = new ComputersSectionPage();

    @Test
    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("На главной странице, в верхнем панели меню реализовать ховер-кнопку, ведущую на страницу компьютеров")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отображения ховер-кнопки 'Computers' в верхнем меню")
    void computersTopMenuComputersHoverButtonTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Проверка отображения ховера 'Computers'", () -> {
            topMenuComponent.checkTopMenuComputersHoverButton();
        });

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("На главной странице, в левой боковой панели категорий реализовать кнопку, ведущую на страницу компьютеров")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отображения кнопки 'Computers' в левом боковом меню")
    void computersCategoryLeftMenuComputersButtonTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Проверка отображения кнопки 'Computers' в боковом меню категорий", () -> {
            leftSideMenuComponent.checkLeftMenuComputersButton();
        });

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать отдельную страницу для компьютеров")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Тестирование отображения страницы 'Computers'")
    void computersSectionTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComponent.goToComputersSection();
        });

        step("Проверка отображения страницы компьютеров", () -> {
            computersSectionPage.checkComputersSectionPage();
        });

        step("Проверка отображения заголовка страницы компьютеров", () -> {
            computersSectionPage.checkComputersSectionTitle();
        });

        step("Проверка отображения подкатегорий на странице компьютеров", () -> {
            computersSectionPage.checkComputersSectionMainPageSubCategories();
        });

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("В левом меню, в категории компьютеры, реализовать подкатегории для секции компьютеров")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование отображения подкатегорий в левом меню в секции компьютеров")
    void computersSectionLeftSideMenuSubCategoriesTest() {

        step("Открыть Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            leftSideMenuComponent.goToComputersSection();
        });

        step("Проверка отображения подкатегорий в левом меню на странице компьютеров", () -> {
            computersSectionPage.checkComputersSectionLeftSideMenuSubCategories();
        });

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать отдельную страницу для стационарных компьютеров")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тестирование отображения страницы стационарных компьютеров в секции компьютеров")
    void computersDesktopsBrowsePageTest() {

        step("Открыть Demo Web Shop", () -> {
            mainPage.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComponent.goToDesktopSubCategorySection();
        });

        step("Проверка отображения страницы стационарных компьютеров", () -> {
            computersSectionPage.checkDesktopsSection();
        });

    }

}
