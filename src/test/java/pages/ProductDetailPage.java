package pages;

import org.openqa.selenium.By;
import util.ReusableMethods;

public class ProductDetailPage extends ReusableMethods {

    private static final By BUY_NOW_BUTTON = By.id("trendyol.com:id/secondaryButton");
    private static final By PRODUCT_DETAIL_BASKET = By.id("trendyol.com:id/productDetailBasket");
    private static final By ADD_TO_CART_BUTTON = By.id("trendyol.com:id/primaryButton");
    private static final By CONTINUE_BUTTON = By.id("trendyol.com:id/buttonContinue");
    private static final By CLOSE_POPUP_BUTTON = By.id("trendyol.com:id/imageViewTooltipClose");
    private static final By ADD_BUTTON = By.id("trendyol.com:id/image_add");
    private static final By PRODUCT_NUMBER = By.id("trendyol.com:id/text");

    public boolean isBuyNowButtonDisplayed(){
        return isDisplayed(BUY_NOW_BUTTON);
    }

    public boolean isProductDetailButtonDisplayed(){
        return isDisplayed(PRODUCT_DETAIL_BASKET);
    }

    public void addProductToCart(){
        click(ADD_TO_CART_BUTTON);
        click(CONTINUE_BUTTON);
    }

    public void closePopup(){
        click(CLOSE_POPUP_BUTTON);
    }

    public String clickAddButton() {
        for (int i = 0; i <= 2; i++) {
            click(ADD_BUTTON);
        }
        return getElementText(PRODUCT_NUMBER);
    }
}
