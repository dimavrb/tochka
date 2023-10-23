package ru.tochka.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.tochka.pages.LoginPage;
import ru.tochka.pages.MainPage;


import static io.qameta.allure.Allure.step;
@DisplayName("Тесты страницы авторизации")
public class LoginPageTests extends TestBase {


    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    @Test
    @Tag("Smoke")
    @Tag("Regress")
    @DisplayName("Проверка ввода неправильного логина/пароля")
    public void failAuth() {

        step("Переход к странице авторизации", () ->mainPage.clickLoginButton());
        step("Ввод логина", () ->(loginPage.setLogin()));
        step("Ввод пароля", () ->(loginPage.setPassword()));
        step("Нажатие кнопки входа", () ->loginPage.clickSubmitButton());
        step("Проверка баннера о неверных данных", () ->loginPage.checkFailBannerVisibility());

    }
    @Test
    @Tag("Smoke")
    @Tag("Regress")
    @DisplayName("Проверка перехода к форме восстановления пароля")
    public void checkRecoveryForm() {

        step("Переход к странице авторизации", () ->mainPage.clickLoginButton());
        step("Нажатие кнопки восстановлния пароля", () ->(loginPage.clickRecoveryFormButton()));
        step("Проверка открытия формы восстановления пароля", () ->loginPage.checkBannerRecoveryFormVisibility());

    }


}