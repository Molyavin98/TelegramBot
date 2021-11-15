package com.mybot.setting.command_setting.command_set.another_question;

import com.mybot.setting.database.BaseData;
import org.telegram.telegrambots.api.objects.Update;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class HandlerAnotherQuestion extends BaseData {

    private String questionText;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public void handler(Update update) {
        setQuestionText(update.getMessage().getText());
        setFirstName(update.getMessage().getChat().getFirstName());
        setUserName(update.getMessage().getChat().getUserName());

        data();
        writeToFile();
    }

    @Override
    public void data() {
        String date = LocalDate.now().getDayOfMonth() + "-" + LocalDate.now().getMonth() + "|" + LocalDate.now().getYear();
        String time = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond();
        setAllText("Question: " + getQuestionText() + "\n" + "FirstName: " + getFirstName() + "\nUserName: @" + getUserName() + "\n" + "Date: " + date + "\nTime: " + time + "\n\n");
    }

    @Override
    public void writeToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/XiaomiSupport/src/main/java/com/mybot/setting/database/QuestionDataBase.txt", true);
            fileOutputStream.write(getAllText().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
