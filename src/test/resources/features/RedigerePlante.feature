Feature: Redigere Plante Test

  @q2
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn
  @q2
  Scenario: Brukeren skal kunne velge en plante for redigering
    Given   Klikk Plante
    Then    Klikk Rediger

  Scenario: Brukeren skal kunne redigere Botanisk navn informasjon
    Then    Bytte Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom arter-slekter
    And     Velg varemerke (R-TM)
    And     Klikk Lagre og Fortsette

  Scenario: Brukeren skal kunne redigere Bilde
    Given  Klikk Bilde
    Then   Klikk Legg Til
    Then   Klikk Velg Bilde
    And    Velg type bilde
    And    Velg Fotograf
    And    Skriv i Fotokilde,Notis,Hvor er bilde tatt,Postnummer,Poststed
    Then   Klikk Lagre og Lukk
  @q2
  Scenario: Brukeren skal kunne redigere Bilde Forskning
    Given  Klikk Forskning
    Given  Klikk Legg til forskningsresultat
    Then   Skriv i Forfattere, Ar, Tittel, Utgiver, Fra, Til, ISBN, Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre
