package org.fasttrack.features.search;

import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void RegisterTestFirstTime(){
        registerSteps.verifyTitleSite();
        registerSteps.navigateToHomePage();
        registerSteps.navigateToAccountPageForRegister("andreeaboboc@yahoo.com", "123456andreea123456");
        registerSteps.getErrorRegisterMessageStep();
    }

    @Test
    public void errorAlreadyRegisterTest(){
        registerSteps.verifyTitleSite();
registerSteps.navigateToHomePage();
registerSteps.navigateToAccountPageForRegister("andreea1988iusti2015@gmail.com", "123456andreea123456");
registerSteps.getErrorRegisterMessageStep();
    }
}
