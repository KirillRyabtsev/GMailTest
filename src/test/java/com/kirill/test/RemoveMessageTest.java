package com.kirill.test;

import com.kirill.driver.WebDriverSingleton;
import com.kirill.element.Element;
import com.kirill.web.page.LoginPage;
import com.kirill.web.page.MailPage;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Acer on 17.07.2018.
 */
public class RemoveMessageTest {

    private static WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();
    MailPage mp = new MailPage();

    @BeforeMethod
    public void createMessage() throws Exception{
        driver.get("https://accounts.google.com/");
        lp.loginAsTestUser();
        Thread.sleep(500);
        driver.get("https://mail.google.com/");
        Thread.sleep(1000);
        mp.clickWriteAMessageButton();
        mp.typeRecipientField("ivan.petrov17325@gmail.com");
        mp.typeMessage("test message");
        mp.clickSendButton();
        mp.clickIncominMessages();
        Thread.sleep(1000);
        mp.logout();
        Thread.sleep(500);
        lp.deleteRememberedUser();
    }

    @Test
    @Description("Удаление сообщения из входящих сообщений")
    @Feature("Удалить сообщение")
    @Story("Сценарий 1 – Удаление сообщения")
    @Severity(SeverityLevel.NORMAL)
    @Flaky
    public void removeMessageTest() throws Exception{
        driver.get("https://accounts.google.com/");
        lp.loginAsTestUser();
        Thread.sleep(500);
        driver.get("https://mail.google.com/");
        Thread.sleep(1000);
        mp.clickPickOutButton();
        mp.clickDeleteMessageButton();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span/span[1]")).getText(),
                            "Цепочка архивирована.");
    }

    @AfterMethod
    public void tearDown() throws Exception{
        mp.logout();
        Thread.sleep(1000);
        lp.deleteRememberedUser();
    }
}
