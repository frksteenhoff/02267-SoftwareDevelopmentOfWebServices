/**
 * 
 */
package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Onat
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber.json"},
		glue = {"cucumberTest"},
		features = {"src/test/java/cucumberFeatures/"}
		)

public class CucumberRunnerTest {

}