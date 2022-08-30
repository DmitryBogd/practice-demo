package stepDef;

import io.cucumber.java.en.When;
import pages.HeaderPanel;

public class headerSteps {
    HeaderPanel headerPanel = new HeaderPanel();

    @When("^I click sign in header button$")
    public void i_have_click_sign_in_header_button() {
        headerPanel.clickSignHeaderInButton();
    }
}
