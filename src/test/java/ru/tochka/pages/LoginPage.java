package ru.tochka.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private final SelenideElement
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
    public LoginPage checkCallButtonVisibility(){
        callButton.shouldBe(Condition.visible);
        return this;
    }

    public LoginPage checkPhoneInputVisibility(){
        phoneInput.shouldBe(Condition.visible);
        return this;
    }
    public LoginPage checkPasswordInputVisibility(){
        passwordInput.shouldBe(Condition.visible);
        return this;
    }

    public LoginPage checkFailBannerVisibility(){
        failBanner.shouldBe(Condition.visible);
        return this;
    }

    public LoginPage checkBannerRecoveryFormVisibility(){
        bannerRecoveryForm.shouldBe(Condition.visible);
        return this;
    }
}
