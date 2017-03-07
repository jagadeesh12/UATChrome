package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.steps.LoginSteps;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import com.thoughtworks.selenium.Selenium;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import static junit.framework.TestCase.fail;

/**
 * Created by sse0049 on 3/2/17.
 */
public class UATViews
{
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    private static String IPAddress;
    private static String NginxInstance;
    private static String CatalystInstance;
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());

    public static void enterUsername(String username)
    {
        try {
            SeleniumUtil.type("xpath",".//*[@id='login-form']/fieldset/section[1]/label[2]/input", username, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void enterPassword(String pass)
    {
        try {
            SeleniumUtil.type("xpath",".//*[@id='login-form']/fieldset/section[2]/label[2]/input", pass, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterPassword");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void clickLoginButton()
    {
        try {
            SeleniumUtil.click("id", "loginBtn", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickLoginButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void clickOnBotsOption() {
        try {
            SeleniumUtil.waitForElementIsClickable("id", "service",2, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("id", "service", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='botLibraryPage']/div[5]/div[2]/button[2]",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='botLibraryPage']/div[5]/div[2]/button[2]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickBOTSOption");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void verifyBotname() {

        try {

            for(int i=0;i<10;i++) {
                try {
                    SeleniumUtil.elementShouldVisible("xpath", "//div[contains(text(),'Demo-Customername')]", 10, SeleniumUtilities.OBJWAITTIMEOUT);
                    break;
                } catch (Exception e) {
                    SeleniumUtil.click("xpath", ".//*[@id='grid1']/div[2]/div[1]/div[1]/button[3]", 10);
                }
            }
        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyBotsname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());


        }
    }


    public static void clickExecuteButton() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//div[contains(text(),'Demo-Customername')]//following::div[11]//following-sibling::a[@title='Execute']",2, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//div[contains(text(),'Demo-Customername')]//following::div[11]//following-sibling::a[@title='Execute']", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickExecuteButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void selectRL_DevopsFromTheDropdown() {
        try {
            SeleniumUtil.waitForElementIsClickable("id", "envSelect",10,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.selectByVisibleText("id","envSelect","RL_Devops",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("selectRL_DevopsFromTheDropdown");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void selectSensuProdFromTheDropdown() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", "//label[contains(text(),'Monitoring')]//following-sibling::select",10,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.selectByVisibleText("xpath","//label[contains(text(),'Monitoring')]//following-sibling::select","Sensu Prod",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("selectSesnuProdFromTheDropdown");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void selectSensuServerFromTheDropdown() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", "//label[contains(text(),'Tag Server')]//following-sibling::select",10,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.selectByVisibleText("xpath","//label[contains(text(),'Tag Server')]//following-sibling::select","Sensu Server",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("selectSensuServerFromTheDropdown");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnOkbutton() {
        try {

                SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", 10,
                        SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", SeleniumUtilities.OBJWAITTIMEOUT);



        }
        catch(Exception ex){
            BaseView.takeScreenshot("ClickOnOKButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void enterStackName(String stackName) {

        try {
            SeleniumUtil.type("xpath","//span[contains(text(),'Only numbers,letters allowed')]//following::input", stackName, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }



    }

    public static void blueprintShouldBeLaunched() {
        try {
            SeleniumUtil.elementShouldVisible("xpath","//*[text()='Your Selected Blueprint is being Launched, kindly check back in a while.']"
            ,2,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("BluePrint is not Launched");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void ClickOnOKButton() {
        try
        {
            SeleniumUtil.waitForElementIsClickable("xpath", "//input[@type='submit']", 10,
                    SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//input[@type='submit']", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex) {
            BaseView.takeScreenshot("ClickOnOKButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void verifyStackName(String stackName) {
        try{
            SeleniumUtil.elementShouldVisible("xpath","//*[contains(text(),'"+stackName+"')]",10,SeleniumUtilities.OBJWAITTIMEOUT);
            for(int i=0;i<=4;i++){


                   String status=SeleniumUtil.getTextValue("xpath","//*[contains(text(),'"+stackName+"')]/../../../following-sibling::div[1]/div[2]",SeleniumUtilities.OBJWAITTIMEOUT);
                   System.out.println(status);
                   if(!status.equals("CREATE_COMPLETE")){
                   Thread.sleep(60000);
                   SeleniumUtil.click("xpath",".//*[@id='cloudFormationPage']/div/div[1]/span[2]/button",2);
               }
              else{
                       break;
                   }
            }

//            Thread.sleep(60000);
//            SeleniumUtil.click("xpath","//button[@class='btn btn-xs cat-btn-update']",2);
//            SeleniumUtil.verifyTextValue("xpath","//*[contains(text(),'relevancelab')]/../../../following-sibling::div[1]/div[2]","CREATE_COMPLETE",SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnOKButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        }


    }

    public static void clickOnCloseButton() {
        try
        {
            SeleniumUtil.waitForElementIsClickable("xpath", "//button[@class='btn cat-btn-close']", 10,
                    SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//button[@class='btn cat-btn-close']", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex) {
            BaseView.takeScreenshot("ClickOnCloseButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void clickOnMenu() {
        try
        {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='section-name']/span", 10,
                    SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='section-name']/span", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex) {
            BaseView.takeScreenshot("ClickOnMenuOption");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnLink() {
        try
        {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='33edeb34-b685-4567-b4fd-a4340180b443']", 10,
                    SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='33edeb34-b685-4567-b4fd-a4340180b443']", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex) {
            BaseView.takeScreenshot("ClickOnlink");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void verifyInstances(String instance1, String instance2) {
        try
        {
            String instance3=SeleniumUtil.getTextValue("xpath","//div[text()='"+instance1+"']",SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println(instance3);
            String instance4=SeleniumUtil.getTextValue("xpath","//div[text()='"+instance2+"']",SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println(instance4);
            Assert.assertEquals(instance1,instance3);
            Assert.assertEquals(instance2,instance4);



        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyInstances");
            SeleniumUtil.Log.info("Error:" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void verifyBootstrapstatus(String instance1) {
        String flag = null;
        String flag1="true";
        try
        {   Thread.sleep(2000);
            SeleniumUtil.verifyTextValue("xpath","//div[text()='"+instance1+"']/../following-sibling::div[4]/div[9]/div/button",instance1,SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            for(int i=0;i<=4;i++) {
                Thread.sleep(60000);
                SeleniumUtil.waitForElementIsClickable("xpath","//div[text()='" + instance1 + "']/../following-sibling::div[4]/div[9]/div/button",2,SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", "//div[text()='" + instance1 + "']/../following-sibling::div[4]/div[9]/div/button", SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", "//div[text()='" + instance1 + "']/../following-sibling::div[4]/div[9]/div/ul/li[1]/span", SeleniumUtilities.OBJWAITTIMEOUT);
                Thread.sleep(5000);
                SeleniumUtil.click("xpath", "//span[text()='Action History']", SeleniumUtilities.OBJWAITTIMEOUT);

                flag = SeleniumUtil.getTextValue("xpath", "//div[text()='Bootstrap']/following::div[1]/div", SeleniumUtilities.OBJWAITTIMEOUT);
                if(flag.equals(flag1)) {
                    SeleniumUtil.click("xpath","//span[@class='close']",SeleniumUtilities.OBJWAITTIMEOUT);
                   break;
                }
                else {
                    SeleniumUtil.click("xpath", "//span[@class='close']", SeleniumUtilities.OBJWAITTIMEOUT);
                }

            }

        }
        catch(Exception ex) {
            BaseView.takeScreenshot("ClickOnlink");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void verifyNewStack(String appURL) {
        try

        {

//
//            String parentwin=SeleniumUtil.getWebDriver().getWindowHandle();
//          Set<String> winHandles = SeleniumUtil.getWebDriver().getWindowHandles();
//            Iterator<String> it = winHandles.iterator();
//
//            String childwin=it.next();
//            SeleniumUtil.getWebDriver().switchTo().window(childwin);






               Assert.assertTrue(SeleniumUtil.isElementExist("id", "username"));
               Thread.sleep(60000);

               Assert.assertTrue(SeleniumUtil.isElementExist("id", "password"));
               Assert.assertTrue(SeleniumUtil.isElementExist("id", "loginBtn"));

                //SeleniumUtil.getWebDriver().switchTo().window(parentwin);


        }
        catch(Exception ex){
            BaseView.takeScreenshot("NewStackPageNotOpened");
            SeleniumUtil.Log.info("Error:" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

    public static void enterInSearchBox(String serviceName) {
        try
        {   Thread.sleep(2);
            SeleniumUtil.waitForElementVisibilityOf("id","searchBots",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.typeHitEnter("id","searchBots",serviceName,SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyInstances");
            SeleniumUtil.Log.info("Error:" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void verifytheBotname(String botname) {
        try {
            System.out.println(botname);

            for(int i=0;i<10;i++) {
                try {
                    SeleniumUtil.elementShouldVisible("xpath", "//div[contains(text(),'"+botname+"') and @class='ui-grid-cell-contents ng-binding ng-scope']", 10, SeleniumUtilities.OBJWAITTIMEOUT);
                    break;
                } catch (Exception e) {
                    SeleniumUtil.click("xpath", ".//*[@id='grid1']/div[2]/div[1]/div[1]/button[3]", 10);
                }
            }
        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyBotsname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());


        }
    }

    public static void clickExecuteButton(String botname) {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//div[contains(text(),'"+botname+"')]//following::div[11]//following-sibling::a[@title='Execute']",2, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//div[contains(text(),'"+botname+"')]//following::div[11]//following-sibling::a[@title='Execute']", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickExecuteButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void closeLog() {
        try {

            Thread.sleep(20000);
            SeleniumUtil.waitForElementVisibilityOf("xpath","//span[contains(text(),'Task execution success for script Stop Service')]",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='orchestrationLogPage']/div[3]/button",SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickonCloseLog");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void enterEmail(String emailId) {
        try {
            SeleniumUtil.type("id","email", emailId, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("SlackSignIn");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void enterSlackPasssword(String slackpass) {
        try {
            SeleniumUtil.type("id","password", slackpass, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("SlackSignIn");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void clickOnSignIn() {
        try {
            SeleniumUtil.click("id","signin_btn", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("SlackSignIn");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnProject() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath","//span[contains(text(),'botsfactory')]",4,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//span[contains(text(),'botsfactory')]", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void verifyNewStackisNotPresent(String appURL) {
        try {


                Thread.sleep(60000);
                Assert.assertFalse(SeleniumUtil.isElementExist("id", "username"));


                Assert.assertFalse(SeleniumUtil.isElementExist("id", "password"));

                Assert.assertFalse(SeleniumUtil.isElementExist("id", "loginBtn"));


                //SeleniumUtil.getWebDriver().switchTo().window(parentwin);


        }
            catch (Exception ex) {
                BaseView.takeScreenshot("StackURLisPresent");
                SeleniumUtil.Log.info("Error :" + ex.getMessage());
                fail(ex.getMessage());
            }

    }


    public static void clickOnTracks() {
        try {
            SeleniumUtil.waitForElementIsClickable("id","track",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("id","track", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickMenu() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath","//strong[contains(text(),'Menu')]",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//strong[contains(text(),'Menu')]", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnTelemetry() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath",".//a[text()='Telemetry']",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//a[text()='Telemetry']", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//a[text()='Notifications']", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnInstances() {
        try {
            SeleniumUtil.switchToFrameHavingElement("xpath","//a[text()='Instances']");
            SeleniumUtil.waitForElementIsClickable("xpath","//a[text()='Instances']",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//a[text()='Instances']", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static String extractTicket(String nginx_ip) {
        String ticketID = null;
        //String IP="52.52.27.189";
        try {
            SeleniumUtil.waitForElementVisibilityOf("xpath", "//div[contains(text(),'Service nginx is up for "+nginx_ip+".')]", 10, SeleniumUtilities.OBJWAITTIMEOUT);
            ticketID = SeleniumUtil.getTextValue("xpath", "//div[contains(text(),'Service nginx is up for "+nginx_ip+".')]/a", SeleniumUtilities.OBJWAITTIMEOUT);
            //SeleniumUtil.click("xpath","//div[contains(text(),'Service nginx is up for "+nginx_ip+".')]/a",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
        return ticketID;

    }

    public static void searchTicket(String ticketID) {
        try {

            Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("id","sysparm_search",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.clear("id","sysparm_search",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.typeHitEnter("id","sysparm_search",ticketID,SeleniumUtilities.OBJWAITTIMEOUT);


        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }

    public static void clickEvents() {
        try{
            Thread.sleep(2000);
            SeleniumUtil.click("xpath",".//*[@id='navbar-collapse']/ul/li[3]/a",SeleniumUtilities.OBJWAITTIMEOUT);

        }catch (Exception ex) {
            BaseView.takeScreenshot("verifyingInstancesInTelemetry");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static String getIPAddress(String strCardName) {
        try {
            UATViews.IPAddress = SeleniumUtil.getTextValue("xpath", "//div[text()='"+strCardName+"']/../following::div[3]/strong", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.Log.info("IP Address :"+IPAddress);


        }
        catch(Exception ex){
            BaseView.takeScreenshot("getIPAddress");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

        return IPAddress;
    }

    public static String verifyNginxIP(String nginx_ip) {
        try {
            for(int i=0;i<=3;i++) {
                Thread.sleep(10000);
                SeleniumUtil.waitForElementPresent("xpath", "//*[text()='" + nginx_ip + "']");
               // if (SeleniumUtil.verifyTextValue("xpath", "//*[text()='" + nginx_ip + "']", nginx_ip, SeleniumUtilities.OBJWAITTIMEOUT) == true) {
                    Assert.assertTrue(SeleniumUtil.verifyTextValue("xpath", "//*[text()='" + nginx_ip + "']", nginx_ip, SeleniumUtilities.OBJWAITTIMEOUT));
                    NginxInstance = SeleniumUtil.getTextValue("xpath", "//td[text()='" + nginx_ip + "']/preceding::td[4]/a", SeleniumUtilities.OBJWAITTIMEOUT);
                    break;
                //}
            }

        }
        catch(Exception ex){
            BaseView.takeScreenshot("getIPAddress");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return NginxInstance;


    }

    public static String verifyCatalystIP(String catalyst_ip) {
        try {
            Thread.sleep(2000);
            if(SeleniumUtil.verifyTextValue("xpath","//*[text()='"+catalyst_ip+"']",catalyst_ip,SeleniumUtilities.OBJWAITTIMEOUT)==true)
            {
                NginxInstance=SeleniumUtil.getTextValue("xpath","//td[text()='"+catalyst_ip+"']/preceding::td[4]/a",SeleniumUtilities.OBJWAITTIMEOUT);

            }


        }
        catch(Exception ex){
            BaseView.takeScreenshot("getIPAddress");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
        return CatalystInstance;

    }

    public static void verifyStatus(String nginx_insta, String nginx_ip) {
        try {

            SeleniumUtil.Log.info("NginX IP:"+nginx_insta);
            SeleniumUtil.switchToFrameHavingElement("xpath","//label[text()='Instance']/following::div[1]/div/div");
//            SeleniumUtil.type("xapth","//label[text()='Instance']/following::div[1]/div/div/following::input[1]",nginx_insta,SeleniumUtilities.OBJWAITTIMEOUT);
//            SeleniumUtil.click("xpath","//span[text()='NginX - "+nginx_ip+"']",SeleniumUtilities.OBJWAITTIMEOUT);
//            SeleniumUtil.click("xpath","//button[@class='btn btn-xs btn-search' and @title='Search']",SeleniumUtilities.OBJWAITTIMEOUT);

               try{
//                    SeleniumUtil.waitForElementVisibilityOf("xpath","//span[@class='txt-criticle ng-scope'and @ng-switch-when='2  and @uib-tooltip='Critical']",SeleniumUtilities.OBJWAITTIMEOUT);
//                    SeleniumUtil.waitForElementVisibilityOf("xpath","//span[@class='txt-aqua ng-scope' and @uib-tooltip='Info' and  @ng-switch-when='0']",SeleniumUtilities.OBJWAITTIMEOUT);
                    Assert.assertTrue(SeleniumUtil.isElementExist("xpath","//td[text()='"+nginx_insta+"']/preceding::td/span[@class='txt-aqua ng-scope' and @uib-tooltip='Info' and  @ng-switch-when='0']"));
                    logger.info("Verified : Critical Nginx Instances");
                    Assert.assertTrue(SeleniumUtil.isElementExist("xpath","//td[text()='"+nginx_insta+"']/preceding::td/span [@class='txt-criticle ng-scope' and @uib-tooltip='Critical' and @ng-switch-when='2']"));
                 }
                catch (Exception e){
                    Assert.fail("Status not found");
                }
        }
        catch(Exception ex){
            BaseView.takeScreenshot("getIPAddress");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void verifyTicketStatus(String ticketID) {
        try {
            //String a="INC0011992";
            System.out.println("=====================>");
            System.out.println(ticketID);
            System.out.println("=====================>");
            SeleniumUtil.switchToFrameHavingElement("id","incident.state");
            SeleniumUtil.waitForElementPresent("id","incident.state");
//
//            try {
               // String status = SeleniumUtil.getTextValue("id", "incident.state", SeleniumUtilities.OBJWAITTIMEOUT);
            String status=SeleniumUtil.getFirstSelectedOption("id", "incident.state", SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.Log.info("Status :" +status );
                Assert.assertEquals("Closed", status);
//            }
//            catch(Exception e){
//                String status=SeleniumUtil.getTextValue("xpath","//a[text()='"+ticketID+"']/../following::td[5]",SeleniumUtilities.OBJWAITTIMEOUT);
//                SeleniumUtil.Log.info("Status :" +status );
//                Assert.assertEquals("Closed",status);
//
//
//
//            }


        }
        catch(Exception ex){
            BaseView.takeScreenshot("getIPAddress");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

    public static void enterEmailID(String servicenowusername) {
        try {
            SeleniumUtil.switchToFrameHavingElement("xpath","//*[@id='user_name']");
            System.out.println(servicenowusername);
            Thread.sleep(5000);
            for(int i=0;i<=5;i++) {
                try {
                    SeleniumUtil.type("xpath", ".//*[@id='user_name']", servicenowusername, SeleniumUtilities.OBJWAITTIMEOUT);
                    break;
                }catch (Exception e){
                    e.getMessage();

                }
            }


        }
        catch(Exception ex){
            BaseView.takeScreenshot("ServiceNowLogin");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void enterPass(String servicenowpass) {
        try {
            Thread.sleep(2000);

            SeleniumUtil.type("id","user_password",servicenowpass,SeleniumUtilities.OBJWAITTIMEOUT);


        }
        catch(Exception ex){
            BaseView.takeScreenshot("ServiceNowLogin");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void clickLogin() {
        try {
            Thread.sleep(2000);

            SeleniumUtil.click("id","sysverb_login",SeleniumUtilities.OBJWAITTIMEOUT);


        }
        catch(Exception ex){
            BaseView.takeScreenshot("ServiceNowLogin");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void verifyTicketClosed() {
        String parentwin=SeleniumUtil.getWebDriver().getWindowHandle();
        Set<String> winHandles = SeleniumUtil.getWebDriver().getWindowHandles();
        Iterator<String> it = winHandles.iterator();

        String childwin=it.next();
        SeleniumUtil.getWebDriver().switchTo().window(childwin);
        try{
            Thread.sleep(2000);

//            boolean flag=true;
//            SeleniumUtil.getChildWindow(flag);

            String status=SeleniumUtil.getTextValue("id","incident.state",SeleniumUtilities.OBJWAITTIMEOUT);
            Assert.assertEquals("Closed",status);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("ServiceNowLogin");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());


        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        SeleniumUtil.getWebDriver().switchTo().window(parentwin);
    }


    public static void deletestack(String stackName) {
        try {
            Thread.sleep(2000);
            SeleniumUtil.elementShouldVisible("xpath","//*[contains(text(),'"+stackName+"')]",10,SeleniumUtilities.OBJWAITTIMEOUT);

            SeleniumUtil.click("xpath","//*[contains(text(),'"+stackName+"')]/../../../following-sibling::div[2]/span",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.elementShouldVisible("xpath",".//*[@id='removeCFTPage']/div[3]/button[2]",4,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='removeCFTPage']/div[3]/button[2]",SeleniumUtilities.OBJWAITTIMEOUT);


        }
        catch(Exception ex){
            BaseView.takeScreenshot("Deleting CFT stack");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void logoutcat() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.elementShouldVisible("id","logout",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("id","logout",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.elementShouldVisible("xpath",".//*[@id='Msg1']/div/div/button[2]",2,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='Msg1']/div/div/button[2]",SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("Catalyst Login");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }


    }
}