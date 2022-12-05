@US01
Feature: US0101 Quality Demy

  Scenario: Kullanici basarili bir sekilde giris yapabilmeli

    Given Kullanici quality demy sayfasina gider
    When  Email ve password bilgilerini girerek giris yapar
    Then  Basarili bir sekilde giris yapildigini test eder
    Then  Sayfayi kapatir
