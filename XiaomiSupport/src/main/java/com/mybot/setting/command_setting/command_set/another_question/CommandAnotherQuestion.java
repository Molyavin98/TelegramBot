package com.mybot.setting.command_setting.command_set.another_question;

import com.mybot.setting.command_setting.Sms;

public class CommandAnotherQuestion implements Sms {

    public static String text;

    @Override
    public void sendSms() {

        text = """
                Оу\uD83D\uDE2F, цікаво...
                
                📍Логіка наступна:
               
                Надсилай повідомлення зі знаком "❓"
                """;
    }
}
