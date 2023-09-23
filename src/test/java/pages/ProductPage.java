package pages;

import org.openqa.selenium.By;
import util.ReusableMethods;

public class ProductPage extends ReusableMethods {

    private static final By SORT_BUTTON = By.xpath("//android.widget.TextView[contains(@text, 'Sırala')]");
    private static final By FILTER_BUTTON = By.xpath("//android.widget.TextView[contains(@text, 'Filtrele')]");
    private static final By CATEGORY_BUTTON = By.xpath("//android.widget.TextView[contains(@text, 'Kategori')]");
    private static final By FIRST_PRODUCT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView");

    public boolean isSortButtonDisplayed(){
        return isDisplayed(SORT_BUTTON);
    }

    public boolean isFilterButtonDisplayed(){
        return isDisplayed(FILTER_BUTTON);
    }

    public boolean isCategoryButtonDisplayed(){
        return isDisplayed(CATEGORY_BUTTON);
    }

    public void clickFirstProduct(){
        click(FIRST_PRODUCT);
    }
}
