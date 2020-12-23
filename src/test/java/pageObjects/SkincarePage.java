package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SkincarePage extends BasePage{
    public SkincarePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSkinCarePage() {
        try {
            wait.until(ExpectedConditions.titleIs("Estée Lauder Skincare | Shop Serum, Moisturizer, Cleanser & More"));
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }
}
