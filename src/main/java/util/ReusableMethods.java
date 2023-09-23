package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Math.abs;
import static util.DriverFactory.driver;

public class ReusableMethods {

    public void waitUntilElementIsVisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by){
        waitUntilElementIsVisible(by,20);
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendKeys(By by, String value){
        waitUntilElementIsVisible(by,20);
        WebElement element = driver.findElement(by);
        element.sendKeys(value);
    }

    public boolean isDisplayed(By by){
        waitUntilElementIsVisible(by,20);
        WebElement element = driver.findElement(by);
        return element.isDisplayed();
    }

    public boolean isClickable(By by){
        waitUntilElementIsVisible(by,20);
        WebElement element = driver.findElement(by);
        return element.isEnabled();
    }

    public String getElementText(By by){
        waitUntilElementIsVisible(by,20);
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    public ReusableMethods waitFor(int second){
        try{
            Thread.sleep(1000*second);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public void scrollDown(int pixel){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,"+ abs(pixel) + ");", "");
    }

}
