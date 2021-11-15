package com.mybot.setting.command_setting.command_set.start;

import com.mybot.setting.command_setting.Sms;

public class CommandStart implements Sms {

    public static String text;

    @Override
    public void sendSms() {
        text = """
                \uD83D\uDC4B Вітаємо!

                Це офіційний чат-бот підтримки Xiaomi
                Якщо у вас виникло питання, звернення, ми просимо вас користуватися категоріями

                \uD83D\uDCCDЛогіка бота наступна:

                1️⃣ Бот просить вибрати категорію вашого звернення;
                2️⃣ Після вибору категорії, вам надаються приклади проблем;
                3️⃣ Задаєте питання ботові;
                4️⃣ Якщо проблема залишається не виконаною, натискайте на кнопку "Запросити допомогу оператора", який зможе дати розгорнуту відповідь в особисте повідомлення""";
    }
}
