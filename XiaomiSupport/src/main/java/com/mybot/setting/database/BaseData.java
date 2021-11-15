package com.mybot.setting.database;

import org.telegram.telegrambots.api.objects.Update;

public abstract class BaseData {

    private String firstName;
    private String userName;
    private String allText;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAllText() {
        return allText;
    }

    public void setAllText(String allText) {
        this.allText = allText;
    }

    public void handler(Update update){}

    public void data(){}

    public void writeToFile(){}
}
