package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.CreateAccountPanel;
import pages.ForgotYourPasswordPanel;

public class authenticationPageSteps {
    AuthenticationPage authenticationPage = new AuthenticationPage();
    ForgotYourPasswordPanel forgotYourPasswordPanel = new ForgotYourPasswordPanel();
    CreateAccountPanel createAccountPanel = new CreateAccountPanel();

    @When("^I verify Authentication page is '(displayed|not displayed)'$")
    public void i_verify_puthentication_page_is_displayed_or_not(String isDisplayed) {
        authenticationPage.verifyAuthenticationPage(isDisplayed);
    }

    @When("^I enter new user email in login email field at Authentication page$")
    public void i_enter_new_user_email_in_login_email_field_at_authentication_page() {
        authenticationPage.enterEmail();
    }

    @When("^I enter Password in login password field as '(.*)' at Authentication page$")
    public void i_enter_password_in_login_password_field_as_at_authentication_page(String password) {
        authenticationPage.setPassword(password);
        authenticationPage.enterPassword();
    }

    @Then("^I verify Alert at Authentication page with following text:$")
    public void i_verify_alert_text_at_authentication_page(DataTable dataTable) {
        authenticationPage.verifySignInAlert(dataTable.asList(String.class));
    }

    @When("^I enter email as '(.*)' in login email field at Authentication page$")
    public void i_enter_email_as_in_login_email_field_at_authentication_page(String email) {
        authenticationPage.setEmail(email);
        authenticationPage.enterEmail();
    }

    @When("^I click 'Sign in' button at Authentication page$")
    public void i_click_sign_in_button_at_authentication_page() {
        authenticationPage.clickSignIn();
    }

    @When("I click Forgot your password button at Authentication page")
    public void i_click_forgot_your_password_button_at_authentication_page() {
        authenticationPage.clickForgotYourPasswordButton();
    }

    @Then("^I verify Forgot your password panel is '(displayed|not displayed)'$")
    public void i_verify_forgot_your_password_panel_is(String isDisplayed) {
        forgotYourPasswordPanel.verifyForgotPasswordPanel(isDisplayed);
    }

    @When("^I enter email as '(.*)' at Forgot your password panel$")
    public void i_enter_email_as_at_forgot_your_password_panel(String email) {
        forgotYourPasswordPanel.setEmail(email);
        forgotYourPasswordPanel.enterEmail();
    }

    @When("^I click 'Retrieve Password' button at Forgot your password panel$")
    public void i_click_button_at_forgot_your_password_panel() {
        forgotYourPasswordPanel.clickRetrievePasswordButton();
    }

    @Then("^I verify Alert at Forgot your password page with following text:$")
    public void i_verify_alert_with_text_at_forgot_your_password_panel(DataTable dataTable) {
        forgotYourPasswordPanel.verifyForgotPasswordAlert(dataTable.asList(String.class));
    }

    @When("^I enter email as '(.*)' at Authentication page$")
    public void i_enter_email_as_at_authentication_page(String email) {
        authenticationPage.setEmail(email);
        authenticationPage.enterEmailCreateAccountPanel();
    }

    @When("^I click 'Create an account' button at Authentication page$")
    public void i_click_button_at_authentication_page() {
        authenticationPage.clickCreateAnAccountButton();
    }

    @Then("I verify Alert at Authentication page for Create user panel with following text:")
    public void i_verify_alert_at_authentication_page_for_create_user_panel_with_following_text(DataTable dataTable) {
        authenticationPage.verifyCreateUserAlert(dataTable.asList(String.class));
    }

    @When("^I enter new user email in create account panel at Authentication page$")
    public void i_enter_new_user_email_in_create_account_panel_at_authentication_page() {
        authenticationPage.generateEmailForUser();
        authenticationPage.enterEmailCreateAccountPanel();
    }

    @Then("^I verify Create an account panel is '(displayed|not displayed)'$")
    public void i_verify_create_an_account_panel_is(String isDisplayed) {
        createAccountPanel.verifyCreateAccountPanel(isDisplayed);
    }

    @When("^I click 'Register' button at Create an account panel$")
    public void i_click_button_at_create_an_account_panel() {
        createAccountPanel.clickRegisterButton();
    }

    @Then("^I verify Alert at Create an account panel with following text:$")
    public void i_verify_alert_with_text_at_create_an_account_panel(DataTable dataTable) {
        createAccountPanel.verifyCreateAccountAlert(dataTable.asList(String.class));
    }
    @When("I fill Create an account form with following data:")
    public void i_fill_create_an_account_form_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        createAccountPanel.enterDataIntoCreateAccountForm(dataTable.asMap(String.class, String.class));
    }
}
