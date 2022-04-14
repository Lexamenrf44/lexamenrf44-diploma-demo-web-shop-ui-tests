package com.tricentis.demowebshop.api.tests;

import io.qameta.allure.*;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;
import static com.tricentis.demowebshop.api.helpers.CustomAllureListener.withCustomTemplates;

public class DemoWebShopAddToTests {

    @BeforeAll
    static void setup() {
        RestAssured.filters(withCustomTemplates());

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("AddToCart")
    @Story("Реализовать API добавления продукта в корзину")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тестирование API добавления продукта в корзину с cookies")
    void addProductToCartWithCookiesTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .cookie("Nop.customer=5deec30d-08d1-4581-8663-de9fc037eddb;")
                .body("product_attribute_74_5_26=81" +
                        "&product_attribute_74_6_27=83" +
                        "&product_attribute_74_3_28=86" +
                        "&addtocart_74.EnteredQuantity=1")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/74/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your " +
                        "<a href=\"/cart\">shopping cart</a>"));

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("AddToCart")
    @Story("Реализовать API добавления продукта в корзину")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тестирование API добавления продукта в корзину без cookies")
    void addProductToCartWithoutCookiesTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_attribute_74_5_26=81" +
                        "&product_attribute_74_6_27=83" +
                        "&product_attribute_74_3_28=86" +
                        "&addtocart_74.EnteredQuantity=1")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/74/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your " +
                        "<a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"));

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("AddToWishlist")
    @Story("Реализовать API добавления продукта в список желаемого")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тестирование API добавления продукта в список желаемого с cookies")
    void addProductToWishlistWithCookiesTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .cookie("Nop.customer=5deec30d-08d1-4581-8663-de9fc037eddb;")
                .body("product_attribute_71_9_15=45" +
                        "&product_attribute_71_10_16=10" +
                        "&product_attribute_71_11_17=51" +
                        "&addtocart_71.EnteredQuantity=1")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/71/2")
                .then()
                .log().all()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your " +
                        "<a href=\"/wishlist\">wishlist</a>"));

    }

    @Test
    @Owner("lexamenrf44")
    @Feature("AddToWishlist")
    @Story("Реализовать API добавления продукта в список желаемого")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тестирование API добавления продукта в список желаемого без cookies")
    void addProductToWishlistWithoutCookiesTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_attribute_71_9_15=45" +
                        "&product_attribute_71_10_16=10" +
                        "&product_attribute_71_11_17=51" +
                        "&addtocart_71.EnteredQuantity=1")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/71/2")
                .then()
                .log().all()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your " +
                        "<a href=\"/wishlist\">wishlist</a>"))
                .body("updatetopwishlistsectionhtml", is("(1)"));

    }

}
