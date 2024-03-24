Feature: Laste opp og Publisert Bilder

  Scenario: Admin må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  Scenario: Kun Admin skal kunne publisere bilde
    Given   Klikk Ny Plnate
    Then   Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
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

  Scenario: Admin skal kunne redigere bildeinformasjon
    Given  Go til Plantevalg-Admin nettside
    And   Klikk Bilder
    And   Skriv "Avocadoo" i sokefelt og velg plante
    And   Velg "avocado" bilder som skal redigere
    And   Klikk Hvor er bilde tatt for bilde "avocado"
    And    Velg "Vårbilde" type bilde
    And    Velg "Ole Billing Hansen" Fotograf
    And   Skriv "fotokilde til avocado" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    And   Klikk Lagre og Lukk
    And   Klikk Lagre
    Then Go til Plantevalg-siden
    And   Klikk Plante
    And   Klikk Rediger
    And   Klikk Bilde
    And   Klikk Bilde
    Then   Klikk po og bytte det tidligere lagrede Bildet
    And   Bekreft redigering i bildeinformasjon som "Vårbilde" type bilde,"Ole Billing Hansen" Fotograf, "fotokilde til avocado" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    And   Skriv "avocado" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    And   Klikk Lagre og Lukk




  Scenario: Kun Admin skal kunne publisere bilder
    Given   Go til Plantevalg-siden
    Given   Klikk Plante
    Then  Klikk Bilde
    Then  Klikk Bilde
    Then   Klikk Legg Til
    And    Velg "Diversebilde" type bilde
    And    Velg "Sally O’Halloran" Fotograf
    And    Skriv "avocado2" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado2"
    Then   Klikk Lagre og Lukk
    Then   Klikk Legg Til
    And    Velg "Detaljebilde" type bilde
    And    Velg "Erik Burås" Fotograf
    And    Skriv "avocado3" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado3"
    Then   Klikk Lagre og Lukk
    Then   Klikk Legg Til
    And    Velg "Vinterbilde" type bilde
    And    Velg "Ole Billing Hansen" Fotograf
    And    Skriv "avocado4" i Fotokilde, "Notis" i Notis,"Hvor er bilde tatt" i Hvor er bilde tatt,"Postnummer" i Postnummer,"Poststed" i Poststed
    Then   Klikk Velg Bilde "avocado4"
    Then   Klikk Lagre og Lukk
    And   Go til Plantevalg-Admin nettside
    And   Klikk Bilder
    And   Skriv "Avocadoo" i sokefelt og velg plante
    And   Velg "avocado2" bilder som skal publisere
    And   Velg "avocado3" bilder som skal publisere
    And   Velg "avocado4" bilder som skal publisere
    And   Klikk Lagre
    And   Vente for lagring
    And   Go til Plantevalg-siden
    And   Klikk Plante
    And   Klikk plantebilde
    And   Bekreft "avocado2" bilde er publisert
    And   Klikk neste bilde
    And   Bekreft "avocado3" bilde er publisert
    And   Klikk neste bilde
    And   Bekreft "avocado4" bilde er publisert
    And   Klikk neste bilde

  Scenario Outline: Admin skal kunne velge hovedbilde
    And   Go til Plantevalg-Admin nettside
    And   Klikk Bilder
    And   Skriv "Avocadoo" i sokefelt og velg plante
    And   Velg "<bildenavn>" bilder som hovedbilde
    And   Klikk Lagre
    And   Vente for lagring
    And   Go til Plantevalg-siden
    And   Klikk Plante
    And   Klikk plantebilde
    And   Bekreft "<bildenavn>" bilde er hovedbilde
    Examples:
      | bildenavn |
      | avocado   |
      | avocado2  |
      | avocado3  |
      | avocado4  |

  Scenario: Admin skal kunne lagge bilder fra admin side
    Given  Go til Plantevalg-Admin nettside
    Then Klikk Velg Bilde "avocado5"
    And   Vent lasting
    Then  Velg alle
    And   Skriv "avocado" i botanisk navn
    And   Velg "Sommerbilde" type bilde
    And   Velg "Ole Billing Hansen" Fotograf
    And   Skriv i "avocado5" i Fotokilde
    And   Klikk Lagre
    And   Vente for lagring
    Then  Go til Plantevalg-siden
    And   Klikk Plante
    And   Klikk Rediger
    And   Klikk Bilde
    And   Klikk Bilde
    And   Bekreft "avocado5" er lagret

    #slette testinden sonra bitiyor











