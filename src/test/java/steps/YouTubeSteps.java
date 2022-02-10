package steps;

import pages.InitialPage;
import pages.ResultsPage;


public class YouTubeSteps {

  private InitialPage initialPage;
  private ResultsPage resultsPage;

  public void openYoutube() {
    initialPage.goToYouTube();
  }

  public void searchForAVideo() {
    initialPage.searchForSpecificVideo("Kida - Tela");
  }

  public void playMyVideo() {
    resultsPage.clickOnMyVideo();
  }
}