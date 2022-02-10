package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AbstractPage extends PageObject {

  final int WAIT_TIME = 60;

  public WebElementFacade waitForElementFacadeToBeVisible(WebElementFacade element) {
    new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME)).until(driver -> visibilityOf(element));
    return element;
  }

  public void waitUntilPageIsLoaded() {
    new WebDriverWait(getDriver(), WAIT_TIME).until(
        webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
  }
}