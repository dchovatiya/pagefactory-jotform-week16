package com.jotform.pages;

import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Dimple Patel
 **/
public class SecurityQuestionPageFive extends Utility
{
    //Locators plsSelect, yourAns, submitBtn, PreviousBtn
    public SecurityQuestionPageFive()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(css="#jfDropdown-chip-input_11_field_1")
    //@FindBy(xpath="//div[@class='jfDropdown-chipContainer']")
    WebElement plsSelect;

    @CacheLookup
    @FindBy(css="#input_11_field_2")
    WebElement yourAns;

    @CacheLookup
    @FindBy(className  ="jfInput-button forSubmit form-submit-button u-right")
    WebElement submitBtn;

    @CacheLookup
    //@FindBy(className = "jfInput-button forPrev u-left")
    WebElement previousBtn;
    public void selectQuestion(String question)
    {
        selectByVisibleTextFromDropDown(plsSelect,question);
    }
    public void giveAnswer(String answer)
    {
        sendTextToElement(yourAns,answer);
    }
    public void submitTheForm()
    {
        submitBtn.submit();
    }






}
