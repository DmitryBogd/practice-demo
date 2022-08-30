package pages;

import com.codeborne.selenide.Selenide;
import components.User;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.AuthenticationPO;


import static org.assertj.core.api.Assertions.assertThat;

public class AuthenticationPage extends AuthenticationPO {
    User user = new User();

    public void verifyAuthenticationPage(String isDisplayed) {
        if (authenticationPgeTitle.isDisplayed()) {
            assertThat(isDisplayed).isEqualTo("displayed");
        } else {
            assertThat(isDisplayed).isEqualTo("not displayed");
        }
    }

    public void clickSignIn() {
        signinButton.click();
    }

    public void enterEmail() {
        signinEmailAddressField.clear();
        signinEmailAddressField.sendKeys(user.getEmail());
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

    public void setPassword(String password) {
        user.setPassword(password);
    }

    public void enterPassword() {
        signinPasswordField.clear();
        signinPasswordField.sendKeys(user.getPassword());
    }

    public void clickForgotYourPasswordButton() {
        forgotYourPasswordButton.click();
    }

    public void verifySignInAlert(List<String> expectedAlertsRows) {
        expectedAlertsRows.forEach(line -> assertThat(loginAlert.innerText()).contains(line));
    }

    public void enterEmailCreateAccountPanel() {
        createAccountEmailAddressField.clear();
        createAccountEmailAddressField.sendKeys(user.getEmail());
    }

    public void generateEmailForUser() {
        user.setGenerateEmail();
    }

    public void clickCreateAnAccountButton() {
        createAccountButton.click();
    }

    public void verifyCreateUserAlert(List<String> expectedAlertsRows) {
        Selenide.Wait().withTimeout(Duration.ofMillis(8000)).until(ExpectedConditions.visibilityOf(createUserAlert));
        expectedAlertsRows.forEach(line -> assertThat(createUserAlert.innerText()).contains(line));
    }
}
