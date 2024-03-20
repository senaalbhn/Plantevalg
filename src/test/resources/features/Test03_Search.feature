Feature: Bruke Filter Test

  @søke @hoyde @blomstfarge @kyst @lystforhold @innland @fuktighetsforhold @blomstringstid @form @plantegruppe @undergruppe @eplante
  Scenario: Brukeren må kunne logge inn på Plantevalgs nettside
    Given   Go til Plantevalg-siden
    Then    Skriv i epost og passord, klikk Logg inn

  @søke
  Scenario: Bkukeren må kunne finne planter med søkefelt
    Given   Bruk sokefelt for finne planter
    *       Tilbake hovedsida

  @søke
  Scenario Outline: Brukeren skal kunne finne plante med Plantegruppe filter
    Given   Velg "<plantegrupper>" po Plantegruppe filter
    Then    Bekreft alle planter er "<plantegrupper>"
    And     Tilbake hovedsida
    Examples:
      | plantegrupper |
      | Trær          |
      | Busker        |
      | Klatrere      |
      | Stauder       |

  @søke
  Scenario Outline: Brukeren skal kunne finne plante med Undergruppe filter
    Given   Velg "<undergruppe>" under "<plantegrupper>" po Undergruppe filter
    Then    Bekreft alle planter er "<undergruppe>" under "<plantegrupper>" Undergruppe
    And     Tilbake hovedsida
    Examples:
      | plantegrupper | undergruppe  |
      | Trær          | Alltidgrønn  |
      | Trær          | Løvfellende  |
      | Busker        | Løvfellende  |
      | Busker        | Alltidgrønn  |
      | Klatrere      | Klatreplante |
      | Klatrere      | Slyngplante  |
      | Stauder       | Alltidgrønn  |
      | Stauder       | Staude       |
      | Stauder       | Prydgras/siv |
      | Stauder       | Bregne       |


  @form  @søke
  Scenario Outline: Brukeren skal kunne finne plante med Form filter
    Given   Velg "<form>" po Form filter
    Then    Bekreft alle planter har "<form>" form
    And     Tilbake hovedsida
    Examples:
      | form                  |
      | Hengende              |
      | Kjegle (='pyramidal') |
      | Klatrende             |
      | Kule/halvkule         |
      | Matte                 |
      | Nedliggende/krypende  |
      | Opprett               |
      | Oval='Eggformet'      |
      | Slyngende             |
      | Spredende/vandrende   |
      | Søyle                 |
      | Tue                   |
      | Vase (smal og bred)   |

  @søke @fuktighetsforhold #ferdig
  Scenario Outline: Brukeren skal kunne finne plante med Fuktighetsforhold filter
    Given   Velg "<fuktighetsforhold>" po Fuktighetsforhold filter
    Then    Bekreft alle planter har "<fuktighetsforhold>" Fuktighetsforhold
    And     Tilbake hovedsida
    Examples:
      | fuktighetsforhold            |
      | Tørt                         |
      | Periodevis fuktig eller tørt |
      | Jevnt fuktig/aldri helt tørt |
      | Vannmettet                   |


  @søke @innland #ferdig
  Scenario: Brukeren skal kunne finne plante med Hardforhet Innland filter
    Given   Velg "1" og "3" po Hardforhet Innland filter
    Then     Bekreft alle planter er mellom 1 - 3 Hardforhet Innland
    And     Tilbake hovedsida

  @søke @kyst #ferdig
  Scenario: Brukeren skal kunne finne plante med Hardforhet kyst filter
    Given   Velg "1" og "3" po Hardforhet kyst filter
    Then     Bekreft alle planter er mellom 1 - 3 Hardforhet kyst
    And     Tilbake hovedsida

  @søke @lystforhold #ferdig
  Scenario Outline: Brukeren skal kunne finne plante med Lysforhold filter
    Given   Velg "<lysforhold>" po Lysforhold filter
    Then     Bekreft alle planter  har "<lysforhold>" Lysforhold
    And     Tilbake hovedsida
    Examples:
      | lysforhold |
      | Sol        |
      | Halvskygge |
      | Skygge     |

  @søke @blomstfarge #ferdig
  Scenario Outline: Brukeren skal kunne finne plante med Blomst hovedfarge filter
    Given   Velg "<hovedfarge>" po Blomst hovedfarge filter
    Then     Bekreft alle planter  har "<hovedfarge>" Blomst hovedfarge
    And     Tilbake hovedsida
    Examples:
      | hovedfarge          |
      | Blå                 |
      | Gul                 |
      | Gulgrønn            |
      | Hvit                |
      | Lilla/Fiolett       |
      | Oransje             |
      | Rosa                |
      | Uanselig/grønn/brun |
      | Grønn               |
      | Rød                 |
      | Brun                |
      | Svart               |

  @søke @blomstringstid
  Scenario: Brukeren skal kunne finne plante med Blomstringstid filter
    Given   Velg "4" og "6" po "Blomstringstid" filter
    Then    Bekreft alle planter er mellom 4 - 6 Blomstringstid
    And     Tilbake hovedsida

  @søke @hoyde #ferdig
  Scenario: Brukeren skal kunne finne plante med Høyde filter
    Given   Velg "100" og "300" po hoyde filter
    Then    Bekreft alle planter er mellom 1 m- 3 m
    And     Tilbake hovedsida

  @eplante  @søke
  Scenario: Brukeren skal kunne finne plante med E-Plante filter
    Given   Velg E-plante
    Then    Bekreft alle planter er E-Plante
    And     Tilbake hovedsida

