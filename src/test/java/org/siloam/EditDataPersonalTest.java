package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.siloam.pages.EditDataPersonalPage;
import org.siloam.utils.Constants;
import org.siloam.utils.DriverSingelton;

public class EditDataPersonalTest {
    private static WebDriver driver;
    private static EditDataPersonalPage editdata = new EditDataPersonalPage();
    private static ExtentTest extentTest;

    public EditDataPersonalTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User is on the ttd digital page")
    public void user_is_on_the_ttd_digital_page() {
        System.out.println("Edit data dan file pasien");
    }
    @When("User input nama pasien benar")
    public void user_input_nama_pasien_benar() {
        editdata.clickEditBtn();
        editdata.setInputName("Marimas");
    }
    @When("User input nomor bpjs pasien benar")
    public void user_input_nomor_bpjs_pasien_benar() {
        editdata.setNoBpjsInput("1356861843567");
    }
    @When("User input nomor ktp pasien benar")
    public void user_input_nomor_ktp_pasien_benar() {
        editdata.setInputName("1056873843567543");
    }
    @When("User input alamat pasien benar")
    public void user_input_alamat_pasien_benar() {
        editdata.setAlamatInput("Jalan kerinduan tiada tara");
    }
    @When("Pilih kota pasien benar")
    public void pilih_kota_pasien_benar() {
        editdata.getKota();
    }
    @When("Input faskes pertama pasien benar")
    public void input_faske_pertama_pasien_benar() {
        editdata.setFaskesInput("Apa saja boleh");
    }
    @When("Pilih faskes tujuan pasien benar")
    public void pilih_faskes_tujuan_pasien_benar() {
        editdata.getTujuan();
    }
    @When("User input alasan pasien benar")
    public void usert_faske_pertama_pasien_benar() {
        editdata.setAlasanInput("Apa saja boleh gapapa");
    }
    @When("User save data pasien benar")
    public void user_save_data_pasien_benar() {
        editdata.clickSaveBtn();
    }
    @Then("User edit data pasien")
    public void user_edit_data_pasien() {
        WebElement welcomeMessage = editdata.getWelcomeMessage();

        if (welcomeMessage.isDisplayed() && welcomeMessage.getText().equals("YESSA AINURROCHMA")) {
            System.out.println("Pengguna dalam halaman ttd digital.");
        } else {
            System.out.println("Pengguna tidak dalam halaman ttd digital.");
        }
    }
    @When("User input 100 karakter nama pasien")
    public void user_input_100_karakter_nama_pasien() {
        editdata.clickEditBtn();
        editdata.setInputName("sfshfeyrf efe fewfhewf f bffhvsY XBFJBA DDGADKFHksHHKDSjdsfdgfbb  fhflakjhmaher wjrehr aykashwtrsnjsgff fywafnsaf ewfylahdnegrewr jergwjrbndir ywr rwyr");
        editdata.clickSaveBtn();
    }
    @When("User input 30 karakter nomor bpjs pasien")
    public void user_input_30_karakter_nomor_bpjs_pasien() {
        editdata.clickEditBtn();
        editdata.setNoBpjsInput("12345678942453356675857467426564564");
        editdata.clickSaveBtn();
    }
    @When("User input 30 karakter nomor ktp pasien")
    public void user_input_30_karakter_nomor_ktp_pasien() {
        editdata.clickEditBtn();
        editdata.setNoBpjsInput("12345678942453436675857467426564564");
        editdata.clickSaveBtn();
    }

    @When("User input elemen huruf nomor bpjs pasien")
    public void user_input_elemen_huruf_nomor_bpjs_pasien() {
        editdata.clickEditBtn();
        editdata.setNoBpjsInput("123456789424533566758574674yyfggfxc");
        editdata.clickSaveBtn();
    }
    @When("User input elemen huruf nomor ktp pasien")
    public void user_input_elemen_huruf_nomor_ktp_pasien() {
        editdata.clickEditBtn();
        editdata.setNoKtpInput("123456789424533566758574674yyfggfxc");
        editdata.clickSaveBtn();
    }

    @When("User hapus nama pasien")
    public void user_hapus_nama_pasien() {
        editdata.clickEditBtn();
        editdata.setInputName("");
        editdata.clickSaveBtn();
    }
    @When("User hapus no bpjs pasien")
    public void user_hapus_no_bpjs_pasien() {
        editdata.clickEditBtn();
        editdata.setNoBpjsInput("");
        editdata.clickSaveBtn();
    }
    @When("User hapus no ktp pasien")
    public void user_hapus_no_ktp_pasien() {
        editdata.clickEditBtn();
        editdata.setNoKtpInput("");
        editdata.clickSaveBtn();
    }
    @When("User hapus alamat pasien")
    public void user_hapus_alamat_pasien() {
        editdata.clickEditBtn();
        editdata.setAlamatInput("");
        editdata.clickSaveBtn();
    }
    @When("User hapus alasan pasien")
    public void user_hapus_alasan_pasien() {
        editdata.clickEditBtn();
        editdata.setAlasanInput("");
        editdata.clickSaveBtn();
    }
    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
