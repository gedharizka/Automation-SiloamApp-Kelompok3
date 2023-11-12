package org.siloam;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.siloam.pages.EditFotoPage;
import org.siloam.utils.Constants;
import org.siloam.utils.DriverSingelton;

public class EditDataFileTest {
    private static WebDriver driver;
    private static EditFotoPage editfile;
    @BeforeAll
    public static void setUp(){
        DriverSingelton.getInstance(Constants.Edge);
        driver = DriverSingelton.getDriver();
        editfile = new EditFotoPage();
    }

    @AfterAll
    public static void  finish(){
        DriverSingelton.delay(3);
        DriverSingelton.closeObjectInstance();
    }

    @Given("User is on the ttd digital")
    public void user_is_on_the_ttd_digital_page() {
        System.out.println("Edit data dan file pasien");
    }
    @When("User klik tombol foto after")
    public void user_klik_tombol_foto_after() {
        editfile.clickAfterToSee();
    }
    @When("User klik tombol foto before")
    public void user_klik_tombol_foto_before() {
        editfile.clickBeforeToSee();
    }
    @When("User klik tombol foto ttd")
    public void user_klik_tombol_foto_ttd() {
        editfile.clickTtdToSee();
    }
    @Then("User on ttd digital")
    public void user_on_ttd_digital() {
        WebElement welcomeMessage = editfile.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("ELVA YUNDRA RINDYANA")) {
            System.out.println("Pengguna dalam halaman ttd digital.");
        } else {
            System.out.println("Pengguna tidak dalam halaman ttd digital.");
        }
    }

    @When("User klik tombol hapus after")
    public void user_klik_tombol_hapus_after() {
        editfile.activityDeleteFileAfter();
    }
    @When("User klik tombol hapus before")
    public void user_klik_tombol_hapus_before() {
        editfile.activityDeleteFileBefore();
    }
    @When("User klik tombol hapus ttd")
    public void user_klik_tombol_hapus_ttd() {
        editfile.activityDeleteFileTtd();
    }

    @When("User klik button edit file after klik choice klik open klik simpan")
    public void user_add_file_after() {
        editfile.addFileFotoAfter();
    }

    @When("User klik button edit file before klik choice klik open klik simpan")
    public void user_add_file_before() {
        editfile.addFileFotoBefore();
    }

    @When("User klik button edit file ttd klik choice klik open klik simpan")
    public void user_add_file_ttd() {
        editfile.addFileFotoTTD();
    }
    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
