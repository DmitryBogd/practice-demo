package pages;

import pageObjects.HomePagePO;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends HomePagePO {

    public void verifyHomePage(String isDisplayed){
        if(homePageTitle.isDisplayed()){
            assertThat(isDisplayed).isEqualTo("displayed");
        } else {
            assertThat(isDisplayed).isEqualTo("not displayed");
        }
    }
}
