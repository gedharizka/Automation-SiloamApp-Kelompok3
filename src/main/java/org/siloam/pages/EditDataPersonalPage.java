package org.siloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.utils.DriverSingelton;

public class EditDataPersonalPage {
    private WebDriver driver;

    @FindBy(xpath= "//button[@id='btnEdit']")
    private WebElement editButton;
    @FindBy(id = "name")
    private WebElement inputName;

    @FindBy(id = "no_bpjs")
    private WebElement noBpjsInput;

    @FindBy(id = "no_ktp")
    private WebElement noKtpInput;

    @FindBy(id = "address")
    private WebElement alamatInput;

    @FindBy(xpath = "//*[@id='select2-ktp_city-container']s")
    private WebElement spanKota;

    @FindBy(xpath = "//*[@id='default-tab-1']/form/div[5]/div/span/span[1]/span")
    private WebElement spanOptionKota;
    @FindBy(id = "origin_faskes")
    private WebElement faskesInput;
    @FindBy(xpath = "//*[@id='select2-destination_faskes-container']")
    private WebElement spanTujuan;

    @FindBy(xpath = "//*[@id='default-tab-1']/form/div[7]/div/span/span[1]/span")
    private WebElement spanOptionTujuan;
    @FindBy(name = "reason")
    private WebElement alasanInput;

    @FindBy(xpath = "//*[@id='page-container']/div/div[2]/form/div[3]")
    private WebElement saveDataButton;

    public EditDataPersonalPage() {
        this.driver = DriverSingelton.getDriver();
        //driver.get("https://dev.ptdika.com/siloam/panel/login/");
        PageFactory.initElements(driver, this);
    }
    public void setInputName(String name) {
        inputName.clear();
        inputName.sendKeys(name);
    }
    public void setNoBpjsInput(String no_bpjs) {
        noBpjsInput.clear();
        noBpjsInput.sendKeys(no_bpjs);
    }
    public void setNoKtpInput(String no_ktp) {
        noKtpInput.clear();
        noKtpInput.sendKeys(no_ktp);
    }
    public void setAlamatInput(String alamat) {
        alamatInput.clear();
        alamatInput.sendKeys(alamat);
    }
    public void getKota() {
        spanKota.click();
        delay(5000);
        //spanOptionKota.click();
    }

    public void setFaskesInput(String faskes) {
        faskesInput.clear();
        faskesInput.sendKeys(faskes);
    }

    public void getTujuan() {
        spanTujuan.click();
        delay(5000);
        //spanOptionTujuan.click();
    }

    public void setAlasanInput(String alasan) {
        alasanInput.clear();
        alasanInput.sendKeys(alasan);
    }
    public void clickSaveBtn() {
        saveDataButton.click();
    }
    public void clickEditBtn() {
        editButton.click();
    }

    public WebElement getWelcomeMessage() {

        return driver.findElement(By.xpath("//*[@id='content']/h1"));
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
