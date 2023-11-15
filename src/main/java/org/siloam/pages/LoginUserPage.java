package org.siloam.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.utils.DriverSingelton;

public class LoginUserPage {
    private WebDriver driver;
    public LoginUserPage(){
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='page-container']/div/div[2]/form/div[3]")
    private WebElement loginButton;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[2]/li[3]/a[1]/span[1]")
    private WebElement inputButton;

    @FindBy(id = "name")
    private WebElement inputName;

    @FindBy(id = "no_bpjs")
    private WebElement notbpjsInput;

    @FindBy(id = "no_ktp")
    private WebElement noKtpInput;

    @FindBy(id = "address")
    private WebElement alamatInput;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/span[1]/span[1]/span[1]/span[1]")
    private WebElement spanKota;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement spanOptionKota;
    @FindBy(id = "origin_faskes")
    private WebElement faskesInput;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/span[1]/span[1]/span[1]")
    private WebElement spanTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement spanOptionTujuan;
    @FindBy(name = "reason")
    private WebElement alasanInput;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/button[1]")
    private WebElement saveDataButton;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    private WebElement afterButton;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement choiceFileButton;

    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement simpanFileButton;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    private WebElement beforeButton;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnConfirm;

    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    private WebElement ttdButton;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div/div[2]/div/div")
    private WebElement selanjutnyaButton;

    public void activityLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void activityInputData(String name, String no_bpjs, String no_ktp, String alamat, String faskesFirst, String alasan ) {
        delay(10000);
        inputButton.click();
        inputName.sendKeys(name);
        notbpjsInput.sendKeys(no_bpjs);
        noKtpInput.sendKeys(no_ktp);
        alamatInput.sendKeys(alamat);
        spanKota.click();
        delay(5000);
        spanOptionKota.sendKeys("KABUPATEN ACEH SINGKIL");
        spanOptionKota.sendKeys(Keys.RETURN);
        faskesInput.sendKeys(faskesFirst);
        spanTujuan.click();
        spanOptionTujuan.sendKeys("Siloam Clinic Meruya || Kota Jakarta Barat");
        spanOptionTujuan.sendKeys(Keys.RETURN);
        delay(5000);
        alasanInput.sendKeys(alasan);
        delay(5000);
        saveDataButton.click();
    }

    public void addFileFotoAfter() {
        afterButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\Screenshot 2023-09-01 194619.png");
        delay(3000);
        simpanFileButton.click();
        delay(8000);
        btnConfirm.click();
        delay(3000);
    }
    public void addFileFotoBefore() {
        beforeButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\Screenshot 2023-09-06 101141.png");
        delay(3000);
        simpanFileButton.click();
        delay(8000);
        btnConfirm.click();
        delay(3000);
    }
    public void addFileFotoTTD() {
        ttdButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\Screenshot 2023-09-06 101141.png");
        delay(3000);
        simpanFileButton.click();
        delay(8000);
        btnConfirm.click();
        delay(3000);
        selanjutnyaButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public WebElement getWelcomeMessage() {
        return driver.findElement(By.xpath("//*[@id='sidebar']/div/div[1]/ul[1]/li/a/div[3]"));
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
