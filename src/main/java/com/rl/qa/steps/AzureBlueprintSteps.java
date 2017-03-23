package com.rl.qa.steps;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.AzureBlueprintViews;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by sse0051 on 10/3/17.
 */
public class AzureBlueprintSteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);


    @Given("^I Login to Azure using \"(.*?)\" credential$")
    public void i_Login_to_Azure_using_credential(String url) throws Throwable {
        //Thread.sleep(500);

        String appURL = url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);
        //  OrgWorkViews.EnterUrl(url);
    }


    @Given("^I click on Sign_in$")
    public void i_click_on_Sign_in() throws Throwable {
        AzureBlueprintViews.ClickOnSignin();
    }


    @Given("^I click on ResourceGroup$")
    public void i_click_on_ResourceGroup() throws Throwable {
        AzureBlueprintViews.ClickOnResourceGroup();
    }

    @Given("^I click on Add$")
    public void i_click_on_Add() throws Throwable {
        AzureBlueprintViews.ClickOnAdd();
    }

    @Given("^I enter the  \"(.*?)\"$")
    public void i_enter_the(String Gpname) throws Throwable {
        AzureBlueprintViews.EnterGroupnmae(Gpname);
    }

    @And("^I select on the \"([^\"]*)\"$")
    public void iSelectOnThe(String Subsciption) throws Throwable {
        AzureBlueprintViews.SelectSubsciption(Subsciption);
    }

    @Given("^I select  \"(.*?)\"$")
    public void i_select(String Location) throws Throwable {
        AzureBlueprintViews.Selectlocation(Location);
    }

    @Given("^I click on Create$")
    public void i_click_on_Create() throws Throwable {
        AzureBlueprintViews.ClickOnCreate();
    }

    @And("^I enter my \"([^\"]*)\"$")
    public void iEnterMy(String username) throws Throwable {
        AzureBlueprintViews.EnterUsername(username);
    }

    @And("^I entermy  \"([^\"]*)\"$")
    public void iEntermy(String password) throws Throwable {
        AzureBlueprintViews.EnterPassword(password);
    }

    @And("^I click on Azure$")
    public void iClickOnAzure() throws Throwable {
      AzureBlueprintViews.ClickOnAzure();
    }

    @And("^I click on ARM template$")
    public void iClickOnARMTemplate() throws Throwable {
       AzureBlueprintViews.ClickOnARMtemplate();
    }

    @And("^I click on New optn$")
    public void iClickOnNewOptn() throws Throwable {
        AzureBlueprintViews.ClickOnNew();
    }

    @And("^I click on Blueprint&Organisation$")
    public void iClickOnBlueprintOrganisation() throws Throwable {
        AzureBlueprintViews.ClickOnBlueprntOrg();
    }

    @And("^I click on Configure Template$")
    public void iClickOnConfigureTemplate() throws Throwable {
      AzureBlueprintViews.ClickOnConfigureTemplate();
    }

    @And("^I click on SAVE$")
    public void iClickOnSAVE() throws Throwable {
       AzureBlueprintViews.ClickOnSave();
     }
    @And("^I enter    \"([^\"]*)\"$")
    public void iEnter(String BPName) throws Throwable {
        AzureBlueprintViews.EnterBlueprintName(BPName);
    }

    @And("^I select   \"([^\"]*)\"$")
    public void iSelect(String Organisation) throws Throwable {
        AzureBlueprintViews.SelectOrganisation(Organisation);
    }

    @And("^I select the  \"([^\"]*)\"$")
    public void iSelectThe(String BusinessGroup) throws Throwable {
        AzureBlueprintViews.SelectBusinessGroup(BusinessGroup);
    }

    @And("^I select the \"([^\"]*)\" option$")
    public void iSelectTheOption(String Provider) throws Throwable {
        AzureBlueprintViews.SelectProvider(Provider);
    }

    @And("^I enter the   \"([^\"]*)\"$")
    public void iEnterThe(String AdminUsername) throws Throwable {
        AzureBlueprintViews.EnterUserName(AdminUsername);
    }

    @And("^I put  the \"([^\"]*)\"$")
    public void iPutThe(String AdminPwd) throws Throwable {
        AzureBlueprintViews.EnterAdminPwd(AdminPwd);
    }

    @And("^I selected my \"([^\"]*)\"$")
    public void iSelectedMy(String Project) throws Throwable {
        AzureBlueprintViews.SelectProject(Project);
    }

    @And("^I click on ARM(\\d+)VM-New$")
    public void iClickOnARMVMNew(int arg0) throws Throwable {
      AzureBlueprintViews.ClickOnARMV1();
    }



    @And("^I enter  mine \"([^\"]*)\"$")
    public void iEnterMine(String DnsLebel) throws Throwable {
        AzureBlueprintViews.EnterDNSLebel(DnsLebel);
    }

    @And("^I  select  mine \"([^\"]*)\"$")
    public void iSelectMine(String ResourceGroup) throws Throwable {
        AzureBlueprintViews.SelectResourceGroup(ResourceGroup);
    }


    @And("^I  select \"([^\"]*)\" in optn$")
    public void iSelectInOptn(String OsVersion) throws Throwable {
        AzureBlueprintViews.SelectOSVersion(OsVersion);
    }



    @Given("^I Login to catalyst using \"([^\"]*)\" Acess$")
    public void iLoginToCatalystUsingAcess(String Url) throws Throwable {
        String appURL = Url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);
        //  OrgWorkViews.EnterUrl(url);
    }

    @And("^I enter  \"([^\"]*)\"  User name text box$")
    public void iEnterUserNameTextBox(String Username) throws Throwable {
        AzureBlueprintViews.EnterMyUsername(Username);
    }

    @And("^I enter \"([^\"]*)\"   Password testbox$")
    public void iEnterPasswordTestbox(String Password) throws Throwable {
       AzureBlueprintViews.EnterMypassword(Password);
    }

    @And("^I click on the \"([^\"]*)\" link of this$")
    public void iClickOnTheLinkOfThis(String arg0) throws Throwable {
       AzureBlueprintViews.ClickOndesign();
    }

    @And("^I click on Filter$")
    public void iClickOnFilter() throws Throwable {
        AzureBlueprintViews.ClickOnFilter();
    }

    @And("^I hit on ConfigVms$")
    public void iHitOnConfigVms() throws Throwable {
       AzureBlueprintViews.HitOnConfigVms();
    }

    @And("^I click on Submit option$")
    public void iClickOnSubmitOption() throws Throwable {
      AzureBlueprintViews.ClickOnSubmit();
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {

        AzureBlueprintViews.clickOnLogin();
    }


    @And("^I clicked menu button$")
    public void iClickedMenuButton() throws Throwable {
        AzureBlueprintViews.ClickMenu();
    }
}
