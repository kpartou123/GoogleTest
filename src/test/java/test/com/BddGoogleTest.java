package test.com;
        
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"} ,
        features="features/",
        dryRun = false
)
public class BddGoogleTest {

}
