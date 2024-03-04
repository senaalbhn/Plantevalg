Feature: Ny Plante Tilsetning Api Test

  @q1 @d
  Scenario: Brukeren må lagre en ny plante
    Given   URL er redigert for lagre plante
    Then    Payload er redigert for lagre plante
    Then    POST-Request sendes for lagre plante
    And     Det er verifisert at statuskoden er 200
    And     Response body for opprette plante er verifisert