Feature: Ny Plante Tilsetning Test

  @q1
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  @q1
  Scenario: Brukeren skal kunne legge til Botanisk navn informasjon
    Given   Klikk Ny Plnate
    Then    Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom arter
    And     Velg varemerke "TM"
    And     Klikk Lagre og Fortsette

  @q1
  Scenario: Brukeren skal kunne legge til Navn og opprinnelse informasjon
    Given  Klikk Navn og opprinnelse
    Then   Klikk Legg til under Opphav
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse
    And    Fyll ut Slekt, Artsepitet for Sekundaer opprinnelse
    And    Klikk Lagre
    Then   Klikk "Nei" for Viltvoksende i Norge og Produsert i Norge
    Then   Klikk Legg til under Synonymer botanisk navn
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse i Synonym
    And    Klikk Lagre
    Then   Klikk Legg til under Andre sprok
    And    Velg Engelsk som sprok
    And    Skriv i "English Name"
    And    Klikk Lagre
    Then   Klikk "Nei" for E-plante

  @q1
  Scenario: Brukeren skal kunne legge til Egenskaper informasjon
    Given  Klikk Egenskaper
    And    Velg Traer
    And    Velg Alltidgronn
    Then   Velg "Ja" fra Pollinator-vennlig
    Then   Velg "Honningplante" fra Matnyttig
    Then   Velg "Hudkontakt" fra Allergi
    Then   Velg "Lang (100-300 år)" fra Naturlig levealder
    Then   Velg "Søknadspliktig iht forskrift fremmede organismer vedl 5" alternativ fra Restriksjoner og vern
    Then   Klikk "Nei" for Vegetativ
    Then   Klikk "Nei" for Fro

  @q1
  Scenario: Brukeren skal kunne legge til Størrelse og form informasjon
    Given  Klikk Storrelse og form
    And    Velg hoyde mellom "5" - "1000"
    And    Velg "Smal (<1/2 av høyde)" fra bredde
    Then   Velg "Klatrende" fra form
    Then   Velg "Pålerot" fra rottype

  @q1
  Scenario: Brukeren skal kunne legge til Bruksområde informasjon
    Given  Klikk Bruksomrode
    And    Klikk Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer
    And    Skriv i "5" - "1500" tregruppe
    And    Skriv i "5" - "1500" Busk gruppe
    And    Skriv i "5" - "1500" Solitaer
    And    Skriv i "5" - "1500" Klippet hekk
    Then   Velg "Liten" fra Dekkevne
    Then   Velg "Middels" fra Beskjaeringsbehov

  @q1
  Scenario: Brukeren skal kunne legge til Plassering informasjon
    Given  Klikk Plassering
    And    Klikk Lysforhold, Jord og Fuktighetsforhold
    And    Skriv i "2" - "4" Innland
    And    Skriv i "3" - "5" Kyst
    Then   Velg "Basisk >7" alternativ fra pH
    Then   Velg "Svak mot salt i jord" alternativ fra Salttoleranse
    Then   Velg "Tåler noe vind" fra Vindtoleranse

  @q1
  Scenario: Brukeren skal kunne legge til Prydverdi informasjon
    Given  Klikk Prydverdi
    Then   Velg "Flere farger innen arten" fra Blomst en eller flere farger
    Then   Velg "Hvit" fra Blomst farge
    Then   Velg "Lilla" fra Blomst andre farger
    Then   Velg "Lite betydelig" fra Blomst prydverdi
    Then   Velg "Ja" fra Fylt
    And    Skriv "2" - "5" i Blomstringstid
    And    Skriv "2" - "5" i Remontering-Gjenblomstring
    And    Klikk "Nei" for Blomsterduft
    And    Klikk "Nei" for Duft blad og stenge
    Then   Velg "Svart" fra Fruktfarge
    Then   Velg "Sommer" fra Frukt tid
    Then   Velg "Flerfarget/broket" fra Bladfarge
    Then   Velg "Fliket" fra Bladform
    Then   Velg "Liten" fra Bladstorrelse
    Then   Velg "Guloransje" fra Hostfarger
    Then   Velg "Silhuett" fra Vinterkarakter
    Then   Velg "Kan ha torner" fra Torner
    Then   Velg "Stripete" fra Stamme barkstruktur
    Then   Velg "Uanselig (brun)" fra Stamme barkfarge
    Then   Velg "Rødbrun" fra Skudd-greiner farge
  @q1
  Scenario: Brukeren skal kunne legge til Bilde
    Given  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "Fotokilde" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "eple"
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
    Then   Skriv "Forfattere" i Forfattere,"2024" i Ar, "Tittel" i Tittel, "Utgiver" i Utgiver, "1" i Fra, "2" i Til, "ISBN123456" ISBN, "https://www.example.com/file.pdf" i Tilgjengelig fra nett og "121220" i Hentet dato
    And    Klikk Lagre





















