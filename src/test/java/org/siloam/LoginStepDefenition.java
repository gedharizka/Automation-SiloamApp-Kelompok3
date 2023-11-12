package org.siloam;

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
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingelton.getInstance(Constants.Edge);
        driver = DriverSingelton.getDriver();
        loginPage = new LoginPage();
    }

    @AfterAll
    public static void  finish(){
        DriverSingelton.delay(3);
        DriverSingelton.closeObjectInstance();
    }

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get(Constants.URLSILOMA);
    }

    @When("User input username password click button login")
    public void user_input_username_password_click_button_login() {

        loginPage.activityLogin("D6200927", "1997-10-23");
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
        loginPage.activityInputData("Hengki", "12345326454275", "12344247428344689", "Jakarta Utara Bagian timur", "Siloam loam", "Tidak tau itulah");
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
       loginPage.addFileFotoBefore();
       loginPage.addFileFotoTTD();
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
