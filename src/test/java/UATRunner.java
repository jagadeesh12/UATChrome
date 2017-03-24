import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sse0049 on 17/2/17.
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {
                    "src/test/resources/catalyst/settings/UAT/UAT.feature",
                
            },

            glue={"com.rl.qa"},
            format = {"pretty", "html:target/cucumber", "json:target/reports/json/UATforCFT.json"}
    )
    public class UATRunner {


    }

