package com.kirill.web.page;

import com.kirill.web.element.LoginElement;
import io.qameta.allure.Step;

/**
 * Created by Acer on 18.07.2018.
 */
public class LoginPage {
    @Step("Вводим логин {0}")
    public void typeLogin(String login){ LoginElement.LOGIN_FIELD.type(login); }
    @Step("Нажимаем 'Далее' ")
    public void clickNext(){ LoginElement.NEXT_BUTTON.click(); }
    @Step("Вводим пароль {0}")
    public void typePassword(String password){ LoginElement.PASSWORD_FIELD.type(password); }
    @Step("Нажимаем 'Далее' ")
    public void clickPasswordNext(){ LoginElement.PASSWORD_NEXT_BUTTON.click(); }
    @Step("Нажимаем 'Вернуться' ")
    public void clickBackToAccountList(){ LoginElement.BACK_TO_LIST_BUTTON.click(); }
    @Step("Нажимаем 'Сменить аккаунт' ")
    public void clickChangeAccount(){ LoginElement.CHANGE_ACCOUNT_BUTTON.click(); }
    @Step("Нажимаем 'Удалить аккаунт' ")
    public void clickDeleteAccounts(){ LoginElement.DELETE_ACCOUNTS_BUTTON.click(); }
    @Step("Нажимаем 'Удалить аккаунт' напротив нужного аккаунта")
    public void clickDeleteAccount(){ LoginElement.DELETE_ACCOUNT_BUTTON.click(); }
    @Step("Нажимаем 'Удалить' в подтверждающем окне")
    public void clickApproveDeleting(){ LoginElement.APPROVE_DELETING_BUTTON.click(); }
    @Step("Входим в почту как тестовый пользователь")
    public void loginAsTestUser() throws Exception{
        Thread.sleep(500);
        this.typeLogin("ivan.petrov17325@gmail.com");
        this.clickNext();
        this.typePassword("qoakzm717");
        Thread.sleep(500);
        this.clickPasswordNext();
        Thread.sleep(500);
    }
    @Step("Удаляем ранее залогинившегося пользователя из запомненных аккаунтов")
    public void deleteRememberedUser() throws Exception{
        Thread.sleep(500);
        this.clickBackToAccountList();
        Thread.sleep(500);
        this.clickDeleteAccounts();
        this.clickDeleteAccount();
        this.clickApproveDeleting();
        Thread.sleep(500);
    }



}
