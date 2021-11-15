package com.mybot.setting;

import com.mybot.setting.button.CategoryButton;
import com.mybot.setting.command_setting.CommandProcessing;
import com.mybot.setting.command_setting.command_set.another_question.HandlerAnotherQuestion;
import com.mybot.setting.command_setting.command_set.battery.HandlerBattery;
import com.mybot.setting.command_setting.command_set.bluetooth.HandlerBluetooth;
import com.mybot.setting.command_setting.command_set.help.HandlerHelp;
import com.mybot.setting.command_setting.command_set.slow_work.HandlerSlowWork;
import com.mybot.setting.command_setting.command_set.system_memory.HandlerSystemMemory;
import com.mybot.setting.command_setting.command_set.wifi.HandlerWiFi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramBotSetting extends TelegramLongPollingBot {

    CommandProcessing commandProcessing = new CommandProcessing();
    CategoryButton categoryButton = new CategoryButton();

    //handlers
    HandlerBluetooth handlerBluetooth = new HandlerBluetooth();
    HandlerSystemMemory handlerSystemMemory = new HandlerSystemMemory();
    HandlerSlowWork handlerSlowWork = new HandlerSlowWork();
    HandlerBattery handlerBattery = new HandlerBattery();
    HandlerWiFi handlerWiFi = new HandlerWiFi();

    //Handler help
    HandlerHelp help = new HandlerHelp();
    HandlerAnotherQuestion handlerAnotherQuestion = new HandlerAnotherQuestion();

    public void sendMsg(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            categoryButton.categoryButton(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    //Process management
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();

        if (update.hasMessage()) {

            //Main send
            commandProcessing.setTextSms(message.getText());
            commandProcessing.processing();
            sendMsg(message, commandProcessing.getCommandText());
            commandProcessing.setCommandText("");

            //Bluetooth
            handlerBluetooth.handler(message.getText());
            sendMsg(message, handlerBluetooth.getText());
            handlerBluetooth.setText("");

            //System Memory
            handlerSystemMemory.handler(message.getText());
            sendMsg(message, handlerSystemMemory.getText());
            handlerSystemMemory.setText("");

            //SlowWork
            handlerSlowWork.handler(message.getText());
            sendMsg(message, handlerSlowWork.getText());
            handlerSlowWork.setText("");

            //Battery
            handlerBattery.handler(message.getText());
            sendMsg(message, handlerBattery.getText());
            handlerBattery.setText("");

            //Wi-fi
            handlerWiFi.handler(message.getText());
            sendMsg(message, handlerWiFi.getText());
            handlerWiFi.setText("");

            //help
            if (message.getText().equals("Запросити допомогу оператора\uD83D\uDCDE")) {
                help.handler(update);
                help.writeToFile();
            }
            //Another Question
            if (message.getText().contains("?") && message.getText().length() > 6) {
                handlerAnotherQuestion.handler(update);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "XiaomiSupport_24_bot";
    }

    @Override
    public String getBotToken() {
        return "2057718029:AAG81RwzHmnEmzeOZUvmRRU2fmC8pNilL48";
    }
}
