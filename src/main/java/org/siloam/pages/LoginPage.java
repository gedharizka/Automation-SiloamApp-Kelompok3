package org.siloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.utils.DriverSingelton;
import org.siloam.utils.strategies.DriverStrategy;

public class LoginPage {
    private WebDriver driver;

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

    @FindBy(xpath = "//*[@id='select2-ktp_city-result-tw2u-KABUPATEN TAPANULI TENGAH']")
    private WebElement spanOptionKota;
    @FindBy(id = "origin_faskes")
    private WebElement faskesInput;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/span[1]/span[1]/span[1]")
    private WebElement spanTujuan;

    @FindBy(xpath = "//*[@id='select2-destination_faskes-result-ucfk-21||Siloam Medika Canggu||Bali']")
    private WebElement spanOptionTujuan;
    @FindBy(name = "reason")
    private WebElement alasanInput;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/button[1]")
    private WebElement saveDataButton;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]")
    private WebElement afterButton;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement choiceFileButton;

    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement simpanFileButton;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[2]/tr[1]/td[2]/a[1]/span[1]")
    private WebElement beforeButton;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnConfirm;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[3]/tr[1]/td[2]/a[1]/span[1]")
    private WebElement ttdButton;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/div/div/div[2]/div/div")
    private WebElement selanjutnyaButton;



    public LoginPage() {
        this.driver = DriverSingelton.getDriver();
        driver.get("https://dev.ptdika.com/siloam/panel/login/");
        PageFactory.initElements(driver, this);
    }

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
        //spanOptionKota.click();
        //delay(5000);
        faskesInput.sendKeys(faskesFirst);
        spanTujuan.click();
        delay(5000);
        //spanOptionTujuan.click();
        //delay(5000);
        alasanInput.sendKeys(alasan);
        delay(5000);
        saveDataButton.click();
    }

    public void addFileFotoAfter() {
        afterButton.click();
        //choiceFileButton.click();
        delay(15000);
        //simpanFileButton.click();
    }

    public void addFileFotoBefore() {
        beforeButton.click();
        //choiceFileButton.click();
        delay(15000);
        //simpanFileButton.click();
    }

    public void addFileFotoTTD() {
        ttdButton.click();
        //choiceFileButton.click();
        delay(15000);
        //simpanFileButton.click();
        //delay(5000);
        selanjutnyaButton.click();
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
