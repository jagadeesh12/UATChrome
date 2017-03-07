Feature: CFT Blueprint launch
  Scenario:  Launch CFT, Stop the Nginx Service , Check Notification and Remediation

    Given I login to catalyst using username and access credentials password
#    And I click on "Bots" option
#    And I verify "Demo-Customername" Botname
#    #And I click on Execute button
#    And I execute "Demo-Customername"
#    And I select RL_Devops from the Choose Environment dropdown menu
#    And I select Sensu Prod from the Monitoring dropdown menu
#    #And I select Sensu Server from the Tag Server dropdown menu
#    And I click on Ok button
#    And I enter unique stack name
#    And I click on ok button
#    And I verify the following message "Your Selected Blueprint is being Launched, kindly check back in a while" on "Launching Blueprint" popup window
#    And I click on the "Close" button on Launching Blueprint
#    And I navigate to the "Workzone"
#    And I click on Menu option
#    And I click on the "RL_Devops" Link
#    And I click on the "Infrastructure" link
#    And I expand the "CloudFormation" section
#    And I verify the stack name and status "CREATE_COMPLETE" in cloudformation
#    And I click on the "Infrastructure" link
#    And I click on the "Instances" link
#    And I click on refresh button
#    And I verify "NginX" and "Catalyst" instances
#    And I verify Bootstrap status for "Catalyst" instances
#    And I extract IP address of NginX instance card
#    And I extract IP address of Catayst instance card
#    Then I verify the new created stack URL
#    And I navigate to catalyst
#    And I click on "Bots" option
##   And I enter "ServiceStop - Demo" in search box
#    And I verify "ServiceStop - Demo" Botname
#    And I execute "ServiceStop - Demo"
#    And I enter "IP" Botname for "Nginx Host IP"
#    And I close the Execute log
#    Then I verify the new created stack URL is not present
#    And I navigate to catalyst
#    And I click on Tracks option
#    And I click on Menu
#    And I click on Telemetry
#    And I click on Instances
#    And I verify Nginx IP
#    And I verify Catalyst IP
#    And I click on Events option
#    And I verify events
#    And I switch to default frame
    And I login in slack bot
    And I click on Botsfactory Project
    Then I verify the Nginx is down
    And I extract the Ticket ID
#    Then Ticket status should be closed
    And I login to service now
    And I search the Ticket ID
    And I verify Ticket status
    And I navigate to catalyst
    And I navigate to the "Workzone"
    And I click on Menu option
    And I click on the "RL_Devops" Link
    And I click on the "Infrastructure" link
    And I expand the "CloudFormation" section
    And I Delete the stack from Cloud Formation
    And I logout from catalyst








