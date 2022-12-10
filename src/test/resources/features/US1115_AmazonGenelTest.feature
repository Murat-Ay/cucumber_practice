Feature: US1115 Amazon Genel Testi

  @US1115
  Scenario Outline: Kullanici Drop downdan urun secip aratir, sonuclari karsilastirir

    Given Kullanici "amazonUrl" sayfasina gider
    Then Kullanici arama kutusundaki drop down menusunden "<istenilenMenu>" secer
    Then Kullanici amazon arama kutusunda "<istenilenKelimeyi>" arama yapar
    Then Kullanici arattigi "<istenilenKelime>" test eder
    And  Sayfayi kapatir

    Examples:
      | istenilenMenu | istenilenKelimeyi | istenilenKelime |
      | Arts & Crafts | Mona Lisa| Mona Lisa|
      | Automotive    |Lastik| Lastik |
      | Baby          | Biberon| Biberon|
      | Breauty & Personal Care|Krem| Krem|
      | Books|Namik Kemal| Namik Kemal|
      | Computers | Asus| Asus|
