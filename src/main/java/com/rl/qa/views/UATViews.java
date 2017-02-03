package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.fail;

/**
 * Created by sse0049 on 3/2/17.
 */
public class UATViews
{
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);

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
            try{
                SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", 10,
                        SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", SeleniumUtilities.OBJWAITTIMEOUT);
            }
            catch(Exception e)
            {

                SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[2]/div[1]/input", 10,
                        SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[2]/div[1]/input", SeleniumUtilities.OBJWAITTIMEOUT);

            }

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
}