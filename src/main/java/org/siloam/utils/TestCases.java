package org.siloam.utils;

public enum TestCases {
    T1("Quick login");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
