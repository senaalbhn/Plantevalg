Feature: Ny Plante Tilsetning Api Test

  @api1
  Scenario: Brukeren kan lagre en ny plante
    Given   URL er redigert for lagre plante
    Then    Payload er redigert for lagre plante
    Then    POST-Request sendes for lagre plante
    And     Det er verifisert at statuskoden er 200
    And     Response body for opprette plante er verifisert

  Scenario: Brukeren kan redigere planten
    Given   URL er redigert for redigere plante
    Then    Payload er redigert for redigere plante
    Then    POST-Request sendes for redigere plante
    And     Det er verifisert at statuskoden er 200
    And     Response body for redigere plante er verifisert



  @api1
  Scenario: Brukeren kan slette planten
    Given   URL er redigert for slette plante
    Then    Delete-Request sendes for slette plante og mottas Response
    And     Det er verifisert at statuskoden er 200
