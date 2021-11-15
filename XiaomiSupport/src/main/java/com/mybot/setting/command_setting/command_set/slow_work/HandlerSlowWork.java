package com.mybot.setting.command_setting.command_set.slow_work;

import com.mybot.setting.command_setting.command_set.BaseText;

public class HandlerSlowWork extends BaseText {

    @Override
    public void handler(String text) {

        switch (text) {
            case "Повільно працює", "Глючить тедефон", "Лагає пристрій", "Тормозить телефон" -> setText(SlowWorkText.slowWorkSteps1);
        }
    }
}
