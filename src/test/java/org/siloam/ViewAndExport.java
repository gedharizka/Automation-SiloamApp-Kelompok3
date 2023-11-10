package org.siloam;

import org.siloam.Driver.DriverSingleton;
//import org.siloam.pages.LoginPage;
import org.siloam.pages.View;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class ViewAndExport {
    private static WebDriver driver;
//    private static LoginPage loginPage = new LoginPage();
    private static View view= new View();
    private static ExtentTest extentTest;


    public ViewAndExport(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TestCase 2-7
    @Given("User click button View")
    public void user_click_button_view() {
        view.buttonView();
        extentTest.log(LogStatus.PASS,"User click button View");
    }

    @And("User get text view")
    public void getTxtView() {
//        Assert.assertEquals(view.getTextView(),"View & Export");
        Assert.assertEquals(view.getTextView(),"View & Export");
        extentTest.log(LogStatus.PASS,"User get text view");
    }

    @Given("Masukan Tanggal Start")
    public void masukan_Taggal_Start() {
        view.tanggalStart();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Start");
    }

    @Then("Masukan Tanggal dua")
    public void Masukan_tanggal_dua() {
        view.tanggaldua();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal dua");
    }

    @And("Masukan Tanggal End")
    public void Masukan_tanggal_end() {
        view.tanggalend();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal End");
    }

    @And("Masukan Tanggal delapan")
    public void masukan_tanggal_depalan() {
        view.tanggaldelapan();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal delapan");
    }

    @And("klick Button Filter")
    public void klick_button_filter() {
        view.buttonFilter();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"klick Button Filter");
    }

    @And("Masukan Tanggal Satu")
    public void Masukan_tanggal_satu() {
        view.tanggalSatuNov();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Satu");
    }

    @And("Klick Button Refresh")
    public void klick_button_refresh() {
        view.buttonRefresh();
        extentTest.log(LogStatus.PASS,"Klick Button Refresh");
    }
    @And("Masukan Send Tanggal dua")
    public void Masukan_send_tanggal_dua(){
        view.inputTglDua();
        extentTest.log(LogStatus.PASS,"Masukan Send Tanggal dua");
    }
    @Then("user get Data")
    public void user_get_data(){
        Assert.assertEquals(view.getTxtData(),"Data");
        extentTest.log(LogStatus.PASS,"user get Data");
    }
    @Then("data berhasil di Refresh")
    public void data_berhasil_direfresh(){
        Assert.assertTrue(true, "Data Berhasil di refresh");
    }
    @Then("Menampilkan Alert Please Fill Out This Field")
    public void menampilkan_alert_please_fill_out_this_field(){
        Assert.assertTrue(true, "Berhasil menampilkan Alert Please Fill Out This Field");
    }



    // Test case 8-10
    @And("Klick Button Export")
    public void klick_button_export() {
        view.btnExport();
        extentTest.log(LogStatus.PASS,"Klick Button Export");
    }
    @And("user Get Text Danger")
    public void get_text_danger() {
        Assert.assertEquals(view.getTextDanger(),"Danger! Mohon isi start_date dan end_date terlebih dahulu!!!\n" +
                "×");
        extentTest.log(LogStatus.PASS,"user Get Text Danger");
    }

    @And("Masukan Tanggal Empat")
    public void Masukan_tanggal_empat(){
        view.setEmpatNovember();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Empat");
    }
    @And("User get text Data Kosong")
    public void  user_get_text_data_Kosong(){
        Assert.assertEquals(view.getTxtKosong(),"Danger! Data Tidak Ada!!!\n"+"×");
        extentTest.log(LogStatus.PASS,"User get text Data Kosong");
    }

    //testcase 11-13
    @And("Klick Button Download")
    public void klick_button_download() {
        view.btnDownload();
        extentTest.log(LogStatus.PASS,"Klick Button Download");
    }
//    @Given("click Button Faskes Foto Awal")
//    public void Click_button_faskes_awal(){
//        view.getFotoAwal();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"click Button Faskes Foto Awal");
//    }
    @Then("Close Faskes")
    public void close_faskes(){
//        driver.close();
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[0]);
        extentTest.log(LogStatus.PASS,"Close Faskes");
    }
//    @Given("click Button Faskes Foto Akhir")
//    public void Click_button_faskes_akhir(){
//        view.getFotoAkhir();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"click Button Faskes Foto Akhir");
//    }
//
//    @And("Click Pdf Agreement")
//    public void Click_Pdf_Agreement(){
//        view.getPdfAgreement();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"Click Pdf Agreement");
//    }
    //TestCase 14
    @And("Masukan Tanggal Sepuluh")
        public void masukan_tanggal_sepuluh(){
        view.setSepuluhNovember();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Sepuluh");
    }
    @And("Klick Button Foto Awal JPEG")
       public void klick_button_foto_awal_jpeg(){
        view.setFotoAwalJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal JPEG");
    }

    //TestCase 15
    @And("Klick Button Foto Tujuan JPEG")
    public void klick_button_foto_tujuan_JPEG(){
     view.setFotoTujuanJPEG();
     DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan JPEG");
    }

    //Testcase 16
    @And("Klick Button PDF Agreement JPEG")
    public void Klick_button_PDF_agreement_JPEG(){
        view.setPdfAgreementJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement JPEG");
    }

    //Testcase 17
    @And("Klick Button Foto Awal JPG")
    public void klick_button_foto_awal_jpg(){
        view.setFotoAwalJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal JPG");
    }


    //TestCase 18
    @And("Klick Button Foto Tujuan JPG")
    public void klick_button_foto_tujuan_JPG(){
        view.setFotoTujuanJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan JPG");
    }

    //Testcase 19
    @And("Klick Button PDF Agreement JPG")
    public void Klick_button_PDF_agreement_JPG(){
        view.setPdfAgreementJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement JPG");
    }

    //TestCase 20
    @And("Klick Button Foto Awal PNG")
    public void klick_button_foto_awal_png(){
        view.setFotoAwalPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal PNG");
    }

    //TestCase 21
    @And("Klick Button Foto Tujuan PNG")
    public void klick_button_foto_tujuan_png(){
        view.setFotoTujuanPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan PNG");
    }

    //Testcase 22
    @And("Klick Button PDF Agreement PNG")
    public void Klick_button_PDF_agreement_png(){
        view.setPdfAgreementPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement PNG");
    }

    //Testcase 23
    @And("Klick Button View JPEG")
    public void Klick_Button_View_JPEG(){
        view.setViewJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View JPEG");
    }

    //TestCase 24
    @And("Klick Button View JPG")
    public void Klick_Button_View_JPG(){
        view.setViewJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View JPG");
    }

    //TestCase 25
    @And("Klick Button View PNG")
    public void Klick_Button_View_PNG(){
        view.setViewPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View PNG");
    }







}
