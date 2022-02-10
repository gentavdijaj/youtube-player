package runners;

import net.serenitybdd.junit.runners.SerenityRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(SerenityRunner.class)
@CucumberOptions(
    features = "classpath:features",
    glue = "classpath:definitions",
    tags = "@debug",
    plugin = {"pretty", "html:target/report/cucumber.html", "json:target/report/cucumber.json", "junit:target/report" +
        "/cucumber.xml"}
)
public class DebugRunner {
}
