package org.fasttrack.features.search;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialsAndAfterLogOutTest(){
        homeSteps.checkNameSite("FASTTRACKIT");
        registerSteps.navigateToHomePage();
        loginSteps.navigateToLoginStep("andreea1988iusti2015@gmail.com", "123456andreea123456");
        loginSteps.checkSuccesMessageLoginStep();
        loginSteps.logOutStep();
    }

    @Test
    public void passwordRecoveryTest(){
        homeSteps.checkNameSite("FASTTRACKIT");
        registerSteps.navigateToHomePage();
        loginSteps.navigateToLoginStep("andreea1988iusti2015@gmail.com", "1111");
loginSteps.checkErrorMessageForLostPassStep();
loginSteps.lostPasswordStep();
loginSteps.setEmailForLostPassStep("andreea1988iusti2015@gmail.com");
loginSteps.resetPassStep();
loginSteps.checkSuccesMessageForRecoveryTheLostPassStep();

    }
}
