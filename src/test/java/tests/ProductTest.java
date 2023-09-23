package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ProductPage;
import util.DriverFactory;

import static org.testng.Assert.*;

public class ProductTest {

    private static ProductPage productPage;

    @BeforeTest
    public void before(){
        DriverFactory.getDriver();
        productPage = new ProductPage();
    }

    @Test
    public void verifyProductListPageAndClickProduct(){
        assertTrue(productPage.isSortButtonDisplayed());
        assertTrue(productPage.isFilterButtonDisplayed());
        assertTrue(productPage.isCategoryButtonDisplayed());
        productPage.clickFirstProduct();
    }
}
