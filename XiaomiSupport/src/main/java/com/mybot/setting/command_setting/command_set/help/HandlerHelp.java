package com.mybot.setting.command_setting.command_set.help;

import com.mybot.setting.database.BaseData;
import org.telegram.telegrambots.api.objects.Update;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class HandlerHelp extends BaseData {

    @Override
    public void handler(Update update) {
        if (update.getMessage().getText().equals("Запросити допомогу оператора"))
            setFirstName(update.getMessage().getChat().getFirstName());
        setUserName(update.getMessage().getChat().getUserName());
    }

    @Override
    public void data() {
        String date = LocalDate.now().getDayOfMonth()+"-"+LocalDate.now().getMonth()+"|"+LocalDate.now().getYear();
        String time = LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
        setAllText("FirstName: "+getFirstName()+"\nUserName: @"+getUserName()+"\n"+"Date: "+date+"\nTime: "+time+"\n\n");
    }

    @Override
    public void writeToFile() {
        data();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/XiaomiSupport/src/main/java/com/mybot/setting/database/DataBaseUserInfo.txt", true);
            fileOutputStream.write(getAllText().getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
