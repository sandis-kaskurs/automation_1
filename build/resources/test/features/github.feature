Feature: Search Repository
  Scenario Outline: Find a Repository and Open it

    Given User opens github page
    And User inputs <text> text value in search bar
    And User clicks enter
    And User selects first repository
    Then Check if repository is displayed
    Examples:
      | text |
      | "Crashlog" |
      | "Parser" |
      | "SQL Example" |