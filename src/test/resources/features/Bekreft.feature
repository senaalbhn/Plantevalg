Feature: Bekreftelse Test

@bk
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside og velge plante
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn
    Given   Klikk Plante
  @bk
  Scenario: Planter skal kunne registreres etter ønske
    Given  Bekreft alle informasjon til planten

  Scenario: Planter skal kunne redigere etter ønske
    Given  Bekreft alle informasjon til planten etter redigere

