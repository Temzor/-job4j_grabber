[![codecov](https://codecov.io/gh/Temzor/job4j_grabber/branch/temzor/graph/badge.svg?token=jhCpwXsgLh)](https://codecov.io/gh/Temzor/job4j_grabber)

### Описание:
Приложение парсит Java-вакансии с сайта sql.ru в базу данных PostgreSql.
На данный момент сделано ограничение в парсинге первых 5 страниц раздела вакансии https://www.sql.ru/forum/job-offers, чтоб не засорять базу данных устаревшими вакансиями.
В проект можно добавить новые сайты без изменения кода.
В проекте можно сделать параллельный парсинг сайтов.
Система запускается с периодизацей. Параметры бд и периодизации указываются в файле app.properties.
Реализован вывод списка сохранённых вакансий в базу через браузер.
Доступ к интерфейсу через REST API.

### Технологии:
* Maven, Travis (заменён на GitHub Actions), Jacoco, Checkstyle
* JDBC для коннекта к БД.
* Jsoup для парсинга сайтов.
* Quartz для запуска приложения с периодичностью.
* Приложение собирается в jar.
 
Проект состоит из:
Интерфейс Store - хранилище, отвечает за хранение вакансий. 
PsqlStore -  сохраняет вакансии в базу данных PostgreSQL. 
Post - модель данных для вакансии.
Интерфейс Parse - отвечает за парсинг вакансий с какого-либо ресурса и преобразование их в модель данных Post. 
В данном проекте на данный момент есть лишь одна рабочая реализация: SqlRuParse - которая реализует парсинг вакансий с сайта sql.ru
Grabber  - объединяет все части приложения, инициализирует все необходимые объекты и запускает парсинг. 
Внутри использует библиотеку Quartz для периодизации работы.

### Тесты
Написаны модульные тесты, а так же интеграционные тесты с применением технологии Liquibase