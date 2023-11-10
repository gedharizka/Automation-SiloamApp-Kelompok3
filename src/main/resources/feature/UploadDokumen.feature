Feature: Module Upload Dokumen
  #  UD-01
  Scenario: User input file format .jpg dokumen faskes awal
    Given user click button faskes awal
    When user click choose file jpg
    Then user click simpan
    Then user click ok

#  #  UD-02
#  Scenario: User input file format .pdf dokumen faskes awal
#    Given user click button faskes awal
#    When user click choose file upload file pdf
#    Then user click simpan
#
#  #  UD-03
#  Scenario: User input file jpg large than 5MB dokumen faskes awal
#    Given user click button faskes awal
#    When user click choose file jpg large than 5MB
#    Then user click simpan
#
#  #  UD-04
#  Scenario:User input file format .jpg dokumen faskes awal then click cancel
#    Given user click button faskes awal
#    When user click choose file jpg
#    Then user click cancel
#
#    #  UD-05
#  Scenario: User input file format .jpg  dokumen faskes awal modal closed(x)
#    Given user click button faskes awal
#    When user click choose file jpg
#    Then user click close x
