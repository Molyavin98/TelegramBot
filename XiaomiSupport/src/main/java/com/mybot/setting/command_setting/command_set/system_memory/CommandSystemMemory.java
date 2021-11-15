package com.mybot.setting.command_setting.command_set.system_memory;

import com.mybot.setting.command_setting.Sms;

public class CommandSystemMemory implements Sms {

    public static String text;

    @Override
    public void sendSms() {

        text = """
                Що у вас сталось?😮 Коротко опишіть
                
                ⚠Приклад:
                "Як вилучити фотографії"
                "Як вилучити додатки та їх дані"
                """;
    }
}
