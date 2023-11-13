package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.siloam.pages.LoginPage;
import org.siloam.utils.Constants;
import org.siloam.utils.DriverSingelton;

public class LoginStepDefenition {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static ExtentTest extentTest;
    public LoginStepDefenition(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get(Constants.URLSILOMA);
        extentTest.log(LogStatus.PASS,"user on in login page");
    }

    @When("User input username password click button login")
    public void user_input_username_password_click_button_login() {
        loginPage.activityLogin("D6200927", "1997-10-23");
        extentTest.log(LogStatus.PASS,"user input username and password");
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        WebElement welcomeMessage = loginPage.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("ELVA YUNDRA RINDYANA")) {
            System.out.println("Pengguna berhasil login.");
        } else {
            System.out.println("Pengguna gagal login.");
        }
    }
    @When("User input seluruh data pasien benar")
    public void user_input_seluruh_data_pasien_benar() {
        loginPage.activityInputData("Hengki", "123232326454275", "12349647428344680", "Jakarta Utara Bagian timur", "Siloam loam", "Tidak tau itulah");
        extentTest.log(LogStatus.PASS,"user input patient data correctly");
    }

    @Then("User simpan data pasien benar")
    public void user_simpan_data_pasien_benar() {
        WebElement welcomeMessage = loginPage.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("ELVA YUNDRA RINDYANA")) {
            System.out.println("Pengguna berhasil login.");
        } else {
            System.out.println("Pengguna gagal login.");
        }
    }

    @When("User input file")
    public void user_input_file() {
       loginPage.addFileFotoAfter();
        extentTest.log(LogStatus.PASS,"user add file after patient data correctly");
       loginPage.addFileFotoBefore();
        extentTest.log(LogStatus.PASS,"user add file before patient data correctly");
       loginPage.addFileFotoTTD();
        extentTest.log(LogStatus.PASS,"user add file ttd patient data correctly");
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
