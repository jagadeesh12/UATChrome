package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.steps.LoginSteps;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.TestCase.fail;

/**
 * Created by sse0051 on 10/3/17.
 */
public class AzureBlueprintViews {
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    public static WebElement PagesFrame;
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());

    public static void ClickOnSignin() {
        try{
            SeleniumUtil.waitForElementIsClickable("id","cred_sign_in_button",8, SeleniumUtilities.OBJWAITTIMEOUT);

            SeleniumUtil.click("id","cred_sign_in_button", SeleniumUtilities.OBJWAITTIMEOUT);
           Thread.sleep(2000);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnSignin");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void ClickOnMenu() {
        try{
            Thread.sleep(4000);
           // SeleniumUtil.click("xpath",".//*[@class='fxs-sidebar-collapse-button fxs-has-hover']",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.waitForElementIsClickable("xpath","//*[@id=\"web-container\"]/div[2]/div[1]/div[1]/button[1]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//*[@id=\"web-container\"]/div[2]/div[1]/div[1]/button[1]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnMenu");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnResourceGroup() {
        try{
            Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='fxs-sidebar-item-link']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            //System.out.println("Vsible");
            SeleniumUtil.click("xpath",".//*[@class='fxs-sidebar-item-link']", SeleniumUtilities.OBJWAITTIMEOUT);
            //System.out.println("clicked");
       Thread.sleep(3000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnResourceGroup");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnAdd() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='fxs-commandBar-item-text msportalfx-tooltip-overflow']",10,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='fxs-commandBar-item-text msportalfx-tooltip-overflow']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(8000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnAdd");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterGroupnmae(String Gpname) {
        try{
            //Thread.sleep(2000);
            //SeleniumUtil.waitForElementPresent("css", "input[class='azc-input azc-formControl fxs-br-error']");
            System.out.print("Checking for the element visibility");
            SeleniumUtil.type("xpath","//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div/div/input",Gpname, SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.print("Typed the group name");
            Thread.sleep(1000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterGroupname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectSubsciption(String Subscription) {
        try{
            Thread.sleep(1000);
            BrowserDriver.getCurrentDriver().findElement(By.cssSelector(".azc-input.fxc-inputhasvalue")).clear();
            SeleniumUtil.type("css",".azc-input.fxc-inputhasvalue",Subscription, SeleniumUtilities.OBJWAITTIMEOUT);
           // SeleniumUtil.type("xpath","//*[@id=\\\"web-container\\\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div]",Subscription,SeleniumUtilities.OBJWAITTIMEOUT);
            // SeleniumUtil.typeHitEnter("xpath","//*[@class='azc-editableCombo-wrapper azc-formControl']",Subscription,SeleniumUtilities.OBJWAITTIMEOUT);

            //SeleniumUtil.click("xpath","//*[@class='azc-editableCombo-wrapper azc-formControl']");
//  SeleniumUtil.waitForElementPresent("xpath", "//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div");
//            System.out.println("==========================");
//            SeleniumUtil.selectByVisibleText("xpath","//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div",Subscription,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectSubsciption");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void Selectlocation(String Location) {
        try{

          //  SeleniumUtil.clear("xpath","//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[3]/div[2]/div/div[1]",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            BrowserDriver.getCurrentDriver().findElement(By.cssSelector(".azc-input.fxc-inputhasvalue")).clear();
            SeleniumUtil.click("xpath",".//*[@class='azc-editableCombo-drop-image']", SeleniumUtilities.OBJWAITTIMEOUT);
            //SeleniumUtil.type("name","__azc-editableCombo1",Sout,SeleniumUtilities.OBJWAITTIMEOUT);
            //SeleniumUtil.selectByVisibleText("xpath","//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[3]/div[2]/div/div[1]/input",Location,SeleniumUtilities.OBJWAITTIMEOUT);
            //SeleniumUtil.waitForElementPresent("xpath","//*[@class='azc-input fxc-inputhasvalue']",Location,SeleniumUtilities.OBJWAITTIMEOUT);
            //SeleniumUtil.click("xpath","//*[@id=\"web-container\"]/div[2]/main/div[2]/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/div[3]/div[2]/div/div[1]/input",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectLocation");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnCreate() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='fxc-actionBarBase-button fxc-createActionBar-okButton fxc-base fxc-button azc-control azc-button fxt-button azc-button-default fxs-button-primary']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='fxc-actionBarBase-button fxc-createActionBar-okButton fxc-base fxc-button azc-control azc-button fxt-button azc-button-default fxs-button-primary']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnCreate");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterUsername(String username) {
        try{
            SeleniumUtil.waitForElementPresent("id", "cred_userid_inputtext");
            SeleniumUtil.type("id","cred_userid_inputtext",username, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterGroupname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterPassword(String password) {
        try{
            SeleniumUtil.waitForElementPresent("name", "passwd");
            SeleniumUtil.type("name","passwd",password, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterGroupname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnAzure() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='treeParent']/ul/li[2]/div/span",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='treeParent']/ul/li[2]/div/span", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='treeParent']/ul/li[2]/div/span", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnAzure");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnARMtemplate() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[text()='ARMTemplate']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[text()='ARMTemplate']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(4000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnARMTemplate");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnNew() {
        try{
           Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("xpath","(.//*[contains(@style,'font-weight:600')])[2]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(.//*[contains(@style,'font-weight:600')])[2]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnNew");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnARMV1() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='content']/div/form/div[1]/div",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='content']/div/form/div[1]/div", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnARMV1");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnBlueprntOrg() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath","(.//*[@class='panel-heading'])[1]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(.//*[@class='panel-heading'])[1]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnBlueprintOrg");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterBlueprintName(String BPName) {
        try{
            SeleniumUtil.waitForElementPresent("name", "blueprintNameInput");
            SeleniumUtil.type("name","blueprintNameInput",BPName, SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterBlueprintName");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectOrganisation(String Organisation) {
        try{

            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[1]/div[2]/div/div[2]/select");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[1]/div[2]/div/div[2]/select",Organisation, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectOrganisation");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectBusinessGroup(String BusinessGroup) {
        try{
           // SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='bgListInput']");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@name='bgListInput']",BusinessGroup, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectBusinessGroup");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectProject(String Project) {
        try{
            //SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='projectListInput']");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@name='projectListInput']",Project, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectProject");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnConfigureTemplate() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='ng-scope'][contains(text(),'Configure Template Parameters')]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='ng-scope'][contains(text(),'Configure Template Parameters')]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnConfigureTemplate");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectProvider(String Provider) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='providerId']");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@name='providerId']",Provider, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectProvider");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterUserName(String AdminUsername) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[3]/input");
            SeleniumUtil.type("xpath",".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[3]/input",AdminUsername, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterAdminUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterDNSLebel(String DnsLebel) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[5]/input");
            SeleniumUtil.type("xpath",".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[5]/input",DnsLebel, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterDnsLebel");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectResourceGroup(String ResourceGroup) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='resourceGroup']");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@name='resourceGroup']",ResourceGroup, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectResourceGroup");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }




    public static void SelectOSVersion(String OsVersion) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[6]/select");
            SeleniumUtil.selectByVisibleText("xpath",".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[6]/select",OsVersion, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectOsVersion");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnSave() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='rightPanel']/div/div[2]/button[3]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='rightPanel']/div/div[2]/button[3]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnSave");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterAdminPwd(String AdminPwd) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[4]/input");
            SeleniumUtil.type("xpath",".//*[@id='content']/div/form/div[2]/div[2]/accordion/div/div[2]/div[2]/div/div[4]/input",AdminPwd, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterAdminPwd");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterMyUsername(String Username) {
        try{
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='login-form']/fieldset/section[1]/label[2]/input");
            SeleniumUtil.type("xpath",".//*[@id='login-form']/fieldset/section[1]/label[2]/input",Username, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterAdminPwd");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterMypassword(String Password) {
        try {

            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='login-form']/fieldset/section[2]/label[2]/input");
            SeleniumUtil.type("xpath", ".//*[@id='login-form']/fieldset/section[2]/label[2]/input", Password, SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("enterPassword");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void ClickOndesign() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='design']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='design']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(8000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOndesign");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void ClickOnFilter()
    {
        try{

        SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='btn btn-xs cat-btn-update ng-scope pull-right margin-left6'][contains(@title,'Filter')]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
        SeleniumUtil.click("xpath",".//*[@class='btn btn-xs cat-btn-update ng-scope pull-right margin-left6'][contains(@title,'Filter')]", SeleniumUtilities.OBJWAITTIMEOUT);
        Thread.sleep(2000);
        SeleniumUtil.click("xpath",".//*[@class='btn btn-xs cat-btn-update ng-scope pull-right margin-left6'][contains(@title,'Filter')]", SeleniumUtilities.OBJWAITTIMEOUT);
    } catch (Exception ex) {
        BaseView.takeScreenshot("ClickOnFilter");
        SeleniumUtil.Log.info("Error :" + ex.getMessage());
        fail(ex.getMessage());
    }
    }

    public static void HitOnConfigVms() {
        try {

            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[text()='Configure VMs']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[text()='Configure VMs']", SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("HitOnConfigVms");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnSubmit() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='btn ng-class:modalOptions.actionButtonStyle ng-binding cat-btn-update']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='btn ng-class:modalOptions.actionButtonStyle ng-binding cat-btn-update']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(6000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnSubmit");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void clickOnLogin() {
        try {
            Thread.sleep(1000);
            SeleniumUtil.click("id","loginBtn",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickLoginButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickMenu() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='cursor']",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='cursor']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(4000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnmenu");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }
}
