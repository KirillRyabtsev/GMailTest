package com.kirill.test;

import com.kirill.driver.WebDriverSingleton;
import com.kirill.web.page.LoginPage;
import com.kirill.web.page.MailPage;
import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

/**
 * Created by Acer on 17.07.2018.
 */
public class LoginTest {

    private static WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();
    MailPage mp = new MailPage();

    @DataProvider(name = "positive")
    public Object[][] data(){
       return new Object[][]{
               {"ivan.petrov17325@gmail.com", "qoakzm717"},
       };
    }

    @Test(dataProvider = "positive")
    @Description("Вход в почту с помощью логина и пароля")
    @Feature("Войти в почту")
    @Story("Сценарий 1 – Ввод логина и пароля")
    @Severity(SeverityLevel.BLOCKER)
    @Flaky
    public void loginTest(String login, String password) throws Exception{
        driver.get("https://accounts.google.com/");
        lp.typeLogin(login);
        lp.clickNext();
        lp.typePassword(password);
        Thread.sleep(500);
        lp.clickPasswordNext();
        Thread.sleep(500);
        driver.get("https://mail.google.com/");
        mp.clickProfileButton();
        Assert.assertEquals(login , driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div/div[5]/div[2]/div[1]/div/div[2]")).getText());
    }

    @AfterMethod
    public void tearDown() throws Exception{
        mp.clickProfileButton();
        mp.logout();
        Thread.sleep(1000);
        lp.deleteRememberedUser();
    }

}
