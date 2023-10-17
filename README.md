# Демопроект по автоматизации тестирования сайта tochka.com


## Содержание

### Технологии и инструменты
### Список проверок, реализованных в тестах
### Запуск тестов (сборка в Jenkins) и из терминала
### Allure-отчет
### Интеграция с Allure TestOps
### Интеграция с Atlassian Jira
### Уведомление в Telegram о результатах прогона тестов
### Видео пример прохождения тестов

## Технологии и инструменты


| Java  | IDEA | Github | JUnit 5 | Gradle | Selenide | Selenoid | Allure | Jenkins |
| ----- | ---- | ------ | ------- | ------ | -------- | -------- | ------ | ------- |
|[![](https://github.com/dimavrb/tochka/blob/main/logo/Java.svg)](java.com) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Idea.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/GitHub.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Junit5.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Gradle.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/logo/Allure.svg) | ![](https://github.com/dimavrb/tochka/blob/main/logo/Jenkins.svg)  |

## Список проверок, реализованных в тестах

### Авторизация. Проверка ввода неправильного логина/пароля
### Авторизация. Проверка перехода к форме восстановления пароля
### Главная страница. Проверка загрузки главной страницы
### Главная страница. Проверка наличия меню
### Главная страница. Проверка перехода к странице авторизации
### Главная страница. Проверка перехода к форме Оставить заявку

## Сборка в Jenkins

![](https://github.com/dimavrb/tochka/blob/main/screenshots/Jenkins.png)

## Параметры сборки в Jenkins:
- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 100.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)

## Команда для запуска из терминала
`gradle clean test -Denv=remote`

## Allure Report 

### Главная страница отчета
![](https://github.com/dimavrb/tochka/blob/main/screenshots/AllureReport.png)

### Страница с тест-кейсами

![](https://github.com/dimavrb/tochka/blob/main/screenshots/Тест-кейс.png)

## Уведомление в Telegram

![](https://github.com/dimavrb/tochka/blob/main/screenshots/telegram.png)

## Пример видео выполнения теста

![](https://github.com/dimavrb/tochka/blob/main/screenshots/test%20case.mp4)

