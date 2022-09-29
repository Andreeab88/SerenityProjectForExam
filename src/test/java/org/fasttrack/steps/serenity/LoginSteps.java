package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToLoginStep(String USER_EMAIL, String USER_PASS){
        accountPage.setEmailField(USER_EMAIL);
        accountPage.setPassField(USER_PASS);
        accountPage.clickRememberMeButton();
        accountPage.clickLoginButton();
    }
    @Step
    public void checkSuccesMessageLoginStep(){
        String expected = "Hello andreea1988iusti2015 (not andreea1988iusti2015? Log out)\n" +
                "From your account dashboard you can view your recent orders, manage your shipping and billing addresses and edit your password and account details.";
        String actual = accountPage.getSuccesMessageLogin();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void logOutStep(){
        accountPage.clickLogOutButton();
    }




    @Step
    public void checkErrorMessageForLostPassStep(){
        String expected = "ERROR: The password you entered for the email address andreea1988iusti2015@gmail.com is incorrect. Lost your password?";
        String actual = accountPage.getErrorMessageForLostPass();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void lostPasswordStep(){
        accountPage.clickOnLostPasswordButton();
    }
    @Step
    public void setEmailForLostPassStep(String USER_EMAIL){
        accountPage.setEmailForLostPassField(USER_EMAIL);
    }
    @Step
    public void resetPassStep(){
        accountPage.clickResetPassButton();
    }
    @Step
    public void checkSuccesMessageForRecoveryTheLostPassStep(){
        String expected = "Password reset email has been sent.";
        String actual = accountPage.getSuccesMessageForRecoveryTheLostPass();
        Assert.assertEquals(expected,actual);
    }

}
