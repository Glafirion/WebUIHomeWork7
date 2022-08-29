package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NovaPage extends BasePage{
    public NovaPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"partial_products_list\"]/div[1]/div/div/div[2]/div[4]/a")
    private WebElement firstCardBook;
    @Step("Choose first card book")

    public void clickFirstCardBook() {
        firstCardBook.click();

    }
}


