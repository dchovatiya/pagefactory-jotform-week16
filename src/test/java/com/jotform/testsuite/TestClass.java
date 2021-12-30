package com.jotform.testsuite;

import com.jotform.pages.*;
import com.jotform.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * By Dimple Patel
 **/

public class TestClass extends TestBase
{

    EnterNamePageOne enterNamePageOne;
    DragAndDropPageTwo dragAndDropPageTwo;
    SignaturePageThree signaturePageThree;
    DatePageFour datePageFour;
    SecurityQuestionPageFive securityQuestionPageFive;

    @BeforeMethod(alwaysRun = true)
    public void openUp()
    {

        enterNamePageOne=new EnterNamePageOne();
        dragAndDropPageTwo=new DragAndDropPageTwo();
        signaturePageThree=new SignaturePageThree();
        datePageFour=new DatePageFour();
        securityQuestionPageFive=new SecurityQuestionPageFive();

    }
    //@Parameters({"firstNm","lastNm","securityQt","securityAns",expectedMsg})

    //@Parameters({"firstNm","lastNm"})
    //public void submitTheForm(@Optional String firstNm, @Optional String lastNm)
    @Test
    public void submitTheForm() throws InterruptedException {
        enterNamePageOne.enterFirstNm("Charles");
        Thread.sleep(2000);
        enterNamePageOne.enterLastNm("Hawkins");
        enterNamePageOne.clickOnNextBtn();
    }
}




//public void submitTheForm(String firstNm,String lastNm, String securityQt, String securityAns, String expMsg)