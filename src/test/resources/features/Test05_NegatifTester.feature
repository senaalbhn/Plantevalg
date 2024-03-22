Feature: Negatif Tester

  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given Go til Plantevalg-siden
    Then Skriv i epost og passord, klikk Logg inn

  Scenario: Brukeren skal kunne ikke registrere plante med navn som finnes
    Given Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Bekreft plante ikke lagres
    And Klikk Plante
    And Klikk Rediger
    And Slett Plante

  Scenario: Brukeren skal kunne ikke registrere plante med navn som finnes gjennom redigering
    Given Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Klikk Plante som lagres sist
    And Klikk Rediger
    And Fyll ut Slekt, Artsepitet
    And Klikk Lagre og Fortsette
    And Bekreft plante ikke lagres
    And Tilbake hovedsida
    And Klikk Plante som lagres sist
    And Slett Plante

  Scenario: Brukeren må kunne lagre et tidligere eksisterende plante med samme navn etter slettet
    Given Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Klikk Plante
    And Klikk Rediger
    And Slett Plante
    And Vente 2 sekunder
    And Klikk Ny Plnate
    And Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke
    And Klikk Lagre og Fortsette
    And Tilbake hovedsida
    And Bekreftelse plante lagres
    And Klikk Plante
    And Klikk Rediger
    And Slett Plante
    And Lukk siden
