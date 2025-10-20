package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage{

    //locators
    By violetTheme = By.xpath("//div[@data-testid='theme-card-violet']");

    By isVioletThemeSelected = By.xpath("//div[@data-testid='theme-card-violet' and contains(@class,'selected')]");

    public ProfilePage(WebDriver givenDriver) {
        super(givenDriver);
    }


    public ProfilePage chooseVioletTheme() {
        click(violetTheme);
        return this;
    }

    public boolean isVioletThemeSelected(){
//        wait.until(ExpectedConditions.visibilityOf(isVioletThemeSelected));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(isVioletThemeSelected).isDisplayed();
    }

}