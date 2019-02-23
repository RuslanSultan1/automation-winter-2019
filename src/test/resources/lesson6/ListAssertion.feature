Feature:

  Scenario:
    Given I open EPAM JDI site
    When I login as user 'PITER_CHAILOVSKII'
#    And I expand Services subcategory via header menu
#    And I open "User Table" page via header menu
    And User table contains following values:
      | Number | User             | Description                      |
      | 1      | Roman            | Wolverine                        |
      | 2      | Sergey Ivan      | Spider Man                       |
      | 3      | Vladzimir        | Punisher                         |
      | 4      | Helen Bennett    | Captain America some description |
      | 5      | Yoshi Tannamuri  | Cyclope some description         |
      | 6      | Giovanni Rovelli | Hulk some description            |