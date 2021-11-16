package com.crm.Base;

import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;



    @Before
    public void setUpMethod(String url){

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);

        driver.get(ConfigurationReader.getProperty(url));



    }
}
