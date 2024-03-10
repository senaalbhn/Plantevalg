Feature: Ny Plante Tilsetning Api Test

  @api1
  Scenario: Test for å lagre en ny plante
    Given   URL er redigert for lagre plante
    Then    Payload er redigert for lagre plante
    Then    POST-Request sendes for lagre plante
    And     Det er verifisert at statuskoden er 200
    And     Response body for opprette plante er verifisert

  Scenario: Test for å hente generert planteinformasjon.
    Given   URL er redigert for hente planteinformasjon
    Then    Redigeres forventede data for lagret planten
    Then    GET-Request sendes for hente planteinformasjon
    And     Det er verifisert at statuskoden er 200
    And     Response body for forventede data for lagret planten er verifisert

  Scenario: Test for å redigere planten
    Given   URL er redigert for redigere plante
    Then    Payload er redigert for redigere plante
    Then    PATCH-Request sendes for redigere plante
    And     Det er verifisert at statuskoden er 200
    And     Response body for redigere plante er verifisert

  @
  Scenario: Test for å kan slette planten
    Given   URL er redigert for slette plante
    Then    Delete-Request sendes for slette plante og mottas Response
    And     Det er verifisert at statuskoden er 200
