package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GiftsPage extends BasePage{
    public GiftsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isGiftsPage(){
        try {
            wait.until(ExpectedConditions.titleIs("Holiday Beauty Gifts: Skincare & Makeup Presents | Estée Lauder"));
            return true;
        } catch (TimeoutException ignored){
            return false;
        }
    }
}
