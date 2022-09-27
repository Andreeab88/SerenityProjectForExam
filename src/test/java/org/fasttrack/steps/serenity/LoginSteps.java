package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class LoginSteps extends BaseSteps{

    @Step
    public void LoginStep(){
        accountPage.setEmailField(USER_EMAIL);
        accountPage.setPassField(USER_PASS);
        accountPage.clickRememberMeButton();
    }

       @Step
       public void clickLoginButtonStep(){
        accountPage.clickLoginButton();
       }



    @Step
    public void succesMessageLoginStep(){
        String expected = "Hello andreea1988iusti2015 (not andreea1988iusti2015? Log out)\n" +
                "From your account dashboard you can view your recent orders, manage your shipping and billing addresses and edit your password and account details.";
        String actual = accountPage.getSuccesMessageLogin();
        Assert.assertEquals(expected,actual);
    }

    @Step
    public void logOutStep(){
        accountPage.clickLogOutButton();
    }
}
