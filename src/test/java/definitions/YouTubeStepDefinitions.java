package definitions;

import net.thucydides.core.annotations.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.YouTubeSteps;

public class YouTubeStepDefinitions {

  @Steps
  private YouTubeSteps youTubeSteps;

  @Given("I open YouTube web page")
  public void iOpenYouTubeWebPage() {
    youTubeSteps.openYoutube();
  }

  @When("I search for a specific video")
  public void iSearchForASpecificVideo() {
    youTubeSteps.searchForAVideo();
  }

  @Then("I am able to play that video")
  public void iAmAbleToPlayThatVideo() {
    youTubeSteps.playMyVideo();
  }
}
