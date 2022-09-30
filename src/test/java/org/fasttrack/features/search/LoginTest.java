package org.fasttrack.features.search;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginWithValidCredentialsAndAfterLogOutTest() {
        homeSteps.verifyNameSite("FASTTRACKIT");
        registerSteps.navigateToHomePage();
        loginSteps.loginWithValidCredentialsStep("andreea1988iusti2015@gmail.com", "123456andreea123456");
        loginSteps.checkSuccesMessageLoginStep();
        loginSteps.logOutStep();

    }

    @Test
    public void loginUsingBadEmailFormatTest() {
        loginSteps.navigateToHomepage();
        loginSteps.loginUsingBadEmailFormatSteps();
        loginSteps.checkErrorTextUsingWrongEmail();
    }

    @Test
    public void verifySuccesLoginWithLowerCaseEmailInsertedTest() {

        loginSteps.verifySuccesLoginWithLowerCaseEmailInserted();
        loginSteps.checkSuccesMessageLoginStep();
        loginSteps.logOutStep();
    }

    @Test
    public void loginUsingWrongEmailTest() {
        loginSteps.loginUsingWrongEmailInserted();
        loginSteps.checkErrorTextUsingWrongEmail();
    }

    @Test
    public void loginUsingWrongPassTest() {
        loginSteps.loginUsingWrongPassword("andreea1988iusti2015@gmail.com", "password");
        loginSteps.verifyTextErrorUsingWrongPass();
    }

    @Test
    public void loginWithoutUsingCredentialsTest() {
        loginSteps.loginUsingNoCredentials();
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







