package runners;

import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.junit.runners.SerenityRunner;

import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
)
public class CucumberTestSuite {}
