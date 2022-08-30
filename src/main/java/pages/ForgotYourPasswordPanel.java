package pages;

import components.User;
import java.util.List;
import pageObjects.ForgotYourPasswordPanelPO;


import static org.assertj.core.api.Assertions.assertThat;

public class ForgotYourPasswordPanel extends ForgotYourPasswordPanelPO {

    User user = new User();


    public void verifyForgotPasswordPanel(String isDisplayed) {
        if (forgotPasswordTitle.isDisplayed()) {
            assertThat(isDisplayed).isEqualTo("displayed");
        } else {
            assertThat(isDisplayed).isEqualTo("not displayed");
        }
    }

    public void enterEmail() {
        emailAddressField.clear();
        emailAddressField.sendKeys(user.getEmail());
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

    public void clickRetrievePasswordButton(){
        retrievePasswordButton.click();
    }

    public void verifyForgotPasswordAlert(List<String> expectedAlertsRows){
        expectedAlertsRows.forEach(line -> assertThat(confirmationEmailSentLabelAlert.innerText()).contains(line));
    }

}
