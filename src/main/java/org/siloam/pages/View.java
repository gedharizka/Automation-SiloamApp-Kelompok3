package org.siloam.pages;

import org.siloam.drivers.DriverSingelton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.siloam.Driver.DriverSingleton;

public class View {
    private WebDriver driver;

    public View() {
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ("/html/body/div[3]/div[2]/div/div[1]/ul[2]/li[3]/a"))
    private WebElement buttonView;

    @FindBy(xpath = ("//*[@id=\"content\"]/h1"))
    private WebElement gettextView;

    @FindBy(xpath = ("//*[@id=\"datepicker\"]"))
    private WebElement formStart;

    @FindBy(xpath = ("/html/body/div[7]/div[1]/table/tbody/tr[1]/td[5]"))
    private WebElement duaNovember;


    @FindBy(xpath = ("//*[@id=\"datepicker2\"]"))
    private WebElement formEnd;

    @FindBy(xpath = ("//*[@id=\"content\"]/form/div/div[3]/div/button"))
    private WebElement filter;

    @FindBy(xpath = ("/html/body/div[7]/div[1]/table/tbody/tr[2]/td[4]"))
    private WebElement delapan;

    @FindBy(xpath = ("//*[@id=\"content\"]/form/div/div[3]/div/a/i"))
    private  WebElement btnRefresh;

    @FindBy(xpath = ("/html/body/div[7]/div[1]/table/tbody/tr[1]/td[4]"))
    private WebElement satuNovember;

    @FindBy(xpath = ("//*[@id=\"content\"]/div[1]/div[1]/form/button"))
    private WebElement exportbtn;

    @FindBy(xpath = ("//*[@id=\"content\"]/div[1]/div[2]/form/button"))
    private WebElement downloadbtn;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[6]/td[7]/a"))
    private WebElement fotoAwal;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[6]/td[8]/a"))
    private WebElement fotoAkhir;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[6]/td[9]/a"))
    private WebElement pdfAgreement;

    @FindBy(xpath = ("//*[@id=\"content\"]/div[1]"))
    private WebElement txtDanger;

    @FindBy(xpath = ("/html/body/div[7]/div[1]/table/tbody/tr[1]/td[7]"))
    private WebElement empatNovember;

    @FindBy(xpath = ("/html/body/div[5]/div[1]"))
    private WebElement noData;

    @FindBy(xpath = ("/html/body/div[7]/div[1]/table/tbody/tr[2]/td[6]"))
    private WebElement sepuluhNovember;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[7]/a"))
    private WebElement fotoAwalJPEG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[8]/a"))
    private WebElement fotoTujuanJPEG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[9]/a"))
    private WebElement pdfAgreementJPEG;

    //JPG

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[2]/td[7]/a"))
    private WebElement fotoAwalJPG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[2]/td[8]/a"))
    private WebElement fotoTujuanJPG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[2]/td[9]/a"))
    private WebElement pdfAgreementJPG;


    //PNG
    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[7]/a"))
    private WebElement fotoAwalPNG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[8]/a"))
    private WebElement fotoTujuanPNG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[9]/a"))
    private WebElement pdfAgreementPNG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[2]/a"))
    private WebElement viewJPEG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[2]/td[2]/a"))
    private WebElement viewJPG;

    @FindBy(xpath = ("//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[2]/a"))
    private WebElement viewPNG;

    @FindBy(xpath = ("//*[@id=\"content\"]/div[2]/div/div/div[1]"))
    private WebElement txtData;













    public void buttonView() {
        buttonView.click();
    }

    public void tanggalStart() {
        formStart.click();
    }

    public void tanggaldua() {
        duaNovember.click();
    }

    public void tanggalend() {
        formEnd.click();
    }
    public  void inputTglDua(){
        formStart.sendKeys("");
    }

    public void tanggaldelapan() {
        delapan.click();
    }

    public void buttonFilter() {
        filter.click();
    }
    public void tanggalSatuNov(){
        satuNovember.click();
    }

    public void buttonRefresh(){
        btnRefresh.click();
    }

    public void btnExport() {
        exportbtn.click();
    }

    public void btnDownload(){
        downloadbtn.click();
    }


    public void getFotoAwal(){
        fotoAwal.click();
    }
    public void getFotoAkhir(){
        fotoAkhir.click();
    }
    public void getPdfAgreement(){
        pdfAgreement.click();
    }
    public void setEmpatNovember(){
        empatNovember.click();
    }

    public void setSepuluhNovember(){
        sepuluhNovember.click();
    }
    public void setFotoAwalJPEG(){
        fotoAwalJPEG.click();
    }
    public void setFotoTujuanJPEG(){
        fotoTujuanJPEG.click();
    }
    public void setPdfAgreementJPEG(){
        pdfAgreementJPEG.click();
    }
    public void setFotoAwalJPG(){
        fotoAwalJPG.click();
    }
    public void setFotoTujuanJPG(){
        fotoTujuanJPG.click();
    }
    public void setPdfAgreementJPG(){
        pdfAgreementJPG.click();
    }

    public void setFotoAwalPNG(){
        fotoAwalPNG.click();
    }
    public void setFotoTujuanPNG(){
        fotoTujuanPNG.click();
    }
    public void setPdfAgreementPNG(){
        pdfAgreementPNG.click();
    }

    public void setViewJPEG(){
        viewJPEG.click();
    }
    public void setViewJPG(){
        viewJPG.click();
    }
    public void setViewPNG(){
        viewPNG.click();
    }






    public String getTextView() {
        return gettextView.getText();
    }

    public String getTextDua(){
        return duaNovember.getText();
    }
    public String getTextDelapan(){
        return delapan.getText();
    }
    public String getTextDanger(){
        return txtDanger.getText();
    }
    public String getTxtKosong(){
        return noData.getText();
    }
    public String getTxtData(){
        return txtData.getText();
    }



}
