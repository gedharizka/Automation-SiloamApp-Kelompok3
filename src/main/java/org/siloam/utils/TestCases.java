package org.siloam.utils;

public enum TestCases {
    T1("Quick login"),
    T2("Home screen"),

    T3("Filter Data"),

    T4("Refresh data"),

    T5("Blank Start Date"),

    T6("Blank End Date"),


    T7("Input Tanpa Start Date And End Date"),

    T8("Export data"),
    T9("Export Data tanpa Melakukan Filter"),
    T10("Export Data menggunakan Tanggal Tanpa Data"),

    T11("download data"),

    T12("Download Data Tanpa Filter"),
    T13("Download Data Tanpa Tanggal Tanpa Data"),
    T14("View Foto Awal Format JPEG"),
    T15("View Foto Awal Tujuan JPEG"),
    T16("View PDF Agreement Format JPEG"),

    T17("View Foto Awal Format JPG"),
    T18("View Foto Awal Tujuan JPG"),
    T19("View PDF Agreement Format JPG"),

    T20("View Foto Awal Format PNG"),
    T21("View Foto Awal Tujuan PNG"),
    T22("View PDF Agreement Format PNG"),
    T23("View Data JPEG"),
    T24("View Data JPG"),
    T25("View Data PNG"),
    T26("Preview Data JPEG"),
    T27("Priview Data JPG"),
    T28("Priview Data PNG");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
