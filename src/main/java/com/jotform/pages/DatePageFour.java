package com.jotform.pages;

import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Dimple Patel
 **/
public class DatePageFour extends Utility
{
    //Locators datePicker, previousBtn, nextBtn
    public DatePageFour()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//button[@aria-label='Next']")
    WebElement nextBtn;
    @CacheLookup
    //@FindBy(className = "jfInput-button forPrev u-left")
    WebElement previousBtn;
    @CacheLookup
    @FindBy(id="lite_mode_10")
    //@FindBy(xpath="//div[@class='jfField isFilled']//input[@id='lite_mode_10']")
    WebElement datePicker;

    public void setDate()
    {

    }
    public void clickOnNextBtn()
    {
        clickOnElement(nextBtn);
    }
    public void clickPreviousBtn()
    {
        clickOnElement(previousBtn);
    }
}
