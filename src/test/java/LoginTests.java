import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginTests extends BaseTest {

    /*@Test
    public void loginValidEmailPassword() throws InterruptedException{

        //navigateToPage();
        enterEmail("demo@testpro.io");
        enterPassword("te$t$tudent");
        clickSubmitBtn();
        //WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
        WebElement avatarIcon = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("img[class='avatar']")));
        //WebElement avatarIcon = (WebElement) fluentWait.until(ExpectedConditions.visibilityOfElementLocated
        //        (By.cssSelector("img[class='avatar']")));

        //Expected Result
        Assert.assertTrue(avatarIcon.isDisplayed());
    }*/

    @Test
    public void openUrl() {
        String url = "https://qa.koel.app/";
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    /*@Test(dataProvider = "NegativeLoginTestData", dataProviderClass = TestDataProvider.class)
    public void negativeLoginTests(String email, String password){
        String expectedUrl = "https://qa.koel.app/";

        //Objects
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        //Steps
        loginPage.provideEmail(email);
        loginPage.providePassword(password);
        loginPage.clickSubmitBtn();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }*/

    /*@Test (enabled = false, dataProvider = "incorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void loginEmptyEmailPasswordTest () {
        LoginPage loginPage = new LoginPage(driver);

        String url = "https://qa.koel.app/";
        driver.get(url);
        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickSubmitBtn();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }*/
}
