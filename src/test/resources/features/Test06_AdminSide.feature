Feature: Admin Side Tester

  Scenario: Admin skal kunne få tilgang til Admin siden
    Given Go til Plantevalg-siden
    Then  Skriv i epost og passord, klikk Logg inn
    And   Vente 2 sekunder
    And   Go til Plantevalg-Admin nettside


  Scenario Outline: Admin skal kunne bruke plantegruppe filter
    And   Klikk Bilder
    Given Velg "<plantegrupper>" po Plantegruppe
    And   Bekreft alle planter er "<plantegrupper>" po admin side
    Examples:
      | plantegrupper |
      | Trær          |
      | Busker        |
      | Klatrere      |
      | Stauder       |

  Scenario Outline: Admin skal kunne bruke plantegruppe og undergruppe filter
    And   Klikk Bilder
    Given  Velg "<undergruppe>" under "<plantegrupper>" po Undergruppe
    And   Bekreft alle planter er "<undergruppe>" under "<plantegrupper>" po admin side
    Examples:
      | plantegrupper | undergruppe  |
      | Trær          | Alltidgrønn  |
      | Trær          | Løvfellende  |
      | Busker        | Løvfellende  |
      | Busker        | Alltidgrønn  |
      | Klatrere      | Klatreplante |
      | Klatrere      | Slyngplante  |
      | Stauder       | Alltidgrønn  |
      | Stauder       | Staude       |
      | Stauder       | Prydgras/siv |
      | Stauder       | Bregne       |