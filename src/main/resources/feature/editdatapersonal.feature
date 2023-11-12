Feature: Modul Edit TTd Digital

    #TCC.HRM.001
  Scenario: Edit Data Personal Pasien
  Given User is on the ttd digital page
    When User input nama pasien benar
    When User input nomor bpjs pasien benar
    When User input nomor ktp pasien benar
    When User input alamat pasien benar
    When Pilih kota pasien benar
    When Input faskes pertama pasien benar
    When Pilih faskes tujuan pasien benar
    When User input alasan pasien benar
    When User save data pasien benar
    Then User edit data pasien

      #TCC.HRM.002
  Scenario:Input unlimited char nama pasien
    When User input 100 karakter nama pasien
    Then User edit data pasien

    #TCC.HRM.003
  Scenario:Input unlimited char nomor bpjs pasien
    When User input 30 karakter nomor bpjs pasien
    Then User edit data pasien

    #TCC.HRM.004
  Scenario:Input unlimited char nomor ktp pasien
    When User input 30 karakter nomor ktp pasien
    Then User edit data pasien

    #TCC.HRM.005
  Scenario:Input elemen huruf nomor bpjs pasien
    When User input elemen huruf nomor bpjs pasien
    Then User edit data pasien

    #TCC.HRM.006
  Scenario:Input elemen huruf nomor ktp pasien
    When User input elemen huruf nomor ktp pasien
    Then User edit data pasien

    #TCC.HRM.007
  Scenario: Kosongkan nama Data Personal Pasien
    When User hapus nama pasien
    Then User edit data pasien

    #TCC.HRM.008
  Scenario: Kosongkan nomor bpjs Data Personal Pasien
    When User hapus no bpjs pasien
    Then User edit data pasien

    #TCC.HRM.009
  Scenario: Kosongkan nomor ktp Data Personal Pasien
    When User hapus no ktp pasien
    Then User edit data pasien

    #TCC.HRM.0010
  Scenario: Kosongkan alamat Data Personal Pasien
    When User hapus alamat pasien
    Then User edit data pasien

    #TCC.HRM.0011
  Scenario: Kosongkan alasan Data Personal Pasien
    When User hapus alasan pasien
    Then User edit data pasien