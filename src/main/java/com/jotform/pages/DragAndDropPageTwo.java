package com.jotform.pages;

import com.jotform.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Dimple Patel
 **/
public class DragAndDropPageTwo extends Utility
{
    //Locators nextBtn, BrowseFiles, dragAndDropArea,previousBtn
    public DragAndDropPageTwo()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='jfUpload-text-container']")
    WebElement dragAndDropArea;
    @CacheLookup
    @FindBy(xpath="//div[@class='jfUpload-button-container']")
    WebElement BrowseFiles;
    @CacheLookup
    @FindBy(xpath="//button[@aria-label='Next']")
    WebElement nextBtn;
    @CacheLookup
    //@FindBy(className = "jfInput-button forPrev u-left")
    WebElement previousBtn;


    public void setBrowseFiles()
    {
        BrowseFiles.sendKeys("");
    }
    public void clickOnNextBtn()
    {
        clickOnElement(nextBtn);
    }
}
