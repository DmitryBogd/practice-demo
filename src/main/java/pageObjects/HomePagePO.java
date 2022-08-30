package pageObjects;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class HomePagePO {
    protected SelenideElement homePageTitle = $x("//div[@id='center_column']/h1");

}
