package Automation_Saucedemo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		        glue= "",
		        monochrome = true,
		        snippets = SnippetType.CAMELCASE,
		        tags = {"@Saucedemo"}
		)

public class RunnerFeatures {

}
