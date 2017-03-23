@Azure
Feature: Blueprint Launch in Azure
  Scenario Outline: As a user I launch Blueprint in Azure using ARM template
#    Given I Login to Azure using "<url>" credential
#    And I enter my "<username>"
#    And I entermy  "<password>"
#    And I click on Sign_in
#    And I click on Menu
#    And I click on ResourceGroup
#    And I click on Add
#    And I enter the  "<Gpname>"
#    And I select on the "<Subscription>"
#    And I select  "<Location>"
#    And I click on Create
#Now I have to open the catalyst to launch the ARM azure blueprint
    Given I Login to catalyst using "<Url>" Acess
    And I enter  "<Username>"  User name text box
    And I enter "<Password>"   Password testbox
    And I click on Login button
    And I click on the "DESIGN" link of this
    And I clicked menu button
    And I click on Azure
    And I click on ARM template
    And I click on Filter
    And I click on New optn
    And I click on ARM1VM-New
    And I click on Blueprint&Organisation
    And I enter    "<BPName>"
    And I select   "<Organisation>"
    And I select the  "<BusinessGroup>"
    And I selected my "<Project>"
    And I click on Configure Template
    And I select the "<Provider>" option
    And I  select  mine "<ResourceGroup>"
    And I enter the   "<AdminUsername>"
    And I put  the "<AdminPwd>"
    And I enter  mine "<DnsLebel>"
    And I  select "<OsVersion>" in optn
    And I hit on ConfigVms
    And I click on SAVE
    And I click on Submit option



    Examples:

     |Url                              |           url            |                username                        | password    | Gpname |Subscription  |Location     |BPName|Organisation|BusinessGroup|Project |Provider     |AdminUsername  |DnsLebel      |ResourceGroup|AdminPwd  |OsVersion |Username|Password|
     |http://neo.rlcatalyst.com/cat3/ | http://portal.azure.com  |rlcatalyst@itsupportrelevancelab.onmicrosoft.com| RLindia#2017|  ARM   |Azure in Open|Southeast Asia|ARMBP |      RL    |Product      |Catalyst|AzureLatest|SradhaAdmin   |sradha-dns-d1   | ARM      |Sradha@123| 14.04.2-LTS |superadmin|superadmin@123|
