package com.rl.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sse0049 on 13/2/17.
 */
public class Delete {
    public static void main(String arg[]) {

     WebDriver driver =  crateNewDriverInstance();;
        WebDriver driver1 =  crateNewDriverInstance();;

        System.out.println("Launching first browser");
        driver.get("http://www.google.com");

        System.out.println("Launching Second browser");
        driver1.get("http://www.gmail.com");


    }

    public static WebDriver crateNewDriverInstance() {

        WebDriver newDriver = new FirefoxDriver();
        return newDriver;

    }

}
