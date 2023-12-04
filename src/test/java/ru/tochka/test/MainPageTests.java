package ru.tochka.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.tochka.pages.MainPage;
import ru.tochka.pages.LoginPage;


import static io.qameta.allure.Allure.step;
@DisplayName("Тесты главной страницы")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Tag("Smoke")
    @Tag("Regress")
    @DisplayName("Проверка загрузки главной страницы")
    public void loadMainPage() {

        step("Проверка логотипа на главной странице", () ->mainPage.checkLogoVisibility());

    }


    @ParameterizedTest(name = "{displayName} [{0}]")
    @Tag("Regress")
    @CsvSource(value =
            {"Проверка раскрывающегося меню Регистрация бизнеса, mainPage.checkMenuRegistrationVisibility()",
            "Проверка раскрывающегося меню Банк, mainPage.checkMenuBankVisibility())",
            "Проверка раскрывающегося Сервисы, mainPage.checkMenuServiceVisibility()",
            "Проверка раскрывающегося О нас, mainPage.checkMenuAboutVisibility())"
            })
    @DisplayName("Проверка наличия меню ")
    public void goToApplicationForm(String name, String element) {
        step(name, () ->element);
    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к странице авторизации")
    public void goToLoginPage() {

        step("Нажатие кнопки Войти", () ->mainPage.clickLoginButton());
        step("Проверка кнопки Связаться", () ->loginPage.checkCallButtonVisibility());
        step("Проверка поля ввода номера телефона", () ->loginPage.checkPhoneInputVisibility());
        step("Проверка поля ввода пароля", () ->loginPage.checkPasswordInputVisibility());

    }

    @Test
    @Tag("Regress")
    @DisplayName("Проверка перехода к форме Оставить заявку. Тест специально фейлится, из-за появления окна с акцией")
    public void goToRegistrationForm() {

        step("Переход к форме регистрации", () ->mainPage.goToApplicationForm());
        step("Проверка отображения формы регистрации.", () ->mainPage.checkApplicationFormVisibility());
    }


}
