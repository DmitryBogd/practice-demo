package pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;


import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPanelPO {
    protected String accountCreationDiv = "//div[contains(@class,'account_creation')]";
    protected SelenideElement createAccountPanelTitle = $x("//div[@id='center_column']/div/h1");
    protected SelenideElement registerButton = $x("//div[@id='center_column']//button/span[contains(text(),'Register')]");
    protected SelenideElement createAccountAlert = $x("//div[@id='center_column']/div[contains(@class, 'alert')]");

    protected SelenideElement firstName = $x(accountCreationDiv + "//input[@name = 'customer_firstname']");
    protected SelenideElement secondName = $x(accountCreationDiv + "//input[@name = 'customer_lastname']");
    protected SelenideElement password = $x(accountCreationDiv + "//input[@name = 'passwd']");
    protected SelenideElement address = $x(accountCreationDiv + "//input[@name = 'address1']");
    protected SelenideElement city = $x(accountCreationDiv + "//input[@name = 'city']");
    protected SelenideElement state = $x(accountCreationDiv + "//select[@name = 'id_state']");
    protected SelenideElement zipCode = $x(accountCreationDiv + "//input[@name = 'postcode']");
    protected SelenideElement mobilePhone = $x(accountCreationDiv + "//input[@name = 'phone_mobile']");


}
