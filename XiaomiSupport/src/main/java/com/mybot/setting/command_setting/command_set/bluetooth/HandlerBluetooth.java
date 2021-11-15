package com.mybot.setting.command_setting.command_set.bluetooth;

import com.mybot.setting.command_setting.command_set.BaseText;

public class HandlerBluetooth extends BaseText {

    @Override
    public void handler(String text) {

        switch (text) {
            case "Не вдається підключитися до автомобіля" -> setText(BluetoothText.bluetoothSteps1);
            case "Не вдається підключити аксесуар" -> setText(BluetoothText.bluetoothSteps2);
            case "Не чути музику" -> setText(BluetoothText.bluetoothSteps3);
            case "Не вдається здійснювати та приймати виклики" -> setText(BluetoothText.bluetoothSteps4);
        }
    }
}
