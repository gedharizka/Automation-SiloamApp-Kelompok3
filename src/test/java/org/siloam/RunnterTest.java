package org.siloam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/feature/01LoginUser.feature",
                "src/main/resources/feature/02EditDataPersonal.feature",
                "src/main/resources/feature/03CrudFile.feature",
                //"src/main/resources/feature/Example.feature"
        },
        glue = "org.siloam",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnterTest extends AbstractTestNGCucumberTests {

}
