Feature:


  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  @form #ferdig
  Scenario Outline: Brukeren skal kunne finne plante med Blomst hovedfarge filter
    *       Vente 2 sekunder
    Given   Velg "<hovedfarge>" po Blomst hovedfarge filter
    Then     Bekreft alle planter  har "<hovedfarge>" Blomst hovedfarge
    And     Tilbake hovedsida
    *       Vente 2 sekunder

    Examples:
      | hovedfarge          |
      | Blå                 |
      | Gul                 |
      | Gulgrønn            |
      | Hvit                |
      | Lilla/Fiolett       |
      | Oransje             |
      | Rosa                |
      | Uanselig/grønn/brun |
      | Grønn               |
      | Rød                 |
      | Brun                |
      | Svart               |