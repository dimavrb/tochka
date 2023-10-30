package ru.tochka.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainPageLogo = $(".header_header__container__JNNVt"),
    mainPageMenuRegistration = $("header").$(byText("Регистрация бизнеса")),
    mainPageMenuBank = $("header").$(byText("Банк")),
    mainPageMenuService = $("header").$(byText("Сервисы")),
    mainPageMenuAbout = $("header").$(byText("О нас")),
    loginButton = $("header").$(byText("Войти")),
    applicationFormButton = $(".wrapper").$(byText("Стать клиентом")),
    applicationForm = $(".widget__link widget__link--1");


    public MainPage clickLoginButton(){

        loginButton.click();
        return this;
    }

    public MainPage goToApplicationForm(){

        applicationFormButton.click();
        return this;
    }
    public MainPage checkLogoVisibility(){
        mainPageLogo.shouldBe(Condition.visible);
        return this;
    }
    public MainPage checkMenuRegistrationVisibility(){
        mainPageMenuRegistration.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkMenuBankVisibility(){
        mainPageMenuBank.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkMenuServiceVisibility(){
        mainPageMenuService.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkMenuAboutVisibility(){
        mainPageMenuAbout.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkApplicationFormVisibility(){
        applicationForm.shouldBe(Condition.visible);
        return this;
    }

}