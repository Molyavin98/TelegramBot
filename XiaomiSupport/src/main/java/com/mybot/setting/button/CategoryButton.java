package com.mybot.setting.button;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.exceptions.TelegramApiValidationException;

import java.util.ArrayList;
import java.util.List;

public class CategoryButton {

    public void categoryButton(SendMessage sendMessage){

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardList = new ArrayList<>();
        KeyboardRow keyboard1 = new KeyboardRow();
        KeyboardRow keyboard2 = new KeyboardRow();
        KeyboardRow keyboard3 = new KeyboardRow();
        KeyboardRow keyboard4 = new KeyboardRow();
        KeyboardRow keyboard5 = new KeyboardRow();
        KeyboardRow keyboard6 = new KeyboardRow();
        KeyboardRow keyboard7 = new KeyboardRow();
        KeyboardRow keyboard8 = new KeyboardRow();

        keyboard1.add(new KeyboardButton("Wi-Fi\uD83D\uDCE1"));
        keyboard2.add(new KeyboardButton("Bluetooth\uD83D\uDD35"));
        keyboard3.add(new KeyboardButton("Акумулятор\uD83D\uDD0B"));
        keyboard4.add(new KeyboardButton("Як вирішити проблему з повільною роботою телефона⏱"));
        keyboard5.add(new KeyboardButton("Як звільнити місце\uD83D\uDDD1"));
        keyboard6.add(new KeyboardButton("Як відновити заводські налаштування на пристрої Android⚙"));
        keyboard7.add(new KeyboardButton("Запросити допомогу оператора\uD83D\uDCDE"));
        keyboard8.add(new KeyboardButton("Інше питання✏"));

        keyboardList.add(keyboard1);
        keyboardList.add(keyboard2);
        keyboardList.add(keyboard3);
        keyboardList.add(keyboard4);
        keyboardList.add(keyboard5);
        keyboardList.add(keyboard6);
        keyboardList.add(keyboard7);
        keyboardList.add(keyboard8);

        replyKeyboardMarkup.setKeyboard(keyboardList);
    }
}

