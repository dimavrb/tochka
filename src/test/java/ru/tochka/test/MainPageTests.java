package ru.tochka.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.tochka.pages.MainPage;
import ru.tochka.pages.TestBase;
import ru.tochka.pages.LoginPage;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Tag("Smoke")
    @DisplayName("Проверка загрузки главной страницы")
    public void loadMainPage() {

        step("Проверка логотипа на главной странице", () ->assertTrue(mainPage.mainPageLogo.isDisplayed()));

    }


    @Test
    @Tag("Regress")
    @DisplayName("Проверка наличия меню")
    public void goToAppicationForm() {

        step("Проверка раскрывающегося меню Регистрация бизнеса", () ->assertTrue(mainPage.mainPageMenuRegistration.isDisplayed()));
        step("Проверка раскрывающегося меню Банк", () ->assertTrue(mainPage.mainPageMenuBank.isDisplayed()));
        step("Проверка раскрывающегося Сервисы", () ->assertTrue(mainPage.mainPageMenuService.isDisplayed()));
        step("Проверка раскрывающегося О нас", () ->assertTrue(mainPage.mainPageMenuAbout.isDisplayed()));
    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к странице авторизации")
    public void goToLoginPage() {

        step("Нажатие кнопки Войти", () ->mainPage.clickLoginButton());
        step("Проверка кнопки Связаться", () ->assertTrue(loginPage.callButton.isDisplayed()));
        step("Проверка поля ввода номера телефона", () ->assertTrue(loginPage.phoneInput.isDisplayed()));
        step("Проверка поля ввода пароля", () ->assertTrue(loginPage.passwordInput.isDisplayed()));

    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к форме Оставить заявку")
    public void goToRegistrationForm() {

        step("Переход к форме регистрации", () ->mainPage.goToApplicationForm());
        step("Проверка отображения формы регистрации", () ->assertTrue(mainPage.applicationForm.isDisplayed()));
    }


}
