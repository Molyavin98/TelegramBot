package com.mybot.setting.command_setting.command_set.slow_work;

import com.mybot.setting.command_setting.Sms;

public class CommandSlowWork implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = """
                Що у вас сталося?😮 Коротко опишіть
                
               ⚠Приклаж:
               "Повільно працює"
               "Глючить телефон"
               "Лагає пристрій"
               "Тормозить телефон"
                """;
    }
}
