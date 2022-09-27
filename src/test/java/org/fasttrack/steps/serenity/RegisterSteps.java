package org.fasttrack.steps.serenity;

import net.bytebuddy.asm.Advice;
import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AccountPage;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class RegisterSteps extends BaseSteps {

    @Step
    public void getTitleSite() {
        String actual = homePage.checkTextSiteTitle();
        String expected = "FASTTRACKIT";
        Assert.assertEquals(actual, expected);
    }

    @Step
    public void navigateToHomePage() {
        homePage.checkTextSiteTitle();
        homePage.clickOnMyAccountButton();
    }

    @Step
    public void navigateToAccountPageForRegister() {
        accountPage.setEmailRegisterField(USER_EMAIL);
        accountPage.setPassRegisterField(USER_PASS);
    }

    @Step
    public void selectRegisterButton() {
        accountPage.clickRegisterButton();
    }

    @Step
    public void getErrorRegisterMessageStep() {
        String expected = "Error: An account is already registered with your email address. Please log in.";
        String actual = accountPage.getErrorRegistertText();
        Assert.assertEquals(expected, actual);
    }

}



