Feature: Repository Language Search
  Scenario Outline: Check if repository can be searched by programming language

    Given User opens github page 2
    And User inputs <text> text value in search bar 2
    And User clicks enter 2
    And User selects <language> in programming language list
    And User selects first repository 2
    Then Check if repository is displayed 2
    Examples:
      | text | language |
      | "Crashlog" |  "Phyton"  |
      | "Parser" | "Java"       |
      | "SQL Example" | "SQL" |