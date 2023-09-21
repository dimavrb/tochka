package ru.tochka.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.tochka.pages.LoginPage;
import ru.tochka.pages.MainPage;
import ru.tochka.pages.TestBase;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTests extends TestBase {


    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    @Test
    @Tag("Smoke")
    @DisplayName("Проверка ввода неправильного логина/пароля")
    public void failAuth() {

        step("Переход к странице авторизации", () ->mainPage.clickLoginButton());
        step("Ввод логина", () ->(loginPage.setLogin()));
        step("Ввод пароля", () ->(loginPage.setPassword()));
        step("Нажатие кнопки входа", () ->loginPage.clickSubmitButton());
        step("Проверка баннера о неверных данных", () ->assertTrue(loginPage.failBanner.exists()));

    }
    @Test
    @Tag("Smoke")
    @DisplayName("Проверка перехода к форме восстановления пароля")
    public void checkRecoveryForm() {

        step("Переход к странице авторизации", () ->mainPage.clickLoginButton());
        step("Нажатие кнопки восстановлния пароля", () ->(loginPage.clickRecoveryFormButton()));
        step("Проверка открытия формы восстановления пароля", () ->assertTrue(loginPage.bannerRecoveryForm.exists()));

    }


}
