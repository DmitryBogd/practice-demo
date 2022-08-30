package pageObjects;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class AuthenticationPO {
    protected SelenideElement authenticationPgeTitle = $x("//div[@id='center_column']/h1");
    protected SelenideElement createAccountEmailAddressField = $x("//div[contains(@class, 'form_content clearfix')]/div/input[contains(@class, 'validate account')]");
    protected SelenideElement createAccountButton = $x("//div[contains(@class, 'form_content clearfix')]//button");
    protected SelenideElement signinEmailAddressField = $x("//div[contains(@class, 'form_content clearfix')]/following::div/div/input[contains(@data-validate, 'isEmail')]");
    protected SelenideElement signinPasswordField = $x("//div[contains(@class, 'form_content clearfix')]/following::div/div//input[contains(@data-validate, 'isPasswd')]");
    protected SelenideElement forgotYourPasswordButton = $x("//div[contains(@class, 'form_content clearfix')]/following::div/p[contains(@class,'lost_password')]/a");
    protected SelenideElement signinButton = $x("//div[contains(@class, 'form_content clearfix')]/following::div/p//button");
    protected SelenideElement loginAlert = $x("//div[@id='center_column']/div[contains(@class, 'alert')]");
    protected SelenideElement createUserAlert = $x("//div[contains(@class, 'form_content clearfix')]/div[contains(@class, 'alert')]");
}
