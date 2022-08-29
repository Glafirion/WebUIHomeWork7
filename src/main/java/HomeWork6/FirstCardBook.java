package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstCardBook extends BasePage{
    public FirstCardBook(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='header__main__basket__block']")
    private WebElement basketButton;

    @Step("Basket icon click")

    public void clickBasketButton() {
        basketButton.click();

    }

}
