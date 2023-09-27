package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static java.lang.Math.abs;
import static util.DriverFactory.driver;

public class ReusableMethods {

    public void click(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendKeys(By by, String value){
        WebElement element = driver.findElement(by);
        element.sendKeys(value);
    }

    public boolean isDisplayed(By by){
        WebElement element = driver.findElement(by);
        return element.isDisplayed();
    }

    public boolean isClickable(By by){
        WebElement element = driver.findElement(by);
        return element.isEnabled();
    }

    public String getElementText(By by){
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

    public ReusableMethods checkElementNotExist(By by){
        try{
            if (isDisplayed(by)){
                Assert.fail("Element displayed");
            }
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
        return this;
    }

}
