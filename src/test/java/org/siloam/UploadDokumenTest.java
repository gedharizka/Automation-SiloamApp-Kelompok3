package org.siloam;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
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
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam _master - cobalagi\\public\\images\\test_jpg.jpg");
        extentTest.log(LogStatus.PASS, "user click choose file jpg");
    }

    @Then("user click simpan")
    public void handle_modal_btn_simpan() {
        uploadDokumen.handleButtonSimpan();
        extentTest.log(LogStatus.PASS, "user click simpan");
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
        uploadDokumen.handleCustomUpload("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam _master - cobalagi\\public\\datas\\testing_file.pdf");
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
        extentTest.log(LogStatus.PASS, "user click cancel");
    }

    @Then("user click close x")
    public void handle_btn_close_jgp_faskesAwal() {
        uploadDokumen.handleBtnClose();
        // Assert
        extentTest.log(LogStatus.PASS, "user click close x");
    }

}
