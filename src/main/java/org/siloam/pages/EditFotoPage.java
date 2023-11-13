package org.siloam.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.utils.DriverSingelton;

public class EditFotoPage {
    private WebDriver driver;
    public EditFotoPage() {
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    private WebElement clickFileAfter;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]/img[1]")
    private WebElement clickFileBefore;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/a[1]/img[1]")
    private WebElement clickFileTTD;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]/i[1]")
    private WebElement deleteFileAfter;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[2]/i[1]")
    private WebElement deleteFileBefore;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[2]/i[1]")
    private WebElement deleteFileTtd;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]/span[1]")
    private WebElement afterButton;

    @FindBy(xpath = "//*[@id='file']")
    private WebElement choiceFileButton;

    @FindBy(id = "btnSave")
    private WebElement simpanFileButton;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnConfirm;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]/span[1]")
    private WebElement beforeButton;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/a[1]/span[1]")
    private WebElement ttdButton;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")
    private WebElement submitButton;

    public void clickAfterToSee() {
        clickFileAfter.click();
        driver.navigate().back();
    }

    public void clickBeforeToSee(){
        clickFileBefore.click();
        driver.navigate().back();
    }
    public void clickTtdToSee(){
        clickFileTTD.click();
        driver.navigate().back();
    }

    public void activityDeleteFileAfter() {
        deleteFileAfter.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.navigate().back();
    }

    public void activityDeleteFileBefore() {
        deleteFileBefore.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.navigate().back();
    }
    public void activityDeleteFileTtd() {
        deleteFileTtd.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.navigate().back();
    }
    public void addFileFotoAfter() {
        afterButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\IMG_20230328_141032.jpg");
        delay(10000);
        simpanFileButton.click();
        btnConfirm.click();
        delay(5000);
    }

    public void addFileFotoBefore() {
        beforeButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\IMG_20230328_141032.jpg");
        delay(10000);
        simpanFileButton.click();
        btnConfirm.click();
        delay(5000);
    }

    public void addFileFotoTTD() {
        ttdButton.click();
        choiceFileButton.sendKeys("C:\\Users\\LENOVO\\Documents\\JuaraCoding\\Automation-SiloamApp-Kelompok3\\file\\IMG_20230328_141032.jpg");
        delay(10000);
        simpanFileButton.click();
        btnConfirm.click();
        delay(5000);
        submitButton.click();
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
