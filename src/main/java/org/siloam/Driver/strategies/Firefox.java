package org.siloam.Driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox  implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
//        String path = "C:\\mytools\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver","C:\\mytools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
