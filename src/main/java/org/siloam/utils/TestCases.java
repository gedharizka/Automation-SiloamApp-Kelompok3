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
    T28("Priview Data PNG"),
    T29("faskes awal  User input file format .jpg dokumen"),
    T30("faskes awal  User input file format .pdf dokumen"),
    T31("faskes awal  User input file jpg large than 5MB dokumen"),
    T32("faskes awal User input file format .jpg dokumen then click cancel"),
    T33("faskes awal  User input file format .jpg  dokumen modal closed x"),
    T34("faskes awal  User input file format .png dokumen faskes awal"),
    T35("faskes tujuan  User input file format .jpg dokumen"),
    T36("faskes tujuan  User input file format .pdf dokumen"),
    T37("faskes tujuan  User input file jpg large than 5MB dokumen"),
    T38("faskes tujuan User input file format .jpg dokumen then click cancel"),
    T39("faskes tujuan User input file format .jpg  dokumen modal closed x"),
    T40("faskes tujuan  User input file format .png dokumen"),
    T41("tanda tangan digital  User input file format .jpg dokumen"),
    T42("tanda tangan digital  User input file format .pdf dokumen"),
    T43("tanda tangan digital  User input file jpg large than 5MB dokumen"),
    T44("tanda tangan digital User input file format .jpg dokumen then click cancel"),
    T45("tanda tangan digital User input file format .jpg  dokumen modal closed(x)"),
    T46("tanda tangan digital  User input file format .png dokumen"),
    T47("user input .jpg faskes awal, faskes tujuan, tanda tangan digital"),

    ;

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
