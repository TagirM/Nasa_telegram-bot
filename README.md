# NASA Telegram Bot

## Описание
Этот проект представляет собой Telegram-бота, который предоставляет пользователям фотографии дня или любой указанной даты 
с сайта NASA. Бот использует API NASA для получения изображений и текстовой информации о них.

## Структура проекта
Проект состоит из четырех основных классов:

1. **Main**: Главный класс, который запускает бота и инициализирует его с именем и токеном.
2. **MyTelegramBot**: Класс, наследующий `TelegramLongPollingBot`, обрабатывающий команды от пользователей и возвращающий 
соответствующие изображения.
3. **NasaAnswer**: Модель данных для парсинга ответа от NASA API с использованием библиотеки Jackson.
4. **UtilsTelegramBot**: Утилитарный класс для работы с API NASA, обеспечивающий получение URL изображения.

## Установка
1. Убедитесь, что у вас установлена Java и все необходимые библиотеки, включая Jackson и Telegram Bot API.
2. Скачайте или клонируйте этот репозиторий.
3. Настройте свой токен Telegram-бота, заменив значения в классе `Main`.

## Запуск
Чтобы запустить бота, выполните класс `Main`. Бот будет слушать сообщения в Telegram и реагировать на команды.

## Доступные команды
- `/help`: Показывает справочную информацию о командах бота.
- `/start` или `/image`: Получает изображение дня.
- `/date ГГГГ-ММ-ДД`: Получает изображение на указанную дату.

## Примеры использования
После запуска бота, пользователи могут отправить следующие команды:
- **/start** - бот отправит изображение дня.
- **/date 2023-10-01** - бот отправит изображение за 1 октября 2023 года.