Feature: Ny Plante Tilsetning,Redegering og Bekreftelse Test

  @e2eUi
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  @e2eUi
  Scenario: Brukeren skal kunne legge til Botanisk navn informasjon
    Given   Klikk Ny Plnate
    Then    Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom arter
    And     Velg varemerke "TM"
    And     Klikk Lagre og Fortsette

  @e2eUi
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
    And    Bekreft navn finnes


  @q1 @egenskaper
  Scenario: Brukeren skal kunne legge til Egenskaper informasjon
    Given  Klikk Egenskaper
    Then   Velg "Søknadspliktig iht forskrift fremmede organismer vedl 5" alternativ fra Restriksjoner og vern
    Then   Velg "Ja" fra Pollinator-vennlig
    Then   Velg "Honningplante" fra Matnyttig
    Then   Velg "Hudkontakt" fra Allergi
    Then   Velg "Lang (100-300 år)" fra Naturlig levealder
    Then   Klikk "Nei" for Vegetativ
    Then   Klikk "Nei" for Fro
    And    Velg Traer
    And    Velg Alltidgronn

  @q1
  Scenario: Brukeren skal kunne legge til Størrelse og form informasjon
    Given  Klikk Storrelse og form
    And    Velg hoyde mellom "250" - "1000"
    And    Velg "Smal (<1/2 av høyde)" fra bredde
    Then   Velg "Klatrende" fra form
    Then   Velg "Pålerot" fra rottype

  @q1
  Scenario: Brukeren skal kunne legge til Bruksområde informasjon
    Given  Klikk Bruksomrode
    And    Klikk "Nei" Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer
    And    Skriv i "5" - "1500" tregruppe
    And    Skriv i "5" - "1500" Busk gruppe
    And    Skriv i "5" - "1500" Solitaer
    And    Skriv i "5" - "1500" Klippet hekk
    Then   Velg "Liten" fra Dekkevne
    Then   Velg "Middels" fra Beskjaeringsbehov

  @q1
  Scenario: Brukeren skal kunne legge til Plassering informasjon
    Given  Klikk Plassering
    And    Klikk "Nei" Lysforhold, Jord og Fuktighetsforhold
    And    Skriv i "2" - "4" Innland
    And    Skriv i "3" - "5" Kyst
    Then   Velg "Basisk >7" alternativ fra pH
    Then   Velg "Svak mot salt i jord" alternativ fra Salttoleranse
    Then   Velg "Tåler noe vind" fra Vindtoleranse

  @q1
  Scenario: Brukeren skal kunne legge til Prydverdi informasjon
    Given  Klikk Prydverdi
    Then   Velg "Ja" fra Fylt
    And    Klikk "Nei" for Blomsterduft
    And    Klikk "Nei" for Duft blad og stenge
    Then   Velg "Svart" fra Fruktfarge
    Then   Velg "Sommer" fra Frukt tid
    Then   Velg "Guloransje" fra Hostfarger
    Then   Velg "Silhuett" fra Vinterkarakter
    Then   Velg "Kan ha torner" fra Torner
    Then   Velg "Flerfarget/broket" fra Bladfarge
    Then   Velg "Fliket" fra Bladform
    Then   Velg "Liten" fra Bladstorrelse
    Then   Velg "Stripete" fra Stamme barkstruktur
    Then   Velg "Uanselig (brun)" fra Stamme barkfarge
    Then   Velg "Rødbrun" fra Skudd-greiner farge
    Then   Velg "Flere farger innen arten" fra Blomst en eller flere farger
    Then   Velg "Hvit" fra Blomst farge
    Then   Velg "Lilla" fra Blomst andre farger
    Then   Velg "Lite betydelig" fra Blomst prydverdi
    And    Skriv "2" - "6" i Blomstringstid
    And    Skriv "7" - "10" i Remontering-Gjenblomstring

  @
  Scenario: Brukeren skal kunne legge til Bilde
    Given  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "Fotokilde" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado"
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
    Then   Skriv "Forfattere" i Forfattere,"2024" i Ar, "Tittel" i Tittel, "Utgiver" i Utgiver, "1" i Fra, "2" i Til, "ISBN123456" ISBN, "https://www.example.com/file.pdf" i Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre
    And   Vente 3 sekunder

  @e2eUi
  Scenario: Planter skal kunne registreres etter ønske
    Given   Go til Plantevalg-siden
    Given   Klikk Plante
    Given  Bekreft alle informasjon til planten

  @e2eUi @api1
  Scenario: Test for å hente generert planteinformasjon.
    Given   URL er redigert for hente planteinformasjon
    Then    Redigeres forventede data for lagret planten
    Then    GET-Request sendes for hente planteinformasjon
    And     Det er verifisert at statuskoden er 200
    And     Response body for forventede data for lagret planten er verifisert

  @e2eUi
  Scenario: Brukeren skal kunne velge en plante for redigering
    Given   Vente 3 sekunder
    Given   Go til Plantevalg-siden
    Given   Klikk Plante
    Then    Klikk Rediger

  @e2eUi
  Scenario: Brukeren skal kunne redigere Botanisk navn informasjon
    Then    Bytt Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And     Velg Hybrid mellom slekter
    And     Velg varemerke "R"
  @q2
  Scenario: Brukeren skal kunne redigere Navn og opprinnelse informasjon
    Given  Klikk Navn og opprinnelse
    Then   Klikk Opphav
    And    Bytt Slekt, Artsepitet for Primaer opprinnelse
    And    Bytt Slekt, Artsepitet for Sekundaer opprinnelse
    And    Klikk Lagre
    Then   Klikk "Ja" for Viltvoksende i Norge og Produsert i Norge
    Then   Klikk Synonymer som har registert for
    And    Bytt Slekt, Artsepitet for Primaer opprinnelse i Synonym
    Then   Klikk Legg til under Synonymer botanisk navn
    And    Fyll ut Slekt, Artsepitet for Primaer opprinnelse iSynonym
    And    Klikk Lagre
    Then   Klikk po og bytte det tidligere lagrede sproket
    Then   Klikk Legg til
    And    Skriv i Synonymer til
    Then   Klikk Legg til flere sprok under Andre sprok
    And    Velg Norsk som sprok
    And    Skriv i Norsk Navn
    Then   Klikk "Ja" for E-plante
  @q2
  Scenario: Brukeren skal kunne redigere Egenskaper informasjon
    Given  Klikk Egenskaper
    And    Velg Lovfellende
    Then   Velg "Ukjent" fra Pollinator-vennlig
    Then   Velg "Spiselig" fra Matnyttig
    Then   Velg "Sterk blomsterduft" fra Allergi
    Then   Velg "Middels (20-50 år)" fra Naturlig levealder
    Then   Velg "Forbudt iht forskrift fremmede organismer vedl 1" alternativ fra Restriksjoner og vern
    Then   Klikk "Ja" for Vegetativ
    Then   Klikk "Ja" for Fro
  @q2
  Scenario: Brukeren skal kunne redigere Størrelse og form informasjon
    Given  Klikk Storrelse og form
    And    Velg hoyde mellom "350" - "2899"
    And    Velg "Bred (>1/2 av høyde)" fra bredde
    Then   Velg "Slyngende" fra form
    Then   Velg "Hjerterot" fra rottype

  @q2
  Scenario: Brukeren skal kunne redigere Bruksområde informasjon
    Given  Klikk Bruksomrode
    And    Klikk "Ja" Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer
    And    Skriv i "1567" - "2500" tregruppe
    And    Skriv i "1567" - "2500" Busk gruppe
    And    Skriv i "1567" - "2500" Solitaer
    And    Skriv i "1567" - "2500" Klippet hekk
    Then   Velg "Stor" fra Dekkevne
    Then   Velg "Lite" fra Beskjaeringsbehov
  @q2
  Scenario: Brukeren skal kunne redigere Plassering informasjon
    Given  Klikk Plassering
    And    Klikk "Ja" Lysforhold, Jord og Fuktighetsforhold
    And    Skriv i "1" - "7" Innland
    And    Skriv i "6" - "8" Kyst
    Then   Velg "Middels 5,5-7" alternativ fra pH
    Then   Velg "Toleranse for salt i luft" alternativ fra Salttoleranse
    Then   Velg "Bør stå i le" fra Vindtoleranse
  @q2
  Scenario: Brukeren skal kunne redigere Prydverdi informasjon
    Given  Klikk Prydverdi
    Then   Velg "Flerfarget blomst" fra Blomst en eller flere farger
    Then   Velg "Svart" fra Blomst farge
    Then   Velg "Rosa" fra Blomst andre farger
    Then   Velg "Spesielt flott" fra Blomst prydverdi
    Then   Velg "Nei" fra Fylt
    And    Skriv "1" - "5" i Blomstringstid
    And    Skriv "8" - "12" i Remontering-Gjenblomstring
    And    Klikk "Ja" for Blomsterduft
    And    Klikk "Ja" for Duft blad og stenge
    Then   Velg "Uanselig/grønn/brun" fra Fruktfarge
    Then   Velg "Seinhøst" fra Frukt tid
    Then   Velg "Grå/sølv" fra Bladfarge
    Then   Velg "Rund" fra Bladform
    Then   Velg "Middels" fra Bladstorrelse
    Then   Velg "Rødlilla" fra Hostfarger
    Then   Velg "Frø-/Fruktstand" fra Vinterkarakter
    Then   Velg "Uten torner" fra Torner
    Then   Velg "Glatt" fra Stamme barkstruktur
    Then   Velg "Gul (grønn)" fra Stamme barkfarge
    Then   Velg "Grå" fra Skudd-greiner farge
  @q2 @bilde
  Scenario: Brukeren skal kunne redigere Bilde
    Given  Klikk Bilde
    Then   Klikk po og bytte det tidligere lagrede Bildet
    And    Velg "Vårbilde" type bilde
    And    Velg "Sally O’Halloran" Fotograf
    And    Skriv "Fotokilde2" i Fotokilde, "Notis2" i Notis,"Hvor er bilde tatt2" i Hvor er bilde tatt,"Postnummer2" i Postnummer,"Poststed2" i Poststed
    Then   Klikk Velg Bilde "avocado2"
    And    Vent til nytt bilde
    Then   Klikk Lagre og Lukk
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "Fotokilde3" i Fotokilde, "Notis3" i Notis,"Hvor er bilde tatt3" i Hvor er bilde tatt,"Postnummer3" i Postnummer,"Poststed3" i Poststed
    Then   Klikk Velg Bilde "avocado3"
    Then   Klikk Lagre og Lukk
  @q2
  Scenario: Brukeren skal kunne redigere Tilleggsinformasjon informasjon
    Given  Klikk Tilleggsinformasjon
    Then   Bytt Tilleggsopplysninger
    And    Bytt Kommentar
    And    Bytt Forskeres erfaring med planten
  @q2 @forsk
  Scenario: Brukeren skal kunne redigere Forskning
    Given  Klikk Forskning
    Then   Klikk redigere forskningen
    Then   Skriv "Forfattere2" i Forfattere,"2000" i Ar, "Tittel2" i Tittel, "Utgiver2" i Utgiver, "42" i Fra, "76" i Til, "ISBN00000" ISBN, "https://www.example2.com/file.pdf" i Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre
    And    Skriv i Oppsummering av forskningen, Steder for forskning og utproving, Oppsummering av forskningen vedrorende denne planten
    And    Klikk Legg til referanse
    And    Skriv "Forfattere" i Forfattere,"2024" i Ar, "Tittel" i Tittel, "Utgiver" i Utgiver, "1" i Fra, "2" i Til, "ISBN123456" ISBN, "https://www.example.com/file.pdf" i Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre
    And    Klikk Knytt til flere
    And    Skriv "Nivero" i searchbox og velg planten, skriv "Oppsummering av forskningen vedrørende denne planten" i textbox og klikk knytt
    Given  Klikk Legg til forskningsresultat
    And    Skriv "Forfattere" i Forfattere,"2024" i Ar, "Tittel" i Tittel, "Utgiver" i Utgiver, "1" i Fra, "2" i Til, "ISBN123456" ISBN, "https://www.example.com/file.pdf" i Tilgjengelig fra nett og Hentet dato
    And    Klikk Lagre

  @e2eUi
  Scenario: Planter skal kunne redigere etter ønske
    Given   Go til Plantevalg-siden
    Then    Klikk Plante
    And     Bekreft alle informasjon til planten etter redigere
  @e2eUi
  Scenario: Brukeren skal kunne slette planten
    Given    Klikk Rediger
    Then     Slett Plante
    And      Lukk siden

















