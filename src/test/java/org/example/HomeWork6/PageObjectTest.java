package org.example.HomeWork6;

import HomeWork6.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import lesson7.AdditionalLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

@Story("Moscow book shop buying story")

@TmsLink("pti")

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDiver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
       driver = new EventFiringDecorator(new AdditionalLogger()).decorate(new ChromeDriver());
       driver.get("https://www.moscowbooks.ru/");
      // driver.findElement(By.className("header__main__gamburger")).click();

      // driver.findElement(By.className("header__top__auth__item__link auth_link_login")).click();
      // WebElement loginForm = driver.findElement(By.id("Email_auth"));
     //  loginForm.sendKeys("Raditest");
      // driver.findElement(By.id("Password")).sendKeys("Plkoijhuyg");
    }

    @Test
    void buyABookTest() throws InterruptedException {
       new MainPage(driver).clickArticlesButton();
       new MainMenuBlock(driver).clickCloseIconButton();
       new NovaPage(driver).clickFirstCardBook();
       new FirstCardBook(driver).clickBasketButton();
       new BuyingButton(driver).checkTotalSumma("1 038");


      Thread.sleep(3000);

    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }


}
