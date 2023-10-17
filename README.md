# Демопроект по автоматизации тестирования сайта tochka.com


## Содержание

- [Технологии и инструменты](#Технологии-и-инструменты)
- [Примеры автоматизированных тест-кейсов](#Примеры-автоматизированных-тест-кейсов)
- [Сборка в Jenkins](#Сборка-в-Jenkins)
- [Allure отчет](#Allure-отчет)
- [Уведомление в Telegram при помощи бота](#Уведомление-в-Telegram-при-помощи-бота)
- [Примеры видео выполнения тестов на Selenoid](#Примеры-видео-выполнения-тестов-на-Selenoid)



## Технологии и инструменты

| Java  | IDEA | Github | JUnit 5 | Gradle | Selenide | Selenoid | Allure | Jenkins |
| ----- | ---- | ------ | ------- | ------ | -------- | -------- | ------ | ------- |
|[![](https://github.com/dimavrb/tochka/blob/main/logo/Java.svg)](java.com) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Idea.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/GitHub.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Junit5.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Gradle.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Allure.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Jenkins.svg)  |

____
## Примеры автоматизированных тест-кейсов

-  Авторизация. Проверка ввода неправильного логина/пароля
-  Авторизация. Проверка перехода к форме восстановления пароля
-  Главная страница. Проверка загрузки главной страницы
-  Главная страница. Проверка наличия меню
-  Главная страница. Проверка перехода к странице авторизации
-  Главная страница. Проверка перехода к форме Оставить заявку
____

## Сборка в Jenkins

![](https://github.com/dimavrb/tochka/blob/main/screenshots/Jenkins.png)


### Команда для запуска с использованием Selenide
`gradle clean test -Denv=remote`

### Команда для локального запуска
`gradle clean test -Denv=local`
## Allure отчет

### Главная страница отчета
![](https://github.com/dimavrb/tochka/blob/main/screenshots/AllureReport.png)

### Страница с тест-кейсами

![](https://github.com/dimavrb/tochka/blob/main/screenshots/Тест-кейс.png)

## Уведомление в Telegram при помощи бота

![](https://github.com/dimavrb/tochka/blob/main/screenshots/telegram.png)

## Примеры видео выполнения тестов на Selenoid

![](https://github.com/dimavrb/tochka/blob/main/screenshots/testcase.gif)


