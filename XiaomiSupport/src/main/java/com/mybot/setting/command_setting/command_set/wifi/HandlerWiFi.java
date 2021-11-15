package com.mybot.setting.command_setting.command_set.wifi;

import com.mybot.setting.command_setting.command_set.BaseText;

public class HandlerWiFi extends BaseText {

    @Override
    public void handler(String text){

        switch (text){
            case "Неполадки з підключенням до wi-fi","Неполадки з підключенням до вайфая","Не працює wi-fi","Не працює вайфай", "Не можу підключитися до wi-fi",
                    "Не можу підключитися до вайфая","Проблеми з wi-fi","Проблеми з вайфаєм" -> setText(WiFiText.wifiSteps1);
        }
    }
}
