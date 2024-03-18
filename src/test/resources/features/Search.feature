Feature: Søke Test

  @søke @hoyde @blomstfarge @kyst @lystforhold @innland @fuktighetsforhold @blomstringstid @form @plantegruppe @undergruppe @eplante
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  Scenario: Brukeren skal kunne finne planter med søkefelt
    Given   Bruk sokefelt for finne planter
  @plantegruppe
  Scenario: Brukeren skal kunne finne plante med Plantegruppe filter
    Given   Velg "Stauder" po Plantegruppe filter
    Then    Bekreft alle planter er "Stauder"
    And     Tilbake hovedsida
  @undergruppe
  Scenario: Brukeren skal kunne finne plante med Undergruppe filter
    Given   Velg "Bregne" under "Stauder" po Undergruppe filter
    Then    Bekreft alle planter er "Bregne" under "Stauder" Undergruppe
    And     Tilbake hovedsida

  @søke @hoyde #ferdig
  Scenario: Brukeren skal kunne finne plante med Høyde filter
    Given   Velg "100" og "300" po hoyde filter
    Then    Bekreft alle planter er mellom 1 m- 3 m
    And     Tilbake hovedsida

  @form #ferdig
  Scenario: Brukeren skal kunne finne plante med Form filter
    Given   Velg "Klatrende" po Form filter
    Then    Bekreft alle planter har "Klatrende" form
    And     Tilbake hovedsida

  @søke @fuktighetsforhold #ferdig
  Scenario: Brukeren skal kunne finne plante med Fuktighetsforhold filter
    Given   Velg "Tørt" po Fuktighetsforhold filter
    Then    Bekreft alle planter har "Tørt" Fuktighetsforhold
    And     Tilbake hovedsida

  @søke @innland #ferdig
  Scenario: Brukeren skal kunne finne plante med Hardforhet Innland filter
    Given   Velg "1" og "3" po Hardforhet Innland filter
    Then     Bekreft alle planter er mellom 1 - 3 Hardforhet Innland
    And     Tilbake hovedsida

  @søke @kyst #ferdig
  Scenario: Brukeren skal kunne finne plante med Hardforhet kyst filter
    Given   Velg "1" og "3" po Hardforhet kyst filter
    Then     Bekreft alle planter er mellom 1 - 3 Hardforhet kyst
    And     Tilbake hovedsida

  @søke @lystforhold #ferdig
  Scenario: Brukeren skal kunne finne plante med Lysforhold filter
    Given   Velg "Sol" po Lysforhold filter
    Then     Bekreft alle planter  har "Sol" Lysforhold
    And     Tilbake hovedsida

  @søke @blomstfarge #ferdig
  Scenario: Brukeren skal kunne finne plante med Blomst hovedfarge filter
    Given   Velg "Blå" po Blomst hovedfarge filter
    Then     Bekreft alle planter  har "Blå" Blomst hovedfarge
    And     Tilbake hovedsida

  @søke @blomstringstid
  Scenario: Brukeren skal kunne finne plante med Blomstringstid filter
    Given   Velg "4" og "6" po "Blomstringstid" filter
    Then    Bekreft alle planter er mellom 4 - 6 Blomstringstid
    And     Tilbake hovedsida

  @eplante
  Scenario: Brukeren skal kunne finne plante med E-Plante filter
    Given   Velg E-plante
    Then    Bekreft alle planter er E-Plante
    And     Tilbake hovedsida

