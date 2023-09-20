package ru.tochka.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    public SelenideElement
            callButton = $(by("data-at","IconPlus")),
            phoneInput = $(by("data-at","CellOffset")),
            passwordInput = $(by("data-at","PassInput"));
}
