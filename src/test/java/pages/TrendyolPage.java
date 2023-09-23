package pages;

import org.openqa.selenium.By;
import util.ReusableMethods;

public class TrendyolPage extends ReusableMethods {

    private static final By SELECT_GENDER_MAN_BUTTON = By.id("trendyol.com:id/buttonSelectGenderMan");
    private static final By CLOSE_POPUP_BUTTON = By.id("trendyol.com:id/imageViewTooltipClose");
    private static final By SEARCH_AREA = By.id("trendyol.com:id/edittext_search_view");
    private static final By LIST_ELEMENT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");


    public void clickGenderButton(){
        click(SELECT_GENDER_MAN_BUTTON);
    }

    public void closePopup(){
        click(CLOSE_POPUP_BUTTON);
    }

    public void searchProduct(String product){
        click(SEARCH_AREA);
        sendKeys(SEARCH_AREA, product);
    }

    public void clickProductInList(){
        click(LIST_ELEMENT);
    }

}
