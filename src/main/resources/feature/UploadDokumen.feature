Feature: Module Upload Dokumen
  ######## Faskes Awal ##########
  #  UD-01
  Scenario: faskes awal  User input file format .jpg dokumen
    Given user click button faskes awal
    When user click choose file jpg
    Then user click simpan
    Then user click ok

  #  UD-02
  Scenario: faskes awal  User input file format .pdf dokumen
    Given user click button faskes awal
    When user click choose file upload file pdf
    Then user click simpan upload pdf

  #  UD-03
  Scenario: faskes awal  User input file jpg large than 5MB dokumen
    Given user click button faskes awal
    When user click choose file jpg large than 5MB
    Then user click simpan file large

  #  UD-04
  Scenario: faskes awal User input file format .jpg dokumen then click cancel
    Given user click button faskes awal
    When user click choose file jpg
    Then user click cancel

  #  UD-05
  Scenario: faskes awal  User input file format .jpg  dokumen modal closed(x)
    Given user click button faskes awal
    When user click choose file jpg
    Then user click close x

     #  UD-06
  Scenario: faskes awal  User input file format .png dokumen faskes awal
    Given user click button faskes awal
    When user click choose file png
    Then user click simpan
    Then user click ok

  ######## Faskes Tujuan ##########

  Scenario: faskes tujuan  User input file format .jpg dokumen
    Given user click button faskes tujuan
    When user click choose file jpg
    Then user click simpan
    Then user click ok

  #  UD-07
  Scenario: faskes tujuan  User input file format .pdf dokumen
    Given user click button faskes tujuan
    When user click choose file upload file pdf
    Then user click simpan upload pdf

  #  UD-08
  Scenario: faskes tujuan  User input file jpg large than 5MB dokumen
    Given user click button faskes tujuan
    When user click choose file jpg large than 5MB
    Then user click simpan file large

  #  UD-09
  Scenario: faskes tujuan User input file format .jpg dokumen then click cancel
    Given user click button faskes tujuan
    When user click choose file jpg
    Then user click cancel

  #  UD-10
  Scenario: faskes tujuan User input file format .jpg  dokumen modal closed(x)
    Given user click button faskes tujuan
    When user click choose file jpg
    Then user click close x

     #  UD-11
  Scenario: faskes tujuan  User input file format .png dokumen
    Given user click button faskes tujuan
    When user click choose file png
    Then user click simpan
    Then user click ok

  ######## Tanda tangan digital ##########
  Scenario: tanda tangan digital  User input file format .jpg dokumen
    Given user click button tanda tangan digital
    When user click choose file jpg
    Then user click simpan
    Then user click ok

  #  UD-12
  Scenario: tanda tangan digital  User input file format .pdf dokumen
    Given user click button tanda tangan digital
    When user click choose file upload file pdf
    Then user click simpan upload pdf

  #  UD-13
  Scenario: tanda tangan digital  User input file jpg large than 5MB dokumen
    Given user click button tanda tangan digital
    When user click choose file jpg large than 5MB
    Then user click simpan file large

  #  UD-14
  Scenario: tanda tangan digital User input file format .jpg dokumen then click cancel
    Given user click button tanda tangan digital
    When user click choose file jpg
    Then user click cancel

  #  UD-15
  Scenario: tanda tangan digital User input file format .jpg  dokumen modal closed(x)
    Given user click button tanda tangan digital
    When user click choose file jpg
    Then user click close x

   #  UD-16
  Scenario: tanda tangan digital  User input file format .png dokumen
    Given user click button tanda tangan digital
    When user click choose file png
    Then user click simpan
    Then user click ok

  ######## upload all files ##########
  Scenario: user input .jpg faskes awal, faskes tujuan, tanda tangan digital
    Given user click faskes awal
    When user click choose file jpg
    When user click simpan
    When user click ok
    When user click faskes tujuan
    When user click choose file jpg
    When user click simpan
    When user click ok
    When user click tanda tangan digital
    When user click choose file jpg
    When user click simpan
    Then user click ok
    Then user click button selanjutnya
