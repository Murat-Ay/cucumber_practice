Feature: US1114 Quality Sign Up Pozitif Test
  @US1114
  Scenario: Kullanici dogru bilgileri girince sayfaya girebilmeli

    Given Kullanici quality demy sayfasina gider
    Then Kullanici Quality Signup linkine tiklar
    Then Kullanici "firstName" e ismini yazar
    Then Kullanici "lastName" e soyadini yazar
    When  E-mail ve yeni password bilgilerini girer
    When  Kullanici Signup butonuna tiklar
    Then  Sayfayi kapatir