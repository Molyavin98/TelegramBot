package com.mybot.setting.command_setting.command_set.battery;

import com.mybot.setting.command_setting.command_set.BaseText;

public class HandlerBattery extends BaseText {

    @Override
    public void handler(String text) {
        switch (text) {
            case "Як доглядати за акумулятором?" -> setText(BatteryText.batterySteps1);
            case "Як економити заряд акумулятора?" -> setText(BatteryText.batterySteps2);
        }
    }
}
