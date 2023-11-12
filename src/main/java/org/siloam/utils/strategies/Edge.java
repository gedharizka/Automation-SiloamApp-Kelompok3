package org.siloam.utils.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        String path ="C:\\MyTolls\\edgedriver_win64dua\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", path);
        WebDriver driver = new EdgeDriver();
        return driver;
    }
}
