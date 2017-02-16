package com.rl.qa.steps;


import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.CucumberContext;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.CFTViews;
import com.rl.qa.views.LoginViews;
import com.rl.qa.views.UATViews;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;

import static com.rl.qa.utils.CucumberContext.getCucumberContext;
import static junit.framework.Assert.assertNotNull;


/**
 * Created by sse0049 on 2/2/17.
 */
public class UATSteps {
    private static WebDriver driver;
    private static Scenario scenario;


    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final com.rl.qa.utils.SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
//    @Given("^I login to catalyst using \"([^\"]*)\" and access credentials \"([^\"]*)\"$")
//    public void iLoginToCatalystUsingAndAccessCredentials(String arg0, String arg1) throws Throwable {
//
//
//        CucumberContext.getURL();
//
//
//    }

//    @Given("^Given I login to catalyst using username and access credentials password$")
//    public void givenILoginToCatalystUsingUsernameAndAccessCredentialsPassword() throws Throwable {
//
//        String strUsername, strPassword;
//
//        URL url= CucumberContext.getURL();
//
//         assertNotNull (url);
//
//        String appURL =url.toString();
//
//        assertNotNull(appURL);
//
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
//        Properties properties = new Properties();
//        properties.load(stream);
//
//        String username =properties.getProperty("iwms.username","not_filtered");
//        System.out.println(username);
//
//        String pass=properties.getProperty("iwms.password", "not_filtered");
//        System.out.println(pass);
//
//
//        BrowserDriver.loadPage(appURL);
//
//        UATViews.enterUsername(username);
//        UATViews.enterPassword(pass);
//        UATViews.clickLoginButton();
//
//
//
//
//
//
//    }


    @And("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String arg0) throws Throwable {

        UATViews.clickOnBotsOption();

    }

    @And("^I verify the Botname$")
    public void iVerifyTheBotname() throws Throwable {

        UATViews.verifyBotname();

    }

    @And("^I click on Execute button$")
    public void iClickOnExecuteButton() throws Throwable {
        UATViews.clickExecuteButton();

    }

//    @Given("^I login to catalyst using \"([^\"]*)\" and access credentials \"([^\"]*)\"$")
//    public void iLoginToCatalystUsingAndAccessCredentials(String username, String password) throws Throwable {
//        try{
//        boolean flag = false;
//        String strUserName,strPassword;
//
//        strUserName = username;//CucumberContext.getUserName();
//        strPassword = password;//CucumberContext.getPassword();
//
//        URL url = CucumberContext.getURL();
//
//        assertNotNull(url);
//
//        String appURL = url.toString();
//
//        assertNotNull(appURL);
//
//        // Load browser and point it at configured IWMS web-ui.
//        BrowserDriver.loadPage(appURL);
//
//        LoginViews.enterUsername(strUserName);
//        LoginViews.enterJiraPassword(strPassword);
//        LoginViews.clickJiraLoginButton();
//
//        Boolean loggedIn = (Boolean) getCucumberContext().get("loggedIn");
//        if (loggedIn != null && loggedIn) {
//            logger.info("Already logged in, reusing authenticated session(1).");
//            return;
//        }
//
//
//        logger.info("Logged in successfully.");
//    }
//        catch(Exception e)
//    {
//
//        e.printStackTrace();
//
//
//    }
//
//
//}

    @And("^I select RL_Devops from the Choose Environment dropdown menu$")
    public void iSelectRL_DevopsFromTheChooseEnvironmentDropdownMenu() throws Throwable {

        UATViews.selectRL_DevopsFromTheDropdown();

    }

    @And("^I select Sensu Prod from the Monitoring dropdown menu$")
    public void iSelectSensuProdFromTheMonitoringDropdownMenu() throws Throwable {

        UATViews.selectSensuProdFromTheDropdown();

    }

