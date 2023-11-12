package org.siloam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/login.feature",
                "src/main/resources/features/editdatapersonal.feature",
                "src/main/resources/features/openfilefoto.feature",
                //"src/main/resources/feature/Example.feature"
        },
        glue = "org.siloam",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnterTest extends AbstractTestNGCucumberTests {


}
