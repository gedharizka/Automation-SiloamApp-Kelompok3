package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.siloam.pages.CrudFilePage;

public class CrudFileTest {
    private static WebDriver driver;
    private static CrudFilePage editfile = new CrudFilePage();
    private static ExtentTest extentTest;

    public CrudFileTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User is on the ttd digital")
    public void user_is_on_the_ttd_digital_page() {
        System.out.println("Edit data  adn file patient");
    }
    @When("User klik tombol foto after")
    public void user_klik_tombol_foto_after() {
        editfile.clickAfterToSee();
        extentTest.log(LogStatus.PASS,"user show file patient after");
    }
    @When("User klik tombol foto before")
    public void user_klik_tombol_foto_before() {

        editfile.clickBeforeToSee();
        extentTest.log(LogStatus.PASS,"user show file patient before");
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
        extentTest.log(LogStatus.PASS,"user delete file patient after");
    }
    @When("User klik tombol hapus before")
    public void user_klik_tombol_hapus_before() {

        editfile.activityDeleteFileBefore();
        extentTest.log(LogStatus.PASS,"user show file patient before");
    }
    @When("User klik tombol hapus ttd")
    public void user_klik_tombol_hapus_ttd() {

        editfile.activityDeleteFileTtd();
        extentTest.log(LogStatus.PASS,"user show file patient ttd");
    }

    @When("User klik button edit file after klik choice klik open klik simpan")
    public void user_add_file_after() {

        editfile.addFileFotoAfter();
        extentTest.log(LogStatus.PASS,"user edit file patient after");
    }

    @When("User klik button edit file before klik choice klik open klik simpan")
    public void user_add_file_before() {

        editfile.addFileFotoBefore();
        extentTest.log(LogStatus.PASS,"user edit file patient before");
    }

    @When("User klik button edit file ttd klik choice klik open klik simpan")
    public void user_add_file_ttd() {

        editfile.addFileFotoTTD();
        extentTest.log(LogStatus.PASS,"user show file patient ttd");
    }
    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
