package com.mybot.setting.command_setting.command_set.wifi;

import com.mybot.setting.command_setting.Sms;

public class CommandWiFi implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = """
                Що у вас сталося?😮 Коротко опишіть вашу проблему
                
                ⚠Приклад:
                
                "Неполадки з підключенням до wi-fi(вайфая)"
                "Не працює wi-fi(вайфай)"
                "Не можу підключитися до wi-fi(вайфая)"
                "Проблеми з wi-fi(вайфаєм)"
                """;
    }
}
