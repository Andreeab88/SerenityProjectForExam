package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AccountPage;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class AccountSteps extends BaseSteps{
    @Step
    public void verifyTextAccountPage(){
        homePage.clickOnHomeButton();
        homePage.clickOnMyAccountButton();}
        @Step
        public void checkTitleTextFromMyAccountPage(){
            String expected = "MY ACCOUNT";
            String actual = accountPage.checkMyAccountPageTitle();
            Assert.assertEquals(expected,actual);
        }


}
