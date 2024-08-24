import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyTelegramBot extends TelegramLongPollingBot {

    private final String BOOT_NAME;

    private final String BOOT_TOKEN;

    private String url = "https://api.nasa.gov/planetary/apod?api_key=jEcMf89LzCfOcQtC0lFMQJINZ62wU2YRmCTxycoa";


    public MyTelegramBot(String BOOT_NAME, String BOOT_TOKEN) {
        this.BOOT_NAME = BOOT_NAME;
        this.BOOT_TOKEN = BOOT_TOKEN;
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(this);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            String [] messageTextArray = messageText.split(" ");
            long chatId = update.getMessage().getChatId();
            switch (messageTextArray[0]) {
                case "/help" -> sendMessenger(chatId, "Я чат-бот, отправляющий фото дня с сайта NASA.\n" +
                        "Отправить фото текущего дня: /start или /image.\n" +
                        "Отправить фото другого дня: /date ГГГГ-ММ-ДД");
                case "/start", "/image" -> sendMessenger(chatId, UtilsTelegramBot.urlImage(url));
                case "/date" -> sendMessenger(chatId, UtilsTelegramBot.urlImage(url + "&date=" + messageTextArray[1]));
                default -> sendMessenger(chatId, "Я не знаю такой команды");
            }
        }
    }

    public void sendMessenger(long chatId, String messageText) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));
        sendMessage.setText(messageText);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return BOOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOOT_TOKEN;
    }
}
