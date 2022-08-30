package pages;

import com.codeborne.selenide.Selenide;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.CreateAccountPanelPO;


import static org.assertj.core.api.Assertions.assertThat;

public class CreateAccountPanel extends CreateAccountPanelPO {

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void verifyCreateAccountPanel(String isDisplayed) {
        Selenide.Wait().withTimeout(Duration.ofMillis(8000)).until(ExpectedConditions.urlContains("account-creation"));
        if (createAccountPanelTitle.isDisplayed()) {
            assertThat(isDisplayed).isEqualTo("displayed");
        } else {
            assertThat(isDisplayed).isEqualTo("not displayed");
        }
    }

    public void verifyCreateAccountAlert(List<String> expectedAlertsRows) {
        Selenide.Wait().until(ExpectedConditions.visibilityOf(createAccountAlert));
        expectedAlertsRows.forEach(line -> assertThat(createAccountAlert.innerText()).contains(line));
    }

    public void enterDataIntoCreateAccountForm(Map<String, String> data) {
        for (Map.Entry<String, String> field : data.entrySet()) {
            switch (field.getKey()) {
                case "firstName":
                    firstName.sendKeys(field.getValue());
                    break;
                case "secondName":
                    secondName.sendKeys(field.getValue());
                    break;
                case "password":
                    password.sendKeys(field.getValue());
                    break;
                case "address":
                    address.sendKeys(field.getValue());
                    break;
                case "city":
                    city.sendKeys(field.getValue());
                    break;
                case "state":
                    state.selectOption(field.getValue());
                    break;
                case "zipCode":
                    zipCode.sendKeys(field.getValue());
                    break;
                case "mobilePhone":
                    mobilePhone.sendKeys(field.getValue());
                    break;
                default:
                    Assertions.fail("No such " + field + " field");
                    break;
            }
        }
    }
}
