Feature: View
#TCC.HRM 0.0.2
 Scenario: Home screen
    Given User click button View
    And User get text view


#TCC.HRM 0.0.3 Filter Data
 Scenario: Filter Data
    Given Masukan Tanggal Start
    Then  Masukan Tanggal dua
    And Masukan Tanggal End
    And  Masukan Tanggal delapan
    And klick Button Filter
   Then user get Data

#TCC HRM 0.0.4 Refresh Data
 Scenario: refresh data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Satu
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And Klick Button Refresh
   Then data berhasil di Refresh

#TCC HRM 0.0.5 Blank Start Date
 Scenario: Input tanpa Start Date
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Send Tanggal dua
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And klick Button Filter
   Then Menampilkan Alert Please Fill Out This Field

 #TCC HRM 0.0.6 Blank End Date
   Scenario: Input Tanpa End Date
      Given Klick Button Refresh
      Then Masukan Tanggal Start
      And Masukan Tanggal Satu
      And  Masukan Tanggal End
      And klick Button Filter
     Then Menampilkan Alert Please Fill Out This Field


#TCC HRM 0.0.7 Blank Start Date And And Date
   Scenario:  Input Tanpa Start Date And End Date
      Given Klick Button Refresh
      Then Masukan Tanggal Start
      And Masukan Send Tanggal dua
      And Masukan Tanggal End
      And Masukan Send Tanggal dua
      And klick Button Filter
     Then Menampilkan Alert Please Fill Out This Field

#TCC HRM 0.0.8 Export Data
 Scenario: Export data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Satu
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And klick Button Filter
    And Klick Button Export

 #TCC HRM 0.0.9 Export Data tanpa Melakukan Filter
    Scenario: Export Data Tanpa Filter
   Given Klick Button Refresh
    And Klick Button Export
    And user Get Text Danger

 #TCC HRM 0.0.10 Export Data Dengan menggunakan Tanggal yang Tidak memiliki Data
  Scenario:  Export Data menggunakan Tanggal Tanpa Data
  Given Klick Button Refresh
  And Masukan Tanggal Start
  And Masukan Tanggal Empat
  And Masukan Tanggal End
  And Masukan Tanggal Empat
  And klick Button Filter
  And Klick Button Export
  And User get text Data Kosong




#TCC HRM 0.0.11 Download Data
 Scenario: download data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Satu
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And klick Button Filter
    And Klick Button Download

#TCC HRM 0.0.12 Download Data Tanpa Filter
  Scenario: Download Data Tanpa Filter
    Given Klick Button Refresh
    And Klick Button Download
    And user Get Text Danger

#TCC HRM 0.0.13 Download Data  Dengan menggunakan Tanggal yang Tidak memiliki Data
  Scenario:Download Data menggunakan Tanggal Tanpa Data
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Empat
    And Masukan Tanggal End
    And Masukan Tanggal Empat
    And klick Button Filter
    And Klick Button Download
    And User get text Data Kosong



#TCC HRM 0.0.14 View Foto Awal dengan Format JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Awal JPEG
    Then Close Faskes


#TCC HRM 0.0.15 View Foto Tujuan dengan Format JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Tujuan JPEG
    Then Close Faskes

#TCC HRM 0.0.16 View Foto Tujuan dengan Format JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button PDF Agreement JPEG
    Then Close Faskes

  #TCC HRM 0.0.17 View Foto Awal dengan Format JPG
  Scenario: View Foto Awal Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Awal JPG
    Then Close Faskes


#TCC HRM 0.0.18 View Foto Tujuan dengan Format JPG
  Scenario: View Foto Tujuan Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Tujuan JPG
    Then Close Faskes

#TCC HRM 0.0.19 View PDF Agreement dengan Format JPG
  Scenario: View PDF Agreement Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button PDF Agreement JPG
    Then Close Faskes

  #TCC HRM 0.0.20 View Foto Awal dengan Format PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Awal PNG
    Then Close Faskes


#TCC HRM 0.0.21 View Foto Tujuan dengan Format PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button Foto Tujuan PNG
    Then Close Faskes

#TCC HRM 0.0.22 View Foto Tujuan dengan Format PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button PDF Agreement PNG
    Then Close Faskes


 #TCC HRM 0.0.23 View data JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button View JPEG
    Then Close Faskes


#TCC HRM 0.0.24 View data JPG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button View JPG
    Then Close Faskes

#TCC HRM 0.0.25 View data PNG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh
    And klick Button Filter
    And Klick Button View PNG
    Then Close Faskes












##TCC HRM 0.0.9 Foto
# Scenario: Foto Faskes Awal
#    Given click Button Faskes Foto Awal
#    Then Close Faskes
#    And click Button Faskes Foto Akhir
#    Then Close Faskes
#    And Click Pdf Agreement
#    Then Close Faskes
