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
    Then    Bytt Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom slekter
    And     Velg varemerke "R"

  Scenario: Brukeren skal kunne redigere Navn og opprinnelse informasjon
    Given  Klikk Navn og opprinnelse
    Then   Klikk Opphav
    And    Bytt Slekt, Artsepitet for Primaer opprinnelse
    And    Bytt Slekt, Artsepitet for Sekundaer opprinnelse
    And    Klikk Lagre
    Then   Klikk "Ja" for Viltvoksende i Norge og Produsert i Norge
    Then   Klikk Synonymer som har registert for
    And    Bytt Slekt, Artsepitet for Primaer opprinnelse i Synonym
    And    Klikk Lagre
    Then   Klikk Legg til under Synonymer botanisk navn
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse i Synonym
    And    Klikk Lagre
    Then   Klikk po og bytte det tidligere lagrede sproket
    Then   Klikk Legg til
    And    Skriv i Synonymer til
    Then   Klikk Legg til flere sprok under Andre sprok
    And    Velg Norsk som sprok
    And    Skriv i "Norsk Navn"
    And    Klikk Lagre
    Then   Klikk "Ja" for E-plante

  Scenario: Brukeren skal kunne redigere Egenskaper informasjon
    Given  Klikk Egenskaper
    And    Velg Stauder
    And    Velg Bregne
    Then   Velg "Ukjent" fra Pollinator-vennlig
    Then   Velg "Spiselig" fra Matnyttig
    Then   Velg "Sterk blomsterduft" fra Allergi
    Then   Velg en annen fra Restriksjoner og vern
    Then   Klikk "Ja" for Vegetativ
    Then   Klikk "Ja" for Fro

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
