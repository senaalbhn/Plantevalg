Feature: Ny Plante Tilsetning Test

  @q12
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  @q12
  Scenario: Brukeren skal kunne legge til Botanisk navn informasjon
    Given   Klikk Ny Plnate
    Then    Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom arter-slekter
    And     Velg varemerke (R-TM)
    And     Klikk Lagre og Fortsette

  @q1
  Scenario: Brukeren skal kunne legge til Navn og opprinnelse informasjon
    Given  Klikk Navn og opprinnelse
    Then   Klikk Legg til under Opphav
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse
    And    Fyll ut Slekt, Artsepitet for Sekundaer opprinnelse
    And    Klikk Lagre
    Then   Klikk Nei for Viltvoksende i Norge og Produsert i Norge
    Then   Klikk Legg til under Synonymer botanisk navn
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse i Synonym
    And    Klikk Lagre
    Then   Klikk Legg til under Andre sprok
    And    Velg Engelsk som sprok
    And    Skriv i navn
    And    Klikk Lagre
    Then   Klikk Nei for E-plante

  @q1
  Scenario: Brukeren skal kunne legge til Egenskaper informasjon
    Given  Klikk Egenskaper
    And    Velg Traer
    And    Velg Alltidgronn
    Then   Velg en fra Pollinator-vennlig
    Then   Velg en fra Matnyttig
    Then   Velg en fra Allergi
    Then   Velg en fra Naturlig levealder
    Then   Velg en fra Restriksjoner og vern
    Then   Klikk Nei for Vegetativ
    Then   Klikk Nei for Fro

  @q1
  Scenario: Brukeren skal kunne legge til Størrelse og form informasjon
    Given  Klikk Storrelse og form
    And    Velg hoyde
    And    Velg en fra bredde
    Then   Velg en fra form
    Then   Velg en fra rottype

  @q1
  Scenario: Brukeren skal kunne legge til Bruksområde informasjon
    Given  Klikk Bruksomrode
    And    Klikk Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer
    And    Skriv i tregruppe
    And    Skriv i Busk gruppe
    And    Skriv i Solitaer
    And    Skriv i Klippet hekk
    Then   Velg en fra Dekkevne
    Then   Velg en fra Beskjaeringsbehov

  @q1
  Scenario: Brukeren skal kunne legge til Plassering informasjon
    Given  Klikk Plassering
    And    Klikk Lysforhold, Jord og Fuktighetsforhold
    And    Skriv i Innland
    And    Skriv i Kyst
    Then   Velg en fra pH
    Then   Velg en fra Salttoleranse
    Then   Vindtoleranse

  @q1
  Scenario: Brukeren skal kunne legge til Prydverdi informasjon
    Given  Klikk Prydverdi
    Then   Velg en fra Blomst en eller flere farger
    Then   Velg en fra Blomst farge
    Then   Velg en fra Blomst andre farger
    Then   Velg en fra Blomst prydverdi
    Then   Velg en fra Fylt
    And    Skriv i Blomstringstid
    And    Skriv i Remontering-Gjenblomstring
    And    Klikk Nei for Blomsterduft
    And    Klikk Nei for Duft blad og stenge
    Then   Velg en fra Fruktfarge
    Then   Velg en fra Frukt tid
    Then   Velg en fra Bladfarge
    Then   Velg en fra Bladform
    Then   Velg en fra Bladstørrelse
    Then   Velg en fra Høstfarger
    Then   Velg en fra Vinterkarakter
    Then   Velg en fra Torner
    Then   Velg en fra Stamme barkstruktur
    Then   Velg en fra Stamme barkfarge
    Then   Velg en fra Skudd-greiner farge

  @q1
  Scenario: Brukeren skal kunne legge til Bilde
    Given  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg type bilde
    And    Velg Fotograf
    And    Skriv i Fotokilde,Notis,Hvor er bilde tatt,Postnummer,Poststed
    Then   Klikk Velg Bilde
    Then   Klikk Lagre og Lukk

  @q1
  Scenario: Brukeren skal kunne legge til Tilleggsinformasjon informasjon
    Given  Klikk Tilleggsinformasjon
    Then   Skriv i Tilleggsopplysninger
    And    Skriv i Kommentar
    And    Skriv i Forskeres erfaring med planten

  @q1
  Scenario: Brukeren skal kunne legge til Forskning informasjon
    Given  Klikk Forskning
    Given  Klikk Legg til forskningsresultat
    Then   Skriv i Forfattere, Ar, Tittel, Utgiver, Fra, Til, ISBN, Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre
    Then   Slett Plante
    And    Lukk siden




















