package stepDef;

import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @When("^I verify Home page is '(displayed|not displayed)'$")
    public void i_verify_home_page_is_displayed_or_not(String isDisplayed) {
        homePage.verifyHomePage(isDisplayed);
    }
}
