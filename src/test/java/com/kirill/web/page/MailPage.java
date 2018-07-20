package com.kirill.web.page;

import com.kirill.web.element.LoginElement;
import com.kirill.web.element.MailElement;
import io.qameta.allure.Step;

/**
 * Created by Acer on 18.07.2018.
 */
public class MailPage {
    @Step("Нажимаем кнопку профиля")
    public void clickProfileButton(){ MailElement.PROFILE_BUTTON.click(); }
    @Step("Нажимаем кнопку 'Выйти'")
    public void clickExitButton(){MailElement.EXIT_BUTTON.click();}
    @Step("Нажимаем кнопку 'Написать'")
    public void clickWriteAMessageButton(){MailElement.WRITE_A_MESSAGE_BUTTON.click();}
    @Step("Вводим в поле Получатели получателя {0}")
    public void typeRecipientField(String recipient){ MailElement.RECIPIENT_FIELD.type(recipient);}
    @Step("Вводим в поле Текст сообщений сообщение {0}")
    public void typeMessage(String message){ MailElement.MESSAGE_TEXT_FIELD.type(message);}
    @Step("Нажимаем кнопку 'Отправить'")
    public void clickSendButton(){MailElement.SEND_BUTTON.click();}
    @Step("Нажимаем кнопку 'Выделить'")
    public void clickPickOutButton(){MailElement.PICK_OUT_BUTTON.click();}
    @Step("Нажимаем кнопку 'Удалить'")
    public void clickDeleteMessageButton(){MailElement.DELETE_MESSAGE_BUTTON.click();}
    @Step("Нажимаем кнопку 'Входящие'")
    public void clickIncominMessages(){MailElement.INCOMING_MESSAGES_BUTTON.click();}
    @Step("Нажимаем кнопку 'Посмотреть сообщение'")
    public void clickShowMessage(){MailElement.LOOK_AT_MESSAGE.click();}
    @Step("Выходим из почты")
    public void logout() throws Exception{
        Thread.sleep(500);
        this.clickProfileButton();
        this.clickExitButton();
    }
}
