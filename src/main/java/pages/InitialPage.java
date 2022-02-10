package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;

import java.util.List;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class InitialPage extends AbstractPage {

  @FindBy(id = "search")
  List<WebElementFacade> searchField;

  @FindBy(xpath = "//*[@id='search-icon-legacy']/yt-icon")
  WebElementFacade searchButton;


  public void goToYouTube() {
    final var YOUTUBE_URL = "https://www.youtube.com/";
    getDriver().get(YOUTUBE_URL);
    waitUntilPageIsLoaded();
  }

  public void searchForSpecificVideo(final String videoName) {
    WebElementFacade searchBar = searchField
        .stream()
        .filter(WebElementState::isClickable).findAny()
        .orElseThrow(() -> new IllegalStateException("Could not find the element!"));

    searchBar.sendKeys(videoName);
    waitForElementFacadeToBeVisible(searchButton).click();
  }
}