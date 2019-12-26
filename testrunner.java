package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "D:\\java\\GB\\CucumberBDD\\src\\test\\java\\features\\login.feature"
,glue= {"seleniumglucode"}
 ,format= {"pretty","html:test-outout"}
)

public class testrunner {

}
