import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class LoginTests extends BaseTest {
    @Test
    public void positiveLoginTest(){
        String expectedUrl = "https://qa.koel.app/";

        //Objects
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        //Steps
        loginPage.provideEmail("carlitos@testpro.io");
        loginPage.providePassword("vjNWk4Hn");
        loginPage.clickSubmitBtn();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void negativeLoginTest(){
        String expectedUrl = "https://qa.koel.app/";

        //Objects
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        //Steps
        loginPage.provideEmail("invalid@testpro.io");
        loginPage.providePassword("invalidPassword");
        loginPage.clickSubmitBtn();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
