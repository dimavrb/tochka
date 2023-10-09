package ru.tochka.pages;

import com.codeborne.selenide.logevents.SelenideLogger;
import ru.tochka.config.ConfigReader;
import ru.tochka.config.WebConfig;
import ru.tochka.config.WebConfigProject;
import ru.tochka.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;



public class TestBase {
    private static final WebConfig config = ConfigReader.Instance.read();
    @BeforeAll
    static void beforeAll() {
        WebConfigProject webConfigProject = new WebConfigProject(config);
        webConfigProject.webConfig();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("/");
    }

    @AfterEach
    void addAttach(){
        Attach.screenshotAs("Attach");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWindow();
    }

}