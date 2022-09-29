package org.fasttrack.features.search;

import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void errorAlreadyRegisterTest(){
        registerSteps.getTitleSite();
registerSteps.navigateToHomePage();
registerSteps.navigateToAccountPageForRegister();
registerSteps.getErrorRegisterMessageStep();
    }
}
