Feature: Laste opp og Publisert Bilder

  Scenario: Kun Admin skal kunne publisere bilde
    Given Go til Plantevalg-siden
    Then  Skriv i epost og passord, klikk Logg inn
    And   Klikk Ny Plnate
    And   Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And   Klikk Lagre og Fortsette
    And   Vente 2 sekunder
    Given  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "Fotokilde" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado"
    Then   Klikk Lagre og Lukk
    And   Go til Plantevalg-Admin nettside
    And   Klikk Bilder
    And   Skriv "Avocadoo" i sokefelt og velg plante
    And   Velg "avocado" bilder som skal publisere
    And   Skriv i "avocado" i Fotokilde
    And   Klikk Lagre
    And   Go til Plantevalg-siden
    And   Klikk Plante
    And   Bekreft "avocado" bilde er publisert

  Scenario: Kun Admin skal kunne publisere bilder
    Given Go til Plantevalg-siden
    Then  Skriv i epost og passord, klikk Logg inn
    And   Klikk Ny Plnate
    And   Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And   Klikk Lagre og Fortsette
    And   Vente 2 sekunder
    Given  Klikk Bilde
    Given  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Sally O’Halloran" Fotograf
    And    Skriv "avocado" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado"
    Then   Klikk Lagre og Lukk
    Then   Klikk Legg Til
    And    Velg "Detaljebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "avocado2" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado2"
    Then   Klikk Lagre og Lukk
    Then   Klikk Legg Til
    And    Velg "Vinterbilde" type bilde
    And    Velg "Ole Billing Hansen" Fotograf
    And    Skriv "avocado3" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado3"
    Then   Klikk Lagre og Lukk
    And   Go til Plantevalg-Admin nettside
    And   Klikk Bilder
    And   Skriv "Avocadoo" i sokefelt og velg plante
    And   Velg "avocado" bilder som skal publisere
    And   Velg "avocado2" bilder som skal publisere
    And   Velg "avocado3" bilder som skal publisere
    And   Vente 2 sekunder
    And   Klikk Lagre
    And   Go til Plantevalg-siden
    And   Klikk Plante
    And   Bekreft "avocado" bilde er publisert
    And   Klikk nsete bilde
    And   Bekreft "avocado2" bilde er publisert
    And   Klikk nsete bilde
    And   Bekreft "avocado2" bilde er publisert
    And   Klikk nsete bilde


