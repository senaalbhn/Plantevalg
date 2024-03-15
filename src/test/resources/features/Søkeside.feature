Feature: Søke Test

  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt
    Then    Skriv "Acer circinatum"
    And     Klikk "Acer circinatum"
    And     Bekreft apnes planteside til "Acer circinatum"
