package org.fasttrack.features.search;

import org.junit.Test;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class LoginTest extends BaseTest {

    @Test
    public void verifyMyAccountPageTitleTest() {
        accountSteps.verifyTextAccountPage();
        accountSteps.checkTitleTextFromMyAccountPage();
    }

    @Test
    public void checkLoginWithValidCredentialsTest() {
        homeSteps.verifyNameSite("FASTTRACKIT");
        registerSteps.navigateToHomePage();
        loginSteps.loginWithValidCredentialsStep("andreea1988iusti2015@gmail.com", "123456andreea123456");
        loginSteps.checkSuccesMessageLoginStep();
        loginSteps.logOutStep();

    }

    @Test
    public void loginUsingBadEmailFormatTest() {
        loginSteps.navigateToHomepage();
        loginSteps.loginUsingBadEmailFormatSteps("andreea1988iusti2015&gmail.com", USER_PASS);
        loginSteps.checkErrorTextUsingWrongEmailFormat();
    }

    @Test
    public void successfulLoginUsingEmailWithCapitalLettersTest() {

        loginSteps.successfulLoginUsingEmailWithCapitalLetters("ANDREEA1988IUSTI2015@GMAIL.COM", USER_PASS);
        loginSteps.checkSuccesMessageLoginStep();
        loginSteps.logOutStep();
    }

    @Test
    public void loginUsingWrongEmailTest() {
        loginSteps.loginUsingWrongEmailInserted("iusti2015andreea1988@gmail.com",USER_PASS);
        loginSteps.checkErrorTextUsingWrongEmail();
    }

    @Test
    public void loginUsingWrongPassTest() {
        loginSteps.loginUsingWrongPassword(USER_EMAIL, "password");
        loginSteps.verifyTextErrorUsingWrongPass();
    }

    @Test
    public void loginWithoutUsingCredentialsTest() {
        loginSteps.loginWhitoutCredentials("","");
        loginSteps.verifyTextErrorLoginWithoutCredentials();
    }

    @Test
    public void recoveryLostPasswordTest() {
        homeSteps.verifyNameSite("FASTTRACKIT");
        registerSteps.navigateToHomePage();
        loginSteps.loginUsingWrongPassword("andreea1988iusti2015@gmail.com", "pass");
        loginSteps.checkErrorMessageForLostPassStep();
        loginSteps.lostPasswordStep();
        loginSteps.setEmailForLostPassStep("andreea1988iusti2015@gmail.com");
        loginSteps.resetPassStep();
        loginSteps.checkSuccesMessageForRecoveryTheLostPassStep();

    }

}







