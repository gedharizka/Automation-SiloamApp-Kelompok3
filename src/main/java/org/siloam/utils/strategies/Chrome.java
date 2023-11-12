package org.siloam.utils.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
        @Override
        public WebDriver setStrategy() {
            String path ="C:\\MyTolls\\edgedriver_win64dua\\msedgedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension",false);
            options.addArguments("--no-sandbox");
            return new ChromeDriver(options);
        }
}
