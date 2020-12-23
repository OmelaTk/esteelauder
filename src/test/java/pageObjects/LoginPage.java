package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.GiftsPage;
import pageObjects.SkincarePage;

public class LoginPage extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.esteelauder.com/");
    }

    private WebElement getGifts() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocators.gift)));
        return driver.findElement(By.xpath(LoginPageLocators.gift));
    }

    private WebElement getSkincare() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocators.skincare)));
        return driver.findElement(By.xpath(LoginPageLocators.skincare));
    }

    /**
     * This method will handle pop-up `reward yourself` window if it exist
     */
    public void closeRewardYourself() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#cboxClose")));
        } catch (TimeoutException ignored) {
            return; // Popup window does not exist
        }
        var cboxClose = driver.findElement(By.cssSelector("#cboxClose"));
        cboxClose.click();
    }

    public GiftsPage openGiftPage() {
        for(int i=0; i<5; i++){
            try {
                // Firefox catching ElementClickInterceptedException - this handler will resolve that
                getGifts().click();
                break;
            } catch (ElementClickInterceptedException ignored){

            }
        }

        return new GiftsPage(driver);
    }

    public SkincarePage openSkincarePage() {
        for(int i=0; i<5;i++){
            // Firefox catching ElementClickInterceptedException - this handler will resolve that
            try {
                getSkincare().click();
                break;
            } catch (ElementClickInterceptedException ignored){}

        }

        return new SkincarePage(driver);
    }
}
