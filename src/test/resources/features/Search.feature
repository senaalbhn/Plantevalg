Feature: Søke Test
  @hoyde @blomstfarge @kyst
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt og Skriv "Acer circinatum"
    Then    Klikk "Acer circinatum"
    And     Bekreft apnes planteside til "Acer circinatum"
    And     Tilbake hovedsida

 Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt og Skriv "Pinus aristata"
    Then    Klikk "Pinus aristata"
    And     Bekreft apnes planteside til "Pinus aristata"
    And     Tilbake hovedsida


  Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt og Skriv "Heliopsis helianthoides 'Lorraine Sunshine'"
    Then    Klikk "Heliopsis helianthoides 'Lorraine Sunshine'"
    And     Bekreft apnes planteside til "Heliopsis helianthoides 'Lorraine Sunshine'"
    And     Tilbake hovedsida

  Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt og Skriv "Delphinium dusky 'Dusky Maidens'"
    Then    Klikk "Delphinium dusky 'Dusky Maidens'"
    And     Bekreft apnes planteside til "Delphinium dusky 'Dusky Maidens'"
    And     Tilbake hovedsida

  Scenario: Brukeren skal kunne finne plante som ønsket
    Given   Klikk sokefelt og Skriv "Therorhodion camtschaticum"
    Then    Klikk "Therorhodion camtschaticum"
    And     Bekreft apnes planteside til "Therorhodion camtschaticum"
    And     Tilbake hovedsida
@hoyde #ferdig
  Scenario: Brukeren skal kunne finne plante med Høyde filter
    Given   Velg "100" og "300" po hoyde filter
    Then     Bekreft alle planter er mellom 1 m- 3 m
@kyst
  Scenario: Brukeren skal kunne finne plante med Hardforhet kyst filter
    Given   Velg "1" og "3" po Hardforhet kyst filter
    And     Bekreft alle planter er mellom 1 - 3 Hardforhet kyst
@blomstfarge #ferdig
  Scenario: Brukeren skal kunne finne plante med Blomst hovedfarge filter
    Given   Velg "Blå" po Blomst hovedfarge filter
    And     Bekreft alle planter  har "Blå" Blomst hovedfarge

