package org.siloam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/feature/LoginUser.feature",
                "src/main/resources/feature/EditDataPersonal.feature",
                "src/main/resources/feature/CrudFile.feature",
                //"src/main/resources/feature/Example.feature"
        },
        glue = "org.siloam",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnterTest extends AbstractTestNGCucumberTests {


}
