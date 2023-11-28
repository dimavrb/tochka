#  
<h1 >Демопроект по автоматизации тестирования UI сайта <a href="https://tochka.com/">tochka.com</a></h1>

## :page_with_curl: Содержание 

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Список реализованных проверок</a>

* <a href="#console">Запуск тестов (сборка в Jenkins) и из терминала</a>

* <a href="#allure">Allure-отчет</a>

* <a href="#telegram">Уведомление в Telegram о результатах прогона тестов</a>

* <a href="#video">Видео пример прохождения тестов</a>

<a id="tools"></a>
## Технологии и инструменты


| Java  | IDEA | Github | JUnit 5 | Gradle | Selenide | Selenoid | Allure | Jenkins |
| ----- | ---- | ------ | ------- | ------ | -------- | -------- | ------ | ------- |
|[![](https://github.com/dimavrb/tochka/blob/main/media/logo/Java.svg)](java.com) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Idea.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/GitHub.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Junit5.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Gradle.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Selenide.svg)  | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Allure.svg) | ![](https://github.com/dimavrb/tochka/blob/main/media/logo/Jenkins.svg)  |

<a id="cases"></a>
## Список реализованных проверок

### Авторизация. Проверка ввода неправильного логина/пароля
### Авторизация. Проверка перехода к форме восстановления пароля
### Главная страница. Проверка загрузки главной страницы
### Главная страница. Проверка наличия меню
### Главная страница. Проверка перехода к странице авторизации
### Главная страница. Проверка перехода к форме Оставить заявку

<a id="console"></a>
## Сборка в Jenkins

![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/Jenkins.png)

## Параметры сборки в Jenkins:
- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 100.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)

## Команда для запуска из терминала
`gradle clean test -Denv=remote`

<a id="allure"></a>
## Allure Report 

### Главная страница отчета
![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/AllureReport.png)

### Страница с тест-кейсами

![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/Тест-кейс.png)

<a id="telegram"></a>
## Уведомление в Telegram

![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/telegram.png)

<a id="video"></a>
## Пример видео выполнения теста

![](https://github.com/dimavrb/tochka/blob/main/media/screenshots/test%20case.mp4)

