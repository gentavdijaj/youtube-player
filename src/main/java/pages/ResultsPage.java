package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ResultsPage extends AbstractPage {

  @FindBy(xpath = "//yt-formatted-string")
  List<WebElementFacade> listOfResults;

  public void clickOnMyVideo() {
    waitABit(5000);

    WebElementFacade myVideo = listOfResults
        .stream()
        .filter(current -> current.getText().equals("Kida ft. Ermal Fejzullahu - Tela"))
        .findAny()
        .orElseThrow(() -> new IllegalStateException("Could not find the element!"));

    waitForElementFacadeToBeVisible(myVideo).click();


    //Wait a bit before killing chrome driver instance
    waitABit(15000);
  }

  private void waitABit(final int timeInMiliSeconds) {
    new Actions(getDriver()).pause(timeInMiliSeconds).perform();
  }
}