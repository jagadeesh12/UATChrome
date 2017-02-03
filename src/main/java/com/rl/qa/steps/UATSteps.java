package com.rl.qa.steps;


import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.CucumberContext;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.LoginViews;
import com.rl.qa.views.UATViews;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
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

    @Given("^Given I login to catalyst using username and access credentials password$")
    public void givenILoginToCatalystUsingUsernameAndAccessCredentialsPassword() throws Throwable {

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

    @Given("^I login to catalyst using \"([^\"]*)\" and access credentials \"([^\"]*)\"$")
    public void iLoginToCatalystUsingAndAccessCredentials(String username, String password) throws Throwable {
        try{
        boolean flag = false;
        String strUserName,strPassword;

        strUserName = username;//CucumberContext.getUserName();
        strPassword = password;//CucumberContext.getPassword();

        URL url = CucumberContext.getURL();

        assertNotNull(url);

        String appURL = url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);

        LoginViews.enterUsername(strUserName);
        LoginViews.enterJiraPassword(strPassword);
        LoginViews.clickJiraLoginButton();

        Boolean loggedIn = (Boolean) getCucumberContext().get("loggedIn");
        if (loggedIn != null && loggedIn) {
            logger.info("Already logged in, reusing authenticated session(1).");
            return;
        }


        logger.info("Logged in successfully.");
    }
        catch(Exception e)
    {

        e.printStackTrace();


    }


}

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
}
