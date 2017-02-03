Feature: As a admin I login into catalyst
 Scenario: As a admin I login into catalyst
 #Given  I login to catalyst using "<username>" and access credentials "<password>"
 Given  Given I login to catalyst using username and access credentials password
   And  I click on "Bots" option
   And  I verify the Botname
   And  I click on Execute button
   And  I select RL_Devops from the Choose Environment dropdown menu
   And  I select Sensu Prod from the Monitoring dropdown menu
   And  I select Sensu Server from the Tag Server dropdown menu
   And  I click on Ok button
   And  I enter unique stack name
   And  I click on Ok button
# Examples:
# | username                | password         |
# | superadmin              |superadmin@123    |
