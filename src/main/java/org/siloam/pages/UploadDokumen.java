package org.siloam.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.drivers.DriverSingelton;

import java.util.Random;

public class UploadDokumen {
    private WebDriver driver;

    public UploadDokumen(){
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator;

    // upload data
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    private WebElement btnFotoFaskesAwal;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    private WebElement btnFotoFaskesTujuan;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    private WebElement btnTtdDigital;
    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement btnSave;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnSwalOk;
    @FindBy(xpath = "//input[@id='file']")
    private WebElement btnUpload;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement btnSelanjutnya;
    @FindBy(xpath = "//strong[normalize-space()='Data Personal']")
    private WebElement textDataPersonal;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement btnCancel;
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    private WebElement btnCloseX;
    @FindBy(xpath = "//*[@id=\"default-tab-2\"]/div[1]/div/table/tbody[1]/tr[1]/td[1]/div/input")
    private WebElement fotoFaskesAwal;



    //


    // function

    public void handleButtonFaskesAwal(){
        btnFotoFaskesAwal.click();
    }

    public void handleButtonUpload(){
        btnUpload.sendKeys("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam_Cucumber\\public\\images\\test_jpg.jpg");
    }

    public void handleCustomUpload(String filePath){
        this.btnUpload.sendKeys(filePath);
    }

    public void handleButtonSimpan(){
        btnSave.click();
    }

    public void handleButtonSwalOk(){
        btnSwalOk.click();
    }
    public void handleBtnClose(){
        btnCloseX.click();
    }
    public void handleBtnCancle(){
        btnCancel.click();
    }

    public String getFotoFaskesAwal(){
        return fotoFaskesAwal.getAttribute("value");
    }


    public String uploadDokumenIsActive(){
        return btnFotoFaskesAwal.getText();
    }

    public void unggahDokumen(){
        btnFotoFaskesAwal.click();
        btnUpload.sendKeys("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam_Cucumber\\public\\images\\test_jpg.jpg");
        btnSave.click();
        btnSwalOk.click();

        btnFotoFaskesTujuan.click();
        btnUpload.sendKeys("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam_Cucumber\\public\\images\\test_jpg.jpg");
        btnSave.click();
        btnSwalOk.click();

        btnTtdDigital.click();
        btnUpload.sendKeys("D:\\Pribadi\\Code\\SQA\\Tugas_Akhir\\Siloam_Cucumber\\public\\images\\test_jpg.jpg");
        btnSave.click();
        btnSwalOk.click();

        btnSelanjutnya.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    public String tabTddDigital(){
        return textDataPersonal.getText();
    }

    public String generateRandomNumberString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(10); // Menghasilkan angka acak antara 0 dan 9
            sb.append(randomNumber);
        }

        return sb.toString();
    }
}
