package com.tricentis.demowebshop.ui.configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import com.tricentis.demowebshop.ui.helpers.AllureReportAttachments;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class TestBase {

    @BeforeAll
    public static void browserOpeningConfiguration() {

        Configuration.baseUrl = "http://demowebshop.tricentis.com/";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "99");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");

        String remoteUrl = System.getProperty("remoteUrl");
        String user = Credentials.config.user();
        String password = Credentials.config.password();
        Configuration.remote = format("https://%s:%s@%s", user, password, remoteUrl);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach(){
        open("");
    }

    @AfterEach
    void addAttachments() {

        AllureReportAttachments.screenshotAs("Last screenshot");
        AllureReportAttachments.pageSource();
        AllureReportAttachments.browserConsoleLogs();
        AllureReportAttachments.addVideo();
        closeWebDriver();

    }

}
