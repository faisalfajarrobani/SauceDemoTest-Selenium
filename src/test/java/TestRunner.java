import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        plugin = {
                "pretty",
                "json:target/Cucumber.json",
                "html:target/Cucumber.html"
        },
        publish = true
)
public class TestRunner {
}
