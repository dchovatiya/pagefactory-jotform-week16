package com.jotform.pages;

import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Dimple Patel
 **/
public class SignaturePageThree extends Utility
{
    //Locators signatureCanvas, nextBtn, previousBtn

    public SignaturePageThree() {
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath = "//canvas[@aria-label='E-Signature Field']")
    WebElement signatureCanvas;
    @CacheLookup
    @FindBy(xpath="//button[@aria-label='Next']")
    WebElement nextBtn;
    @CacheLookup
    //@FindBy(className = "jfInput-button forPrev u-left")
    WebElement previousBtn;

    public void doSignature()
    {

    }
    public void clickPreviousBtn()
    {
        clickOnElement(previousBtn);
    }
    public void clickOnNextBtn()
    {
        clickOnElement(nextBtn);
    }


}
