package ru.tochka.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    public SelenideElement
            callButton = $(by("data-at","CellOffset")),
            phoneInput = $(byName("login")),
            passwordInput = $(byName("password")),
            submitButton = $(".css-cwnra8-button-text"),
            failBanner = $(by("data-at","DAlert/text")),
            recoveryPassButton = $(by("data-at","Typography")),
            bannerRecoveryForm = $(byText("Восстановление доступа"));


    public LoginPage clickSubmitButton(){

        submitButton.click();
        return this;
    }

    public LoginPage setLogin(){

        phoneInput.setValue("89999999999");
        return this;
    }

    public LoginPage setPassword(){

        passwordInput.setValue("111111");
        return this;
    }

    public LoginPage clickRecoveryFormButton(){

        recoveryPassButton.click();
        return this;
    }
}
