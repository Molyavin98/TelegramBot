package com.mybot.setting.command_setting.command_set;

public abstract class BaseText {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void handler(String text){}
}
