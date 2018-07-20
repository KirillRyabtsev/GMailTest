package com.kirill.web.element;

import com.kirill.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 18.07.2018.
 */
public class MailElement {
    public static final Element PROFILE_BUTTON = new Element("Кнопка профиля", By.xpath("/html/body/div[7]/div[3]/div/div/div[4]/div/div/div/div/div[5]/div/a"));
    public static final Element EXIT_BUTTON = new Element("Кнопка 'Выйти' ", By.xpath("/html/body/div[7]/div[3]/div/div/div[4]/div/div/div/div/div[5]/div[2]/div[4]/div[2]/a"));
    public static final Element WRITE_A_MESSAGE_BUTTON = new Element("Кнопка 'Написать'",By.xpath("//*[@class=\"aic\"]/div/div"));
    public static final Element RECIPIENT_FIELD = new Element("Поле 'Получатели'",By.xpath("//*[@class=\"GS\"]/tbody/tr/td[2]/div/div/textarea"));
    public static final Element MESSAGE_TEXT_FIELD = new Element("Поле сообщения", By.xpath("//*[@class=\"Ar Au\"]/div"));
    public static final Element SEND_BUTTON = new Element("Кнопка 'Отправить'", By.xpath("//*[@class=\"IZ\"]/tbody/tr/td/div/div[2]"));
    public static final Element PICK_OUT_BUTTON = new Element("Кнопка 'Выделить'", By.xpath("//*[@class=\"zA zE\"]/td[2]/div/div"));
    public static final Element DELETE_MESSAGE_BUTTON = new Element("Кнопка 'Удалить'", By.xpath("//*[@class=\"asa\"]"));
    public static final Element INCOMING_MESSAGES_BUTTON = new Element("Кнопка Входящие", By.xpath("//*[@class=\"nU n1\"]/a"));
    public static final Element LOOK_AT_MESSAGE = new Element("Посмотреть сообщение", By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span"));
}
