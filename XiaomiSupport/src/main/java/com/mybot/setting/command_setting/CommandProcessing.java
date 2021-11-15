package com.mybot.setting.command_setting;

import com.mybot.setting.command_setting.command_set.another_question.CommandAnotherQuestion;
import com.mybot.setting.command_setting.command_set.battery.CommandBattery;
import com.mybot.setting.command_setting.command_set.bluetooth.CommandBluetooth;
import com.mybot.setting.command_setting.command_set.factory_settings.CommandFactorySettings;
import com.mybot.setting.command_setting.command_set.help.CommandHelp;
import com.mybot.setting.command_setting.command_set.slow_work.CommandSlowWork;
import com.mybot.setting.command_setting.command_set.start.CommandStart;
import com.mybot.setting.command_setting.command_set.system_memory.CommandSystemMemory;
import com.mybot.setting.command_setting.command_set.wifi.CommandWiFi;

public class CommandProcessing {

    ProcessSms processSms = new ProcessSms();

    private String textSms;
    private String commandText;

    public String getTextSms() {
        return textSms;
    }

    public void setTextSms(String textSms) {
        this.textSms = textSms;
    }

    public String getCommandText() {
        return commandText;
    }

    public void setCommandText(String commandText) {
        this.commandText = commandText;
    }

    public void processing() {

        switch (getTextSms()) {
            case "/start" -> {
                processSms.setSms(new CommandStart());
                processSms.sendSms();
                setCommandText(CommandStart.text);
            }
            case "Wi-Fi\uD83D\uDCE1" -> {
                processSms.setSms(new CommandWiFi());
                processSms.sendSms();
                setCommandText(CommandWiFi.text);
            }
            case "Bluetooth\uD83D\uDD35" -> {
                processSms.setSms(new CommandBluetooth());
                processSms.sendSms();
                setCommandText(CommandBluetooth.text);
            }
            case "Як звільнити місце\uD83D\uDDD1" -> {
                processSms.setSms(new CommandSystemMemory());
                processSms.sendSms();
                setCommandText(CommandSystemMemory.text);
            }
            case "Як вирішити проблему з повільною роботою телефона⏱" -> {
                processSms.setSms(new CommandSlowWork());
                processSms.sendSms();
                setCommandText(CommandSlowWork.text);
            }
            case "Акумулятор\uD83D\uDD0B" -> {
                processSms.setSms(new CommandBattery());
                processSms.sendSms();
                setCommandText(CommandBattery.text);
            }
            case "Як відновити заводські налаштування на пристрої Android⚙" -> {
                processSms.setSms(new CommandFactorySettings());
                processSms.sendSms();
                setCommandText(CommandFactorySettings.text);
            }
            case "Запросити допомогу оператора\uD83D\uDCDE" -> {
                processSms.setSms(new CommandHelp());
                processSms.sendSms();
                setCommandText(CommandHelp.text);
            }
            case "Інше питання✏" -> {
                processSms.setSms(new CommandAnotherQuestion());
                processSms.sendSms();
                setCommandText(CommandAnotherQuestion.text);
            }
            default -> {
                if (getTextSms().contains("?")) {
                    if (getTextSms().length() < 6) {
                        setCommandText("Таке собі питання\uD83E\uDD71");
                    } else {
                        setCommandText("""
                                Оу, гарне питання...🤔
                                                                
                                Запишу його📝
                                Очікуй відповідь😎, якщо питання коректне)️
                                """);
                    }
                }
                if (getTextSms().length() < 6 && !getTextSms().contains("?")) {
                    setCommandText("Шкода, але я тебе не розумію\uD83D\uDE2D");
                }
                if (getTextSms().contains("!") && !getTextSms().contains("?")) {
                    setCommandText("""
                            Воу, що я вам зробив?\uD83D\uDE41
                                                        
                            Залиште своє питання зі знаком "❓"
                            і я спробую вирішити вашу проблему👌""");
                }
            }
        }
    }
}
