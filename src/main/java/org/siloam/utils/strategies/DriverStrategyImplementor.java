package org.siloam.utils.strategies;

public class DriverStrategyImplementor {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "firefox":
                return  new Firefox();
            case "edge":
                return  new Edge();

            default:
                return null;
        }
    }
}
