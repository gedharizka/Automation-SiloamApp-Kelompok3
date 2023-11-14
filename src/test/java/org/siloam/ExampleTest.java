package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.siloam.pages.Example;
import org.siloam.utils.Constants;
import org.testng.Assert;

public class ExampleTest {

    private static WebDriver driver;
    private static Example example = new Example();
    private static ExtentTest extentTest;

    public ExampleTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User on login page")
    public void user_access_login_page(){
        driver.get(Constants.URLSILOMA);
        extentTest.log(LogStatus.PASS,"User on login page");
    }
    @When("user input valid credential")
    public void input_valid_credential(){
        example.login_as_admin();
        extentTest.log(LogStatus.PASS,"user input valid credential");
    }
    @When("user redirect to home page")
    public void redirect_to_home(){
        String homeText = example.getTxtHome();
        Assert.assertEquals(homeText,"Home");
        extentTest.log(LogStatus.PASS,"user redirect to home page");
    }




}