    @And("^I select Sensu Server from the Tag Server dropdown menu$")
    public void iSelectSensuServerFromTheTagServerDropdownMenu() throws Throwable {
        UATViews.selectSensuServerFromTheDropdown();
    }

    @And("^I click on Ok button$")
    public void iClickOnOkButton() throws Throwable {
        UATViews.clickOnOkbutton();

    }

    @And("^I enter unique stack name$")
    public void iEnterUniqueStackName() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String stackName =properties.getProperty("iwms.stackname","not_filtered");
        System.out.println(stackName);

        UATViews.enterStackName(stackName);

    }

    @Then("^Blueprint should be launched$")
    public void blueprintShouldBeLaunched() throws Throwable {

        UATViews.blueprintShouldBeLaunched();

    }

    @And("^I click on ok button$")
    public void iClickOnokButton() throws Throwable {
        UATViews.ClickOnOKButton();

    }

    @Given("^I login to catalyst using username and access credentials password$")
    public void iLoginToCatalystUsingUsernameAndAccessCredentialsPassword() throws Throwable {
        String strUsername, strPassword;

        URL url= CucumberContext.getURL();

        assertNotNull (url);

        String appURL =url.toString();

        assertNotNull(appURL);

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String username =properties.getProperty("iwms.username","not_filtered");
        System.out.println(username);

        String pass=properties.getProperty("iwms.password", "not_filtered");
        System.out.println(pass);


        BrowserDriver.loadPage(appURL);

        UATViews.enterUsername(username);
        UATViews.enterPassword(pass);
        UATViews.clickLoginButton();



    }

    @And("^I click on refresh button$")
    public void iClickOnRefreshButton() throws Throwable {
        CFTViews.refreshInstancePage();
    }

    @And("^I verify the stack name and status \"([^\"]*)\" in cloudformation$")
    public void iVerifyTheStackNameAndStatusInCloudformation(String arg0) throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String stackName =properties.getProperty("iwms.stackname","not_filtered");
        System.out.println(stackName);
        UATViews.verifyStackName(stackName);


    }

    @And("^I click on the \"([^\"]*)\" button on Launching Blueprint$")
    public void iClickOnTheButtonOnLaunchingBlueprint(String arg0) throws Throwable {
        UATViews.clickOnCloseButton();
    }

    @And("^I click on Menu option$")
    public void iClickOnMenuOption() throws Throwable {
        UATViews.clickOnMenu();

    }

    @And("^I click on the \"([^\"]*)\" Link$")
    public void iClickOnTheLink(String arg0) throws Throwable {
        UATViews.clickOnLink();
    }

    @And("^I verify \"([^\"]*)\" and \"([^\"]*)\" instances$")
    public void iVerifyAndInstances(String instance1, String instance2) throws Throwable {
        UATViews.verifyInstances(instance1,instance2);
    }



    @And("^I verify Bootstrap status for \"([^\"]*)\" instances$")
    public void iVerifyBootstrapStatusForInstances(String instance1) throws Throwable {
        UATViews.verifyBootstrapstatus(instance1);


    }

    @Then("^I verify the new created stack URL$")
    public void iVerifyTheNewCreatedStackURL() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String stackName =properties.getProperty("iwms.stackname","not_filtered");
        System.out.println(stackName);
        String appURL= stackName+".rlcatalyst.com";
        SeleniumUtil.getWebDriver();


        String username =properties.getProperty("iwms.username","not_filtered");
        System.out.println(username);

        String pass=properties.getProperty("iwms.password", "not_filtered");
        System.out.println(pass);

        BrowserDriver.loadPage(appURL);

        UATViews.verifyNewStack(appURL);
        UATViews.enterUsername(username);
        UATViews.enterPassword(pass);
        UATViews.clickLoginButton();
    }

    @And("^I enter \"([^\"]*)\" in search box$")
    public void iEnterInSearchBox(String serviceName) throws Throwable {
        UATViews.enterInSearchBox(serviceName);
    }

    @And("^I verify \"([^\"]*)\" Botname$")
    public void iVerifyBotname(String botname) throws Throwable {
        UATViews.verifytheBotname(botname);

    }

    @And("^I execute \"([^\"]*)\"$")
    public void iExecute(String botname) throws Throwable {
        UATViews.clickExecuteButton(botname);

    }


    @And("^I close the Execute log$")
    public void iCloseTheExecuteLog() throws Throwable {
       UATViews.closeLog();
    }

    @And("^I login in slack bot$")
    public void iLoginInSlackBot() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String slackURL =properties.getProperty("iwms.slackurl","not_filtered");
        System.out.println(slackURL);

        String emailId =properties.getProperty("iwms.slackusername","not_filtered");
        System.out.println(emailId);

        String slackpass=properties.getProperty("iwms.slackpass", "not_filtered");
        System.out.println(slackpass);

        BrowserDriver.loadPage(slackURL);

        UATViews.enterEmail(emailId);
        UATViews.enterSlackPasssword(slackpass);
        UATViews.clickOnSignIn();


    }

    @And("^I click on Botsfactory Project$")
    public void iClickOnBotsfactoryProject() throws Throwable {
        UATViews.clickOnProject();


    }


    @Then("^I verify the new created stack URL is not present$")
    public void iVerifyTheNewCreatedStackURLIsNotPresent() throws Throwable {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String stackName =properties.getProperty("iwms.stackname","not_filtered");
        System.out.println(stackName);
        String appURL=stackName+".rlcatalyst.com";
        SeleniumUtil.getWebDriver();

        BrowserDriver.loadPage(appURL);
        UATViews.verifyNewStackisNotPresent(appURL);
    }

    @And("^I click on Tracks option$")
    public void iClickOnTracksOption() throws Throwable {
        UATViews.clickOnTracks();

    }

    @And("^I click on Menu$")
    public void iClickOnMenu() throws Throwable {
        UATViews.clickMenu();
    }

    @And("^I click on Telemetry$")
    public void iClickOnTelemetry() throws Throwable {
        UATViews.clickOnTelemetry();


    }

    @And("^I click on Instances$")
    public void iClickOnInstances() throws Throwable {
        UATViews.clickOnInstances();

    }

    @And("^I login to service now$")
    public void iLoginToServiceNow() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String servicenowurl =properties.getProperty("iwms.servicenowurl","not_filtered");
        System.out.println(servicenowurl);

        String servicenowusername =properties.getProperty("iwms.servicenowusername","not_filtered");
        System.out.println(servicenowusername);

        String servicenowpass=properties.getProperty("iwms.servicenowpass", "not_filtered");
        System.out.println(servicenowpass);

        BrowserDriver.loadPage(servicenowurl);
        UATViews.enterEmailID(servicenowusername);
        UATViews.enterPass(servicenowpass);
        UATViews.clickLogin();
    }

    @And("^I click on Events option$")
    public void iClickOnEventsOption() throws Throwable {
        UATViews.clickEvents();
    }


    @And("^I navigate to catalyst$")
    public void iNavigateToCatalyst() throws Throwable {
        URL url= CucumberContext.getURL();

        assertNotNull (url);

        String appURL =url.toString();

        assertNotNull(appURL);
        BrowserDriver.loadPage(appURL);


    }

    @Then("^Ticket status should be closed$")
    public void ticketStatusShouldBeClosed() throws Throwable {
       UATViews.verifyTicketClosed();
    }

    @And("^I Delete the stack from Cloud Formation$")
    public void iDeleteTheStackFromCloudFormation() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream =classLoader.getResourceAsStream("lx-selenium.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String stackName =properties.getProperty("iwms.stackname","not_filtered");
        System.out.println(stackName);
        UATViews.deletestack(stackName);
    }

    @And("^I logout from catalyst$")
    public void iLogoutFromCatalyst() throws Throwable {
      UATViews.logoutcat();
    }
}
