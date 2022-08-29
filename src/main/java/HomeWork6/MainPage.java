package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@class='features__icon icon-tdmosrecom']")
    private WebElement articlesButton;


    public MainPage(WebDriver driver) {
        super(driver);
        mainMenuBlock = new MainMenuBlock(driver);
    }

    public MainMenuBlock mainMenuBlock;

    @Step("Click on articles icon")

    public void clickArticlesButton() {
        articlesButton.click();

    }

}



