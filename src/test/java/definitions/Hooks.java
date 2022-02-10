package definitions;

import net.serenitybdd.core.Serenity;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.Before;

public class Hooks {

  @Before(value = "@context:UI", order = 1)
  public void setupUiTest() {
    final WebDriver.Options manageOptions = Serenity.getWebdriverManager().getWebdriver().manage();

    try {
      manageOptions.window().maximize();
    } catch (WebDriverException e) {
      manageOptions.window().setSize(new Dimension(1920, 1025));
    }
  }
}
