package com.mybot.setting.command_setting.command_set.help;

import com.mybot.setting.command_setting.Sms;

public class CommandHelp implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = "Очікуйте будь-ласка, оператор зв'яжеться в найближчий час\uD83E\uDD17";
    }
}
