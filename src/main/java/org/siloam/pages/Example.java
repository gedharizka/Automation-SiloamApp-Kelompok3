package org.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.siloam.utils.DriverSingelton;

public class Example {
    private WebDriver driver;

    public Example(){
        this.driver = DriverSingelton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement textHeader;

    public void login_as_admin(){
        username.sendKeys("admindika");
        password.sendKeys("d1k4@passw0rd");
        btnLogin.click();
    }
    public void login_as_sales(){
        username.sendKeys("D6200927");
        password.sendKeys("1997-10-23");
        btnLogin.click();
    }
    public String getTxtHome(){
        return textHeader.getText();
    }

}
