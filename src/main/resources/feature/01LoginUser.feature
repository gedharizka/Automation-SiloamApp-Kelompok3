Feature: Modul Input Login TTD Digital

    #TCC.HRM.001
  Scenario: Login Valid Test
    Given User is on the login page
    When User input username password click button login
    Then User should be logged in

    #TCC.HRM.002
  Scenario: Input Data Personal Pasien
    When User input seluruh data pasien benar
    Then User simpan data pasien benar

    #TCC.HRM.003
  Scenario: Upload Data File Foto Personal Pasien
    When User input file
    Then User simpan data pasien benar