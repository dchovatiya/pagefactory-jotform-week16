package com.jotform.pages;

import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * By Dimple Patel
 **/
public class HomePage extends Utility
{
    //Locators nextBtn

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    //@FindBy(css = "#jfCard-welcome-start")
    @FindBy(xpath="//button[@id='jfCard-welcome-start']")
    //@FindBy(id = "jfCard-welcome-start")
    WebElement nextBtn;

    public void clickOnNextBtn()
    {
        Reporter.log("Click on the Next Button : " + nextBtn.toString() + "<br>");
        javaExecutorScriptExecuteScriptToClick(nextBtn);
    }

}
