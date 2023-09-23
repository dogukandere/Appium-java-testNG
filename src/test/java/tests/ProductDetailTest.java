package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ProductDetailPage;
import util.DriverFactory;
import static org.testng.Assert.*;

public class ProductDetailTest {

    private static ProductDetailPage productDetailPage;

    @BeforeTest
    public void before(){
        DriverFactory.getDriver();
        productDetailPage = new ProductDetailPage();
    }

    @Test
    public void clickBuyNowButton(){
        assertTrue(productDetailPage.isProductDetailButtonDisplayed());
        assertTrue(productDetailPage.isBuyNowButtonDisplayed());
        productDetailPage.addProductToCart();
        productDetailPage.closePopup();
    }

    @Test
    public void clickAddButtonTest(){
        assertEquals(productDetailPage.clickAddButton(), "4");
    }
}
