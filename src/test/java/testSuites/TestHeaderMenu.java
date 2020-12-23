package testSuites;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
public class TestHeaderMenu extends BaseTest {

    @Test
    public void openGiftsPage_GiftsPageOpened() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.closeRewardYourself();
        var girtsPage = loginPage.openGiftPage();
        Assert.assertTrue(girtsPage.isGiftsPage());

    }
    @Test
    public void openSkincarePage_SkincarePageOpened() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.closeRewardYourself();
        var skinCarePage = loginPage.openSkincarePage();
        Assert.assertTrue(skinCarePage.isSkinCarePage());

    }
}
