@US1111
Feature: US1111 AutomationLogin Testi
  Scenario: Kullanici basarili bir sekilde giris yapar

    Given Kullanici "myAutomationUrl" sayfasina gider
    Then Kullanici Signup butonuna tiklar
    Then Kullanici mail bölümüne "mail" gönderir
    Then Kullanici password bölümüne "password" gönderirir
    Then Kullanici login butonuna tiklar
    Then Kullanici Automation sayfasina giris yptigini test eder
    And Sayfayi kapatir