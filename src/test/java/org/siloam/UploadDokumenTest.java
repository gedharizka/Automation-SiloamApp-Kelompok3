package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.siloam.drivers.DriverSingelton;
import org.siloam.pages.Example;
import org.siloam.pages.Home;
import org.siloam.pages.UploadDokumen;
import org.siloam.utils.Constants;
import org.testng.Assert;

public class UploadDokumenTest {

    private static WebDriver driver;
    private static Example example = new Example();
    private static Home home = new Home();
    private static UploadDokumen uploadDokumen = new UploadDokumen();
    private static ExtentTest extentTest;

    public UploadDokumenTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user click button faskes awal")
    public void fast_to_upload_dokumen() {
        driver.get(Constants.BaseUrl);
        example.login_as_sales();
        home.handleMenuBtnInput();
        home.fastInputFormInput();
        uploadDokumen.handleButtonFaskesAwal();
        extentTest.log(LogStatus.PASS, "user click button faskes awal");
    }

    @Then("user click choose file jpg")
    public void handle_btn_upload_faskesAwal() {
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Automation-SiloamApp-Kelompok3\\public\\images\\test_jpg.jpg");
        extentTest.log(LogStatus.PASS, "user click choose file jpg");
    }

    @Then("user click choose file png")
    public void handle_btn_upload_faskesAwal_png() {
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Automation-SiloamApp-Kelompok3\\public\\images\\test_png.png");
        extentTest.log(LogStatus.PASS, "user click choose file png");
    }

    @Then("user click simpan")
    public void handle_modal_btn_simpan_jpg() {
        uploadDokumen.handleButtonSimpan();
        extentTest.log(LogStatus.PASS, "user click simpan");
    }
    @Then("user click simpan upload pdf")
    public void handle_modal_btn_simpan() {
        uploadDokumen.handleButtonSimpan();
        Assert.assertEquals(uploadDokumen.getErrMessageUpload(),"Please Select A valid Image File\n" +
                "Note\n" +
                "Only jpeg, jpg and png Images type allowed");
        extentTest.log(LogStatus.PASS, "user click simpan");
    }
    @Then("user click simpan file large")
    public void handle_modal_btn_simpan_largeFile() {
        uploadDokumen.handleButtonSimpan();
        DriverSingelton.delay(15);
        Assert.assertEquals(uploadDokumen.getErrMessageUpload(),"Upload error: The file you are attempting to upload is larger than the permitted size.");
        extentTest.log(LogStatus.PASS, "user click simpan file large");
    }

    // UD-01
    @Then("user click ok")
    public void handle_swal_ok() {
        uploadDokumen.handleButtonSwalOk();
        // Assert
        Assert.assertNotNull(uploadDokumen.getFotoFaskesAwal());
        extentTest.log(LogStatus.PASS, "user click ok");
    }

    @Then("user click choose file upload file pdf")
    public void handle_btn_upload_pdf_faskesAwal() {
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Automation-SiloamApp-Kelompok3\\public\\datas\\testing_file.pdf");
        // Assert
        extentTest.log(LogStatus.PASS, "user click choose file upload file pdf");
    }

    @Then("user click choose file jpg large than 5MB")
    public void handle_btn_upload_jgp_large_faskesAwal() {
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Automation-SiloamApp-Kelompok3\\public\\images\\Largefile.jpg");
        // Assert
        extentTest.log(LogStatus.PASS, "user click choose file jpg large than 5MB");
    }

    @Then("user click cancel")
    public void handle_btn_cancel_jgp_faskesAwal() {
        uploadDokumen.handleBtnCancle();
        // Assert
        Assert.assertTrue(uploadDokumen.getFotoFaskesAwal().isEmpty());
        extentTest.log(LogStatus.PASS, "user click cancel");
    }

    @Then("user click close x")
    public void handle_btn_close_jgp_faskesAwal() {
        uploadDokumen.handleBtnClose();
        // Assert
        Assert.assertTrue(uploadDokumen.getFotoFaskesAwal().isEmpty());
        extentTest.log(LogStatus.PASS, "user click close x");
    }

    @Given("user click button faskes tujuan")
    public void fast_to_upload_dokumen_faskes_tujuan() {
        driver.get(Constants.BaseUrl);
        example.login_as_sales();
        home.handleMenuBtnInput();
        home.fastInputFormInput();
        uploadDokumen.handleButtonFaskesTujuan();
        extentTest.log(LogStatus.PASS, "user click button faskes tujuan");
    }
    @Given("user click button tanda tangan digital")
    public void fast_to_upload_dokumen_tanda_tangan() {
        driver.get(Constants.BaseUrl);
        example.login_as_sales();
        home.handleMenuBtnInput();
        home.fastInputFormInput();
        uploadDokumen.handleButtonTandaTangan();
        extentTest.log(LogStatus.PASS, "user click button tanda tangan digital");
    }

    @When("user click faskes awal")
    public void click_faskes_awal() {
        driver.get(Constants.BaseUrl);
        example.login_as_sales();
        home.handleMenuBtnInput();
        home.fastInputFormInput();
        uploadDokumen.handleButtonFaskesAwal();
        extentTest.log(LogStatus.PASS, "user click faskes awal");
    }

    @When("user click faskes tujuan")
    public void click_faskes_tujuan() {
        uploadDokumen.handleButtonFaskesTujuan();
        extentTest.log(LogStatus.PASS, "user click faskes tujuan");
    }
    @When("user click tanda tangan digital")
    public void click_tanda_tangan() {
        uploadDokumen.handleButtonTandaTangan();
        extentTest.log(LogStatus.PASS, "user click tanda tangan digital");
    }

    @Then("user click button selanjutnya")
    public void change_button_selanjutnya() {
        DriverSingelton.delay(15);
        uploadDokumen.handleBtnSelanjutnya();
        Assert.assertEquals(uploadDokumen.tabTddDigital(),"Data Personal");
        extentTest.log(LogStatus.PASS, "user click button selanjutnya");
    }




}
