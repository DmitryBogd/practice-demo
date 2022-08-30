package stepDef;

import api.StarshipRequest;
import io.cucumber.java.en.When;

public class StarshipApiSteps {
    StarshipRequest starshipRequest = new StarshipRequest();

    @When("I make starship API request")
    public void i_make_starship_api_request() {
        starshipRequest.getStarshipRequest();
    }
}
