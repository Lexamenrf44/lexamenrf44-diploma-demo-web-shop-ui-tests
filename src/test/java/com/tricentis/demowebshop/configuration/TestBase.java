package com.tricentis.demowebshop.configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import com.tricentis.demowebshop.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    @BeforeAll
    public static void browserOpeningConfiguration() {

        Configuration.baseUrl = "http://demowebshop.tricentis.com/";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "91");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");

        /*
        String remoteUrl = System.getProperty("remoteUrl");
        String user = System.getProperty("user");
        String password = System.getProperty("password");
        Configuration.remote = "https://" + user + ":" + password + "@" + remoteUrl;
         */

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach(){
        open("");
        visualizeMouseClick();
    }

    @AfterEach
    void addAttachments() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();

    }

    public void visualizeMouseClick(){
        executeJavaScript("function onClick(event) {\n" +
                "        var e = event || window.event;\n" +
                "        var target = e.target || e.srcElement;\n" +
                "        target.style['box-sizing'] = 'border-box';\n" +
                "        target.style['border'] = '2px solid green';\n" +
                "      }\n" +
                "    \n" +
                "      document.addEventListener('click', onClick);");
    }

}
