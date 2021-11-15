package com.mybot.setting.command_setting.command_set.battery;

import com.mybot.setting.command_setting.Sms;

public class CommandBattery implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = """
                Що вас цікавить?🤗 Коротко опишіть
                
                ⚠Приклад:
                "Як доглядати за акумулятором?"
                "Як економити заряд акумулятора?"
                """;
    }
}
