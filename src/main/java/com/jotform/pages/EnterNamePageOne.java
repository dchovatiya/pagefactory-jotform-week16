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
public class EnterNamePageOne extends Utility
{
    //Locators firstname, lastname and next btn, slider
    public EnterNamePageOne()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//div[@class='jfProgress-itemWrapper ']//span[1]")
    WebElement sliderPositionName;


    //@FindBy(id="first_3")
    //@FindBy(css="#first_3")
    //@FindBy(xpath="//input[@id='first_3']")
    //@FindBy(xpath="//div[@class='jfField']//input[@id='first_3']")
    @FindBy(xpath="//span[@data-input-type='first']")
    WebElement firstNm;


    //@FindBy(id="last_3")
    //@FindBy(css="#last_3")
    //@FindBy(xpath="//input[@id='last_3']")
    //@FindBy(xpath="//input[@id='last_3']")
    //@FindBy(xpath="//input[@id='last_3']")
    @FindBy(xpath="//span[@data-input-type='last']")
    WebElement lastNm;


    //@FindBy(className="jfInput-button forNext u-right")
    //@FindBy (xpath="//button[@aria-label='Next'][normalize-space()='Next']")
    //@FindBy (xpath="//button[@id='form-pagebreak-next_5']")
    @FindBy (linkText="Next")
    WebElement nextBtn;
    public void enterFirstNm(String firstName)
    {
        Reporter.log("Enter the first name : " + firstName + "<br>");
        sendTextToElement(firstNm,firstName);
    }
    public void enterLastNm(String lastName)
    {
        Reporter.log("Enter the last name : " + lastName + "<br>");
        sendTextToElement(lastNm,lastName);

    }
    public void clickOnNextBtn()
    {
        Reporter.log("Click on the next button on page one : " + nextBtn.toString() + "<br>");
        clickOnElement(nextBtn);
    }

}
