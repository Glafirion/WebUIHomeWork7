package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuBlock extends BasePage{


    public MainMenuBlock(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[3]//a[1]//div[1]")
    public WebElement fifteenBookButton;

    @Step("Choose icon 15 famous book")

    public void clickCloseIconButton() {
        fifteenBookButton.click();

    }
}
