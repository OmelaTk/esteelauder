package testSuites;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.GetScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.LoginPage;

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void startUp(String browser){
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
        driver = BrowserFabric.getDriver(browserType);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenShot.capture(driver,iTestResult.getName());
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
