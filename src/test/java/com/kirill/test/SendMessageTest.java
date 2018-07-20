package com.kirill.test;

import com.kirill.driver.WebDriverSingleton;
import com.kirill.web.page.LoginPage;
import com.kirill.web.page.MailPage;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Acer on 17.07.2018.
 */
public class SendMessageTest {

    private static WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();
    MailPage mp = new MailPage();

    @DataProvider(name = "positive")
    public Object[][] data(){
        return new Object[][]{
                {"ivan.petrov17325@gmail.com", "test message"},
        };
    }

    @Test(dataProvider = "positive")
    @Description("Отправка сообщение самому себе")
    @Feature("Отправить сообщение")
    @Story("Сценарий 1 – Отправка сообщения")
    @Severity(SeverityLevel.CRITICAL)
    @Flaky
    public void sendMessageTest(String recipient, String message) throws Exception{
        driver.get("https://accounts.google.com/");
        lp.loginAsTestUser();
        Thread.sleep(1000);
        driver.get("https://mail.google.com/");
        mp.clickWriteAMessageButton();
        mp.typeRecipientField(recipient);
        mp.typeMessage(message);
        mp.clickSendButton();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class=\"vh\"]")).getText().contains("Письмо отправлено."));
        mp.clickShowMessage();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class=\"go\"]")).getText().contains("ivan.petrov17325@gmail.com"));
    }

    @AfterMethod
    public void deleteMessage() throws Exception{
        //TODO delete message
        mp.logout();
        Thread.sleep(1000);
        lp.deleteRememberedUser();
    }

}
