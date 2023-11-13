package org.siloam.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Input Data Personal Pasien"),
    T3("Upload Data File Foto Personal Pasien"),
    T4("Edit Data Personal Pasien"),
    T5("Input unlimited char nama pasien"),
    T6("Input unlimited char nomor bpjs pasien"),
    T7("Input unlimited char nomor ktp pasien"),
    T8("Input elemen huruf nomor bpjs pasien"),
    T9("Input elemen huruf nomor ktp pasien"),
    T10("Kosongkan nama Data Personal Pasien"),
    T11("Kosongkan nomor bpjs Data Personal Pasien"),
    T12("Kosongkan nomor ktp Data Personal Pasien"),
    T13("Kosongkan alamat Data Personal Pasien"),
    T14("Kosongkan alasan Data Personal Pasien"),
    T15("Lihat file Personal Pasien"),
    T16("Hapus foto after Data Personal Pasien"),
    T17("Hapus foto before Data Personal Pasien"),
    T18("Hapus foto ttd Data Personal Pasien"),
    T19("Edit foto after type png Data Personal Pasien"),
    T20("Edit foto before type png Data Personal Pasien"),
    T21("Edit foto ttd type png Data Personal Pasien");
    private String testCaseName;

    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
