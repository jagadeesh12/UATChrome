import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sse0051 on 23/3/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/catalyst/settings/AzureBlueprint.feature",
        },
        tags={"@Azure"},
        glue={"com.rl.qa"},
        format = {"pretty", "html:target/cucumber", "json:target/reports/json/AzureBlueprint.json"}
)
public class AzureBlueprintRunner {
}
