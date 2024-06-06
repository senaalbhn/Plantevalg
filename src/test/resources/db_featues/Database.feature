Feature: Bekreft planteinfo
  Scenario: Test for bekreftelse plante
    Given   Databaseforbindelse er etablert
    When   Foresporsel sendes for fo registrert planteinformasjon
    Then   Registrert planteinformasjon er verifisert
    And    Tilkoblingen er frakoblet