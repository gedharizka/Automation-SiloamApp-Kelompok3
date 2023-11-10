package org.siloam.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.drivers.DriverSingelton;

import java.util.Random;

public class Home {
    private WebDriver driver;

    public Home(){
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator;

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/input']")
    private WebElement btnInput;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputNama;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    private WebElement inputBpjs;
    @FindBy(xpath = "//input[@id='no_ktp']")
    private WebElement inputKtp;
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement inputAlamat;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    private WebElement selectKotaKtp;
    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement inputSelect2;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    private WebElement inputFaskesAwal;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    private WebElement selectFaskesTujuan;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSimpanData;

    // upload data

    // function
    public void handleMenuBtnInput(){
        btnInput.click();
    }

    public String inputMenu(){
        return  btnInput.getText();
    }

    public void fastInputFormInput(){
        inputNama.sendKeys("Testing User");
        inputBpjs.sendKeys(generateRandomNumberString(13));
        inputKtp.sendKeys(generateRandomNumberString(16));
        inputAlamat.sendKeys("Mampang prapatan X, Jakarta Selatan");
        selectKotaKtp.click();
        inputSelect2.sendKeys("Jakarta Selatan");
        inputSelect2.sendKeys(Keys.ENTER);
        inputFaskesAwal.sendKeys("Puskesmas Mampang");
        selectFaskesTujuan.click();
        inputSelect2.sendKeys("Siloam Clinic Bona Indah || Kota Jakarta Selatan");
        inputSelect2.sendKeys(Keys.ENTER);
        btnSimpanData.click();
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
