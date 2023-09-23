package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import util.DriverFactory;

public class TrendyolTest {

    private static TrendyolPage trendyolPage;

    @BeforeTest
    public void before(){
        DriverFactory.getDriver();
        trendyolPage = new TrendyolPage();
    }

    @Test
    public void searchProduct(){
        trendyolPage.clickGenderButton();
        trendyolPage.closePopup();
        trendyolPage.searchProduct("iphone 14");
        trendyolPage.clickProductInList();
        trendyolPage.closePopup();
    }
}
