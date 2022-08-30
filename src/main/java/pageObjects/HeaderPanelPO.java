package pageObjects;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class HeaderPanelPO {
    protected SelenideElement signinButton = $x("//div[contains(@class,'header_user_info')]/a[contains(@class,'login')]");
}
