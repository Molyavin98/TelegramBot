package com.mybot.setting.command_setting.command_set.system_memory;

import com.mybot.setting.command_setting.command_set.BaseText;

public class HandlerSystemMemory extends BaseText {

    public void handler(String text){

        switch (text) {
            case "Як вилучити фотографії" -> setText(SystemMemoryCommandText.systemMemorySteps1);
            case "Як вилучити додатки та їх дані" -> setText(SystemMemoryCommandText.systemMemorySteps2);
        }
    }
}
