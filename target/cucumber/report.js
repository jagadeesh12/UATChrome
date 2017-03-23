$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/catalyst/settings/AzureBlueprint.feature");
formatter.feature({
  "line": 2,
  "name": "Blueprint Launch in Azure",
  "description": "",
  "id": "blueprint-launch-in-azure",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Azure"
    }
  ]
});
formatter.scenario({
  "line": 48,
  "name": "As a user I launch Blueprint in Azure using ARM template",
  "description": "",
  "id": "blueprint-launch-in-azure;as-a-user-i-launch-blueprint-in-azure-using-arm-template;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Azure"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#    Given I Login to Azure using \"\u003curl\u003e\" credential"
    },
    {
      "line": 5,
      "value": "#    And I enter my \"\u003cusername\u003e\""
    },
    {
      "line": 6,
      "value": "#    And I entermy  \"\u003cpassword\u003e\""
    },
    {
      "line": 7,
      "value": "#    And I click on Sign_in"
    },
    {
      "line": 8,
      "value": "#    And I click on Menu"
    },
    {
      "line": 9,
      "value": "#    And I click on ResourceGroup"
    },
    {
      "line": 10,
      "value": "#    And I click on Add"
    },
    {
      "line": 11,
      "value": "#    And I enter the  \"\u003cGpname\u003e\""
    },
    {
      "line": 12,
      "value": "#    And I select on the \"\u003cSubscription\u003e\""
    },
    {
      "line": 13,
      "value": "#    And I select  \"\u003cLocation\u003e\""
    },
    {
      "line": 14,
      "value": "#    And I click on Create"
    },
    {
      "line": 15,
      "value": "#Now I have to open the catalyst to launch the ARM azure blueprint"
    }
  ],
  "line": 16,
  "name": "I Login to catalyst using \"http://neo.rlcatalyst.com/cat3/\" Acess",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I enter  \"superadmin\"  User name text box",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"superadmin@123\"   Password testbox",
  "matchedColumns": [
    18
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on the \"DESIGN\" link of this",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I clicked menu button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Azure",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on ARM template",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Filter",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on New optn",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on ARM1VM-New",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Blueprint\u0026Organisation",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter    \"ARMBP\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select   \"RL\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select the  \"Product\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I selected my \"Catalyst\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on Configure Template",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select the \"AzureLatest\" option",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I  select  mine \"ARM\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter the   \"SradhaAdmin\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I put  the \"Sradha@123\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter  mine \"sradha-dns-d1\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I  select \"14.04.2-LTS\" in optn",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I hit on ConfigVms",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on SAVE",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on Submit option",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://neo.rlcatalyst.com/cat3/",
      "offset": 27
    }
  ],
  "location": "AzureBlueprintSteps.iLoginToCatalystUsingAcess(String)"
});
formatter.result({
  "duration": 26330142284,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027sse0051-GA-78LMT-S2\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-66-generic\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: BrowserDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d35.0, platform\u003dLINUX, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 69dbcaf7-7f68-4f92-81d0-0295ccde95d9\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:665)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.firefox.FirefoxDriver.getScreenshotAs(FirefoxDriver.java:341)\n\tat com.rl.qa.browsers.BrowserDriver.takeScreenshot(BrowserDriver.java:65)\n\tat com.rl.qa.utils.BaseView.takeScreenshot(BaseView.java:156)\n\tat com.rl.qa.browsers.BrowserDriver.loadPage(BrowserDriver.java:113)\n\tat com.rl.qa.steps.AzureBlueprintSteps.iLoginToCatalystUsingAcess(AzureBlueprintSteps.java:179)\n\tat ✽.Given I Login to catalyst using \"http://neo.rlcatalyst.com/cat3/\" Acess(src/test/resources/catalyst/settings/AzureBlueprint.feature:16)\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7058 [/127.0.0.1] failed: Connection refused (Connection refused)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:158)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:144)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:90)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:160)\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:380)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:644)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.firefox.FirefoxDriver.getScreenshotAs(FirefoxDriver.java:341)\n\tat com.rl.qa.browsers.BrowserDriver.takeScreenshot(BrowserDriver.java:65)\n\tat com.rl.qa.utils.BaseView.takeScreenshot(BaseView.java:156)\n\tat com.rl.qa.browsers.BrowserDriver.loadPage(BrowserDriver.java:113)\n\tat com.rl.qa.steps.AzureBlueprintSteps.iLoginToCatalystUsingAcess(AzureBlueprintSteps.java:179)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:297)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:89)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:40)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:94)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:51)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:237)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\nCaused by: java.net.ConnectException: Connection refused (Connection refused)\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)\n\t... 79 more\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "superadmin",
      "offset": 10
    }
  ],
  "location": "AzureBlueprintSteps.iEnterUserNameTextBox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "superadmin@123",
      "offset": 9
    }
  ],
  "location": "AzureBlueprintSteps.iEnterPasswordTestbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "DESIGN",
      "offset": 16
    }
  ],
  "location": "AzureBlueprintSteps.iClickOnTheLinkOfThis(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickedMenuButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnAzure()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnARMTemplate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnFilter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnNewOptn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "AzureBlueprintSteps.iClickOnARMVMNew(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnBlueprintOrganisation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ARMBP",
      "offset": 12
    }
  ],
  "location": "AzureBlueprintSteps.iEnter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "RL",
      "offset": 12
    }
  ],
  "location": "AzureBlueprintSteps.iSelect(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Product",
      "offset": 15
    }
  ],
  "location": "AzureBlueprintSteps.iSelectThe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Catalyst",
      "offset": 15
    }
  ],
  "location": "AzureBlueprintSteps.iSelectedMy(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnConfigureTemplate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "AzureLatest",
      "offset": 14
    }
  ],
  "location": "AzureBlueprintSteps.iSelectTheOption(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ARM",
      "offset": 17
    }
  ],
  "location": "AzureBlueprintSteps.iSelectMine(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SradhaAdmin",
      "offset": 15
    }
  ],
  "location": "AzureBlueprintSteps.iEnterThe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sradha@123",
      "offset": 12
    }
  ],
  "location": "AzureBlueprintSteps.iPutThe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sradha-dns-d1",
      "offset": 15
    }
  ],
  "location": "AzureBlueprintSteps.iEnterMine(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "14.04.2-LTS",
      "offset": 11
    }
  ],
  "location": "AzureBlueprintSteps.iSelectInOptn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iHitOnConfigVms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnSAVE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AzureBlueprintSteps.iClickOnSubmitOption()"
});
formatter.result({
  "status": "skipped"
});
});