package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.siloam.pages.LoginUserPage;
import org.siloam.utils.Constants;

public class LoginUserTest {
    private static WebDriver driver;
    private static LoginUserPage loginUserPage = new LoginUserPage();
    private static ExtentTest extentTest;
    public LoginUserTest(){
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
        loginUserPage.activityLogin("K6400001", "a");
        extentTest.log(LogStatus.PASS,"user input username and password");
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        WebElement welcomeMessage = loginUserPage.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("YESSA AINURROCHMA")) {
            System.out.println("Pengguna berhasil login.");
            extentTest.log(LogStatus.PASS,"user success login");
        } else {
            System.out.println("Pengguna gagal login.");
            extentTest.log(LogStatus.PASS,"user con't login");
        }
    }
    @When("User input seluruh data pasien benar")
    public void user_input_seluruh_data_pasien_benar() {
        loginUserPage.activityInputData("Hengki Tester", "1753427975765", "99374307307127154680", "Jakarta Utara Bagian timur", "Siloam loam", "Tidak tau itulah");
        extentTest.log(LogStatus.PASS,"user input patient data correctly");
    }

    @Then("User simpan data pasien benar")
    public void user_simpan_data_pasien_benar() {
        WebElement welcomeMessage = loginUserPage.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("YESSA AINURROCHMA")) {
            System.out.println("Pengguna berhasil login.");
        } else {
            System.out.println("Pengguna gagal login.");
        }
    }

    @When("User input file")
    public void user_input_file() {
       loginUserPage.addFileFotoAfter();
       delay(5000);
        extentTest.log(LogStatus.PASS,"user add file after patient data correctly");
       loginUserPage.addFileFotoBefore();
        delay(5000);
        extentTest.log(LogStatus.PASS,"user add file before patient data correctly");
       loginUserPage.addFileFotoTTD();
        delay(5000);
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
