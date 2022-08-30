package pageObjects;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class ForgotYourPasswordPanelPO {
    protected SelenideElement forgotPasswordTitle = $x("//div[@id='center_column']/div/h1");
    protected SelenideElement emailAddressField = $x("//div[@id='center_column']/div//input[@id='email']");
    protected SelenideElement retrievePasswordButton = $x("//div[@id='center_column']/div//button/span[contains(text(),'Retrieve Password')]");
    protected SelenideElement confirmationEmailSentLabelAlert = $x("//div[@id='center_column']/div/p[contains(@class,'alert-success')]");
}
