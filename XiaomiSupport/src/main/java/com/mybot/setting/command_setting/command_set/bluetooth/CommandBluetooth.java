package com.mybot.setting.command_setting.command_set.bluetooth;

import com.mybot.setting.command_setting.Sms;

public class CommandBluetooth implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = """
               Що у вас сталося?😮
               
               ⚠Приклад:
               "Не вдається підключитися до автомобіля"
               "Не вдається підключити аксесуар"
               "Не чути музику"
               "Не вдається здійснювати та приймати виклики"
                 """;
    }
}
