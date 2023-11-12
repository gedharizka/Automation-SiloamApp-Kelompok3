package org.siloam;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.siloam.utils.Constants;
import org.siloam.utils.DriverSingelton;
import org.siloam.utils.TestCases;
import org.siloam.utils.Utils;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports=new ExtentReports("target/extent-report.html");
    @Before
    public static void setUp() {
        DriverSingelton.getInstance(Constants.Edge);
        driver = DriverSingelton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {

            String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ","_"));
            extentTest.log(LogStatus.FAIL,scenario.getName()+"\n" + extentTest.addScreenCapture(screenshotPath));
        }
    }

    @After
    public void endTestCase(){
        // Generate to laporan
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish() {
        DriverSingelton.delay(3);
        DriverSingelton.closeObjectInstance();
    }
}
