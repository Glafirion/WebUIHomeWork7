package HomeWork6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyingButton extends BasePage{
    public BuyingButton(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[@id='cart_total_cost']")
    private WebElement totalSumma;

    @Step("Check total summa in basket")

    public void checkTotalSumma(String expectedSumma) {
        Assertions.assertEquals(expectedSumma, totalSumma.getText());

    }


}
