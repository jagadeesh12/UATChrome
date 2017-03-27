$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/catalyst/settings/UAT/UAT.feature");
formatter.feature({
  "line": 1,
  "name": "CFT Blueprint launch",
  "description": "",
  "id": "cft-blueprint-launch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Launch CFT, Stop the Nginx Service , Check Notification and Remediation",
  "description": "",
  "id": "cft-blueprint-launch;launch-cft,-stop-the-nginx-service-,-check-notification-and-remediation",
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
  "duration": 53913209470,
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
  "duration": 5584373917,
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
  "duration": 11388289184,
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
  "duration": 521133640,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iSelectRL_DevopsFromTheChooseEnvironmentDropdownMenu()"
});
formatter.result({
  "duration": 10985529345,
  "status": "passed"
});
formatter.match({
  "location": "UATSteps.iSelectSensuProdFromTheMonitoringDropdownMenu()"
});
formatter.result({
  "duration": 10263153999,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d55.0.2883.87)\n  (Driver info: chromedriver\u003d2.27.440175 (9bc1d90b8bfa4dd181fbbf769a5eb5e575574320),platform\u003dLinux 4.4.0-66-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 11 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027N/A\u0027, ip: \u0027N/A\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-66-generic\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440175 (9bc1d90b8bfa4dd181fbbf769a5eb5e575574320), userDataDir\u003d/tmp/.org.chromium.Chromium.SAEgGb}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d55.0.2883.87, platform\u003dLINUX, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 6e65986ba39e5f5ea59b68fa3fbdba2a\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:335)\n\tat com.rl.qa.browsers.BrowserDriver.takeScreenshot(BrowserDriver.java:65)\n\tat com.rl.qa.utils.BaseView.takeScreenshot(BaseView.java:156)\n\tat com.rl.qa.views.UATViews.selectSensuProdFromTheDropdown(UATViews.java:139)\n\tat com.rl.qa.steps.UATSteps.iSelectSensuProdFromTheMonitoringDropdownMenu(UATSteps.java:160)\n\tat ✽.And I select Sensu Prod from the Monitoring dropdown menu(src/test/resources/catalyst/settings/UAT/UAT.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "UATSteps.iClickOnOkButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iEnterUniqueStackName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnokButton()"
});
formatter.result({
  "status": "skipped"
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
});
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CREATE_COMPLETE",
      "offset": 36
    }
  ],
  "location": "UATSteps.iVerifyTheStackNameAndStatusInCloudformation(String)"
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
      "val": "Instances",
      "offset": 16
    }
  ],
  "location": "CFTSteps.I_click_on_the_link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnRefreshButton()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iExtractIPAddressOfNginXInstanceCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iExtractIPAddressOfCataystInstanceCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iVerifyTheNewCreatedStackURL()"
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
      "val": "Bots",
      "offset": 12
    }
  ],
  "location": "UATSteps.iClickOnOption(String)"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iCloseTheExecuteLog()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iVerifyTheNewCreatedStackURLIsNotPresent()"
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
  "location": "UATSteps.iClickOnTracksOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnTelemetry()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnInstances()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iVerifyNginxIP()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iVerifyCatalystIP()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnEventsOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iVerifyEvents()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.I_switch_to_default_frame()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iLoginInSlackBot()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UATSteps.iClickOnBotsfactoryProject()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iVerifyTheNginxIsDown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CFTSteps.iExtractTheTicketID()"
});
formatter.result({
  "status": "skipped"
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