$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/catalyst/settings/UAT/UAT.feature");
formatter.feature({
  "line": 1,
  "name": "As a admin I login into catalyst",
  "description": "",
  "id": "as-a-admin-i-login-into-catalyst",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "As a admin I login into catalyst",
  "description": "",
  "id": "as-a-admin-i-login-into-catalyst;as-a-admin-i-login-into-catalyst",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I login to catalyst using username and access credentials password",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on \"Bots\" option",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I verify \"Demo-Customername\" Botname",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#And I click on Execute button"
    }
  ],
  "line": 8,
  "name": "I execute \"Demo-Customername\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select RL_Devops from the Choose Environment dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select Sensu Prod from the Monitoring dropdown menu",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#And I select Sensu Server from the Tag Server dropdown menu"
    }
  ],
  "line": 12,
  "name": "I click on Ok button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter unique stack name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on ok button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the following message \"Your Selected Blueprint is being Launched, kindly check back in a while\" on \"Launching Blueprint\" popup window",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the \"Close\" button on Launching Blueprint",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I navigate to the \"Workzone\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Menu option",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on the \"RL_Devops\" Link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on the \"Infrastructure\" link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I expand the \"CloudFormation\" section",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify the stack name and status \"CREATE_COMPLETE\" in cloudformation",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on the \"Infrastructure\" link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on the \"Instances\" link",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on refresh button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify \"NginX\" and \"Catalyst\" instances",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify Bootstrap status for \"Catalyst\" instances",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I extract IP address of NginX instance card",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I extract IP address of Catayst instance card",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the new created stack URL",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I navigate to catalyst",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on \"Bots\" option",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#   And I enter \"ServiceStop - Demo\" in search box"
    }
  ],
  "line": 34,
  "name": "I verify \"ServiceStop - Demo\" Botname",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I execute \"ServiceStop - Demo\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I enter \"IP\" Botname for \"Nginx Host IP\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I close the Execute log",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I verify the new created stack URL is not present",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I navigate to catalyst",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on Tracks option",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on Menu",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on Telemetry",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on Instances",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify Nginx IP",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I verify Catalyst IP",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on Events option",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I verify events",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I switch to default frame",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I login in slack bot",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click on Botsfactory Project",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I verify the Nginx is down",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I extract the Ticket ID",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 53,
      "value": "#    Then Ticket status should be closed"
    }
  ],
  "line": 54,
  "name": "I login to service now",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I search the Ticket ID",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I verify Ticket status",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I navigate to catalyst",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I navigate to the \"Workzone\"",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I click on Menu option",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I click on the \"RL_Devops\" Link",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on the \"Infrastructure\" link",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I expand the \"CloudFormation\" section",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I Delete the stack from Cloud Formation",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I logout from catalyst",
  "keyword": "And "
});
formatter.match({
  "location": "UATSteps.iLoginToCatalystUsingUsernameAndAccessCredentialsPassword()"
});
formatter.result({
  "duration": 54033468695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bots",
      "offset": 12
    }
  ],
  "location": "UATSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 10807438671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Demo-Customername",
      "offset": 10
    }
  ],
  "location": "UATSteps.iVerifyBotname(String)"
});
formatter.result({
  "duration": 11103562618,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Demo-Customername",
      "offset": 11
    }
  ],
  "location": "UATSteps.iExecute(String)"
});
formatter.result({
  "duration": 446683888,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iSelectRL_DevopsFromTheChooseEnvironmentDropdownMenu()"
});
formatter.result({
  "duration": 11253972061,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iSelectSensuProdFromTheMonitoringDropdownMenu()"
});
formatter.result({
  "duration": 10177451083,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnOkButton()"
});
formatter.result({
  "duration": 386329252,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iEnterUniqueStackName()"
});
formatter.result({
  "duration": 10229138634,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnokButton()"
});
formatter.result({
  "duration": 624577422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Selected Blueprint is being Launched, kindly check back in a while",
      "offset": 32
    },
    {
      "val": "Launching Blueprint",
      "offset": 109
    }
  ],
  "location": "CFTSteps.I_verify_the_following_message_on_popup_window(String,String)"
});formatter.result({
  "duration": 272725985592,
  "error_message": "junit.framework.AssertionFailedError\n\tat junit.framework.Assert.fail(Assert.java:55)\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\n\tat com.rl.qa.views.CFTViews.verifyMessage(CFTViews.java:510)\n\tat com.rl.qa.steps.CFTSteps.I_verify_the_following_message_on_popup_window(CFTSteps.java:128)\n\tat ✽.And I verify the following message \"Your Selected Blueprint is being Launched, kindly check back in a while\" on \"Launching Blueprint\" popup window(src/test/resources/catalyst/settings/UAT/UAT.feature:15)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Close",
      "offset": 16
    }
  ],
  "location": "UATSteps.iClickOnTheButtonOnLaunchingBlueprint(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Workzone",
      "offset": 19
    }
  ],
  "location": "CFTSteps.I_navigate_to_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnMenuOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "RL_Devops",
      "offset": 16
    }
  ],
  "location": "UATSteps.iClickOnTheLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Infrastructure",
      "offset": 16
    }
  ],
  "location": "CFTSteps.I_click_on_the_link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CloudFormation",
      "offset": 14
    }
  ],
  "location": "CFTSteps.I_expand_the_section(String)"
});
formatformatter.result({
  "duration": 5427508857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Instances",
      "offset": 16
    }
  ],
  "location": "CFTSteps.I_click_on_the_link(String)"
});
formatter.result({
  "duration": 5661641908,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnRefreshButton()"
});
formatter.result({
  "duration": 3369659774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NginX",
      "offset": 10
    },
    {
      "val": "Catalyst",
      "offset": 22
    }
  ],
  "location": "UATSteps.iVerifyAndInstances(String,String)"
});
formatter.result({
  "duration": 21975206561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Catalyst",
      "offset": 31
    }
  ],
  "location": "UATSteps.iVerifyBootstrapStatusForInstances(String)"
});
formatter.result({
  "duration": 160393469882,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iExtractIPAddressOfNginXInstanceCard()"
});
formatter.result({
  "duration": 10212834959,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iExtractIPAddressOfCataystInstanceCard()"
});
formatter.result({
  "duration": 10208540489,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iVerifyTheNewCreatedStackURL()"
});
formatter.result({
  "duration": 104106254203,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iNavigateToCatalyst()"
});
formatter.result({
  "duration": 30139646873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bots",
      "offset": 12
    }
  ],
  "location": "UATSteps.iClickOnOption(String)"
});
formatter.result({
  "duration": 1925769561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ServiceStop - Demo",
      "offset": 10
    }
  ],
  "location": "UATSteps.iVerifyBotname(String)"
});
formatter.result({
  "duration": 11896824901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ServiceStop - Demo",
      "offset": 11
    }
  ],
  "location": "UATSteps.iExecute(String)"
});
formatter.result({
  "duration": 525005500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IP",
      "offset": 9
    },
    {
      "val": "Nginx Host IP",
      "offset": 26
    }
  ],
  "location": "CFTSteps.iEnterBotnameFor(String,String)"
});
formatter.result({
  "duration": 22410941201,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iCloseTheExecuteLog()"
});
formatter.result({
  "duration": 20693617047,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iVerifyTheNewCreatedStackURLIsNotPresent()"
});
formatter.result({
  "duration": 141922579602,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iNavigateToCatalyst()"
});
formatter.result({
  "duration": 23544456699,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnTracksOption()"
});
formatter.result({
  "duration": 464142494,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnMenu()"
});
formatter.result({
  "duration": 4621678243,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnTelemetry()"
});
formatter.result({
  "duration": 803471925,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnInstances()"
});
formatter.result({
  "duration": 6341799210,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iVerifyNginxIP()"
});
formatter.result({
  "duration": 130708676736,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iVerifyCatalystIP()"
});
formatter.result({
  "duration": 42020310376,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnEventsOption()"
});
formatter.result({
  "duration": 3130825863,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iVerifyEvents()"
});
formatter.result({
  "duration": 40354109441,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.I_switch_to_default_frame()"
});
formatter.result({
  "duration": 12699789,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iLoginInSlackBot()"
});
formatter.result({
  "duration": 45014256145,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iClickOnBotsfactoryProject()"
});
formatter.result({
  "duration": 25788260976,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iVerifyTheNginxIsDown()"
});
formatter.result({
  "duration": 13381318382,
  "status": "passed"
});
formatter.match({
  "location": "CFTSteps.iExtractTheTicketID()"
});
formatter.result({
  "duration": 52088256498,
  "error_message": "junit.framework.AssertionFailedError: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[contains(text(),\u0027Service nginx is up for 52.9.133.110.\u0027)]/a\"}\nCommand duration or timeout: 40.01 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027sse0049-GA-78LMT-S2\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-62-generic\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d35.0, platform\u003dLINUX, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 6b322bf2-8d97-41fe-9e90-a416dc6c106e\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(text(),\u0027Service nginx is up for 52.9.133.110.\u0027)]/a}\n\tat junit.framework.Assert.fail(Assert.java:57)\n\tat junit.framework.TestCase.fail(TestCase.java:227)\n\tat com.rl.qa.views.UATViews.extractTicket(UATViews.java:590)\n\tat com.rl.qa.steps.CFTSteps.iExtractTheTicketID(CFTSteps.java:283)\n\tat ✽.And I extract the Ticket ID(src/test/resources/catalyst/settings/UAT/UAT.feature:52)\n",
  "status": "failed"
});
formatter.match({
  "location": "UATSteps.iLoginToServiceNow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iSearchTheTicketID()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iVerifyTicketStatus()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iNavigateToCatalyst()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Workzone",
      "offset": 19
    }
  ],
  "location": "CFTSteps.I_navigate_to_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnMenuOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "RL_Devops",
      "offset": 16
    }
  ],
  "location": "UATSteps.iClickOnTheLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Infrastructure",
      "offset": 16
    }
  ],
  "location": "CFTSteps.I_click_on_the_link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CloudFormation",
      "offset": 14
    }
  ],
  "location": "CFTSteps.I_expand_the_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iDeleteTheStackFromCloudFormation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iLogoutFromCatalyst()"
});
formatter.result({
  "status": "skipped"
});
});