package com.tricentis.demowebshop.ui.tests;

import com.tricentis.demowebshop.ui.configuration.TestBase;
import com.tricentis.demowebshop.ui.pages.DemoWebShop;
import com.tricentis.demowebshop.ui.pages.leftsidemenu.LeftSideMenuComputers;
import com.tricentis.demowebshop.ui.pages.topmenu.TopMenuComputers;
import com.tricentis.demowebshop.ui.pages.sections.ComputersSection;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class DemoWebShopTopMenuComputersTests extends TestBase {

    DemoWebShop demoWebShop = new DemoWebShop();
    TopMenuComputers topMenuComputers = new TopMenuComputers();
    LeftSideMenuComputers leftSideMenuComputers = new LeftSideMenuComputers();
    ComputersSection computersSection = new ComputersSection();

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("На главной странице, в верхнем панели меню реализовать ховер-кнопку, ведущую на страницу компьютеров")
    @DisplayName("Тестирование отображения ховер-кнопки 'Computers' в верхнем меню")
    @Severity(SeverityLevel.NORMAL)
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
    @Feature("Computers")
    @Story("На главной странице, в левой боковой панели категорий реализовать кнопку, ведущую на страницу компьютеров")
    @DisplayName("Тестирование отображения кнопки 'Computers' в левом боковом меню")
    @Severity(SeverityLevel.NORMAL)
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
    @Feature("Computers")
    @Story("Реализовать отдельную страницу для компьютеров")
    @DisplayName("Тестирование отображения страницы 'Computers'")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void computersSectionTest() {

        step("Открыть сайт Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToComputersSection();
        });

        step("Проверка отображения страницы компьютеров", () -> {
            computersSection.checkComputersSectionPage();
        });

        step("Проверка отображения заголовка страницы компьютеров", () -> {
            computersSection.checkComputersSectionTitle();
        });

        step("Проверка отображения подкатегорий на странице компьютеров", () -> {
            computersSection.checkComputersSectionMainPageSubCategories();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("В левом меню, в категории компьютеры, реализовать подкатегории для секции компьютеров")
    @DisplayName("Тестирование отображения подкатегорий в левом меню в секции компьютеров")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void computersSectionLeftSideMenuSubCategoriesTest() {

        step("Открыть Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            leftSideMenuComputers.goToComputersSection();
        });

        step("Проверка отображения подкатегорий в левом меню на странице компьютеров", () -> {
            computersSection.checkComputersSectionLeftSideMenuSubCategories();
        });

    }

    @Owner("lexamenrf44")
    @Feature("Computers")
    @Story("Реализовать отдельную страницу для стационарных компьютеров")
    @DisplayName("Тестирование отображения страницы стационарных компьютеров в секции компьютеров")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void computersDesktopsBrowsePageTest() {

        step("Открыть Demo Web Shop", () -> {
            demoWebShop.openDemoWebShop();
        });

        step("Перейти на страницу компьютеров", () -> {
            topMenuComputers.goToDesktopSubCategorySection();
        });

        step("Проверка отображения страницы стационарных компьютеров", () -> {
            computersSection.checkDesktopsSection();
        });

    }

}
