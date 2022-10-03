package org.fasttrack.steps.serenity;

import net.bytebuddy.asm.Advice;
import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AccountPage;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class RegisterSteps extends BaseSteps {

    @Step
    public void verifyTitleSite() {
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
    public void navigateToAccountPageForRegister(String email, String pass) {
        accountPage.setEmailRegisterField(email);
        accountPage.setPassRegisterField(pass);
        accountPage.clickRegisterButton();
    }
    @Step
    public void getSuccesRegisterMessageForFirstTimeStep() {
        String expected = "Hello andreeaboboc (not andreeaboboc? Log out)\n" +
                "\n" +
                "From your account dashboard you can view your recent orders, manage your shipping and billing addresses and edit your password and account details.";
        String actual = accountPage.getErrorRegistertText();
        Assert.assertEquals(expected, actual);
    }


    @Step
    public void getErrorRegisterMessageStep() {
        String expected = "Error: An account is already registered with your email address. Please log in.";
        String actual = accountPage.getErrorRegistertText();
        Assert.assertEquals(expected, actual);
    }

}



