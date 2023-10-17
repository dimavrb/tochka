package ru.tochka.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.tochka.pages.MainPage;
import ru.tochka.pages.TestBase;
import ru.tochka.pages.LoginPage;


import static io.qameta.allure.Allure.step;
@DisplayName("Тесты главной страницы")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Tag("Smoke")
    @DisplayName("Проверка загрузки главной страницы")
    public void loadMainPage() {

        step("Проверка логотипа на главной странице", () ->mainPage.mainPageLogo.shouldBe(Condition.visible));

    }


    @Test
    @Tag("Regress")
    @DisplayName("Проверка наличия меню")
    public void goToAppicationForm() {

        step("Проверка раскрывающегося меню Регистрация бизнеса", () ->mainPage.mainPageMenuRegistration.shouldBe(Condition.visible));
        step("Проверка раскрывающегося меню Банк", () ->mainPage.mainPageMenuBank.shouldBe(Condition.visible));
        step("Проверка раскрывающегося Сервисы", () ->mainPage.mainPageMenuService.shouldBe(Condition.visible));
        step("Проверка раскрывающегося О нас", () ->mainPage.mainPageMenuAbout.shouldBe(Condition.visible));
    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к странице авторизации")
    public void goToLoginPage() {

        step("Нажатие кнопки Войти", () ->mainPage.clickLoginButton());
        step("Проверка кнопки Связаться", () ->loginPage.callButton.shouldBe(Condition.visible));
        step("Проверка поля ввода номера телефона", () ->loginPage.phoneInput.shouldBe(Condition.visible));
        step("Проверка поля ввода пароля", () ->loginPage.passwordInput.shouldBe(Condition.visible));

    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к форме Оставить заявку")
    public void goToRegistrationForm() {

        step("Переход к форме регистрации", () ->mainPage.goToApplicationForm());
        step("Проверка отображения формы регистрации", () ->mainPage.applicationForm.shouldBe(Condition.visible));
    }


}
