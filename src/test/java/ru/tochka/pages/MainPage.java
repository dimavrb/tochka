package ru.tochka.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainPageLogo = $(".header_header__container__JNNVt"),
    mainPageMenuRegistration = $(byText("Регистрация бизнеса")),
    mainPageMenuBank = $(byText("Банк")),
    mainPageMenuService = $(byText("Сервисы")),
    mainPageMenuAbout = $(byText("О нас")),
    loginButton = $(byText("Войти")),
    applicationFormButton = $(byText("Стать клиентом")),
    applicationForm = $(byText("Пора открывать счёт"));



    public MainPage clickLoginButton(){

        loginButton.click();
        return this;
    }

    public MainPage goToApplicationForm(){

        applicationFormButton.click();
        return this;
    }

}