package com.kirill.web.element;

import com.kirill.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 18.07.2018.
 */
public class LoginElement {
    public static final Element LOGIN_FIELD = new Element("Поле логина", By.xpath("//*[@id=\"identifierId\"]"));
    public static final Element NEXT_BUTTON = new Element("Кнопка 'Далее'", By.xpath("//*[@id=\"identifierNext\"]"));
    public static final Element PASSWORD_FIELD = new Element("Поле пароля", By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
    public static final Element PASSWORD_NEXT_BUTTON = new Element("Кнопка 'Далее' (пароль)", By.xpath("//*[@id=\"passwordNext\"]"));
    public static final Element BACK_TO_LIST_BUTTON = new Element("Кнопка 'Вернуться' ", By.xpath("//*[@id=\"view_container\"]/div/div/div[1]/content/div/div/div[2]/div"));
    public static final Element CHANGE_ACCOUNT_BUTTON = new Element("Кнопка 'Сменить аккаунт'", By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div/div/ul[1]/li[2]"));
    public static final Element DELETE_ACCOUNTS_BUTTON = new Element("Кнопка Удалить аккаунт", By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div/div/ul[2]/li/button"));
    public static final Element DELETE_ACCOUNT_BUTTON = new Element("Кнопка Удалить аккаунт", By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div/div/ul[1]/li[1]"));
    public static final Element APPROVE_DELETING_BUTTON = new Element("Кнопка Удалить",By.xpath("//*[@id=\"yDmH0d\"]/div[5]/div[2]/div[1]"));
}
