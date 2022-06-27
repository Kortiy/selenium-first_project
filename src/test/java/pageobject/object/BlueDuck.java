package pageobject.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pageobject.helpers.Locators.getLocator;

public class BlueDuck {

    public WebDriver driver;

    public BlueDuck(WebDriver driver) {
        this.driver = driver;
    }
    public void stickerCheck() throws Exception {
        WebElement blueDuck = driver.findElement(getLocator("BlueDusk.blueDuckLocator"));
        WebElement sticker = blueDuck.findElement(getLocator("BlueDusk.blueDuckStickerLocator"));
        String stickerText = sticker.getText();

        Assert.assertTrue(stickerText.equalsIgnoreCase("new"));
    }
}


