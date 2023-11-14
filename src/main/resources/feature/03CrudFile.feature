Feature: Modul Edit And View TTd Digital

    #TCC.HRM.001
  Scenario: Lihat file Personal Pasien
  Given User is on the ttd digital panel
    When User klik tombol foto after
    When User klik tombol foto before
    When User klik tombol foto ttd
    Then User on ttd digital

    #TCC.HRM.002
  Scenario: Hapus foto after Data Personal Pasien
    Given User is on the ttd digital
    When User klik tombol hapus after
    Then User on ttd digital

    #TCC.HRM.003
  Scenario: Hapus foto before Data Personal Pasien
    Given User is on the ttd digital
    When User klik tombol hapus before
    Then User on ttd digital

    #TCC.HRM.004
  Scenario: Hapus foto ttd Data Personal Pasien
    Given User is on the ttd digital
    When User klik tombol hapus ttd
    Then User on ttd digital

    #TCC.HRM.005
  Scenario: Edit foto after type png Data Personal Pasien
    Given User is on the ttd digital
    When User klik button edit file after klik choice klik open klik simpan
    Then User on ttd digital

      #TCC.HRM.006
  Scenario: Edit foto before type png Data Personal Pasien
    Given User is on the ttd digital
    When User klik button edit file before klik choice klik open klik simpan
    Then User on ttd digital

    #TCC.HRM.007
  Scenario: Edit foto ttd type png Data Personal Pasien
    Given User is on the ttd digital
    When User klik button edit file ttd klik choice klik open klik simpan
    Then User on ttd digital