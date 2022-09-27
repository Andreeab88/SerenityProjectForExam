package org.fasttrack.features.search;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTestAndAfterLogOut(){
        registerSteps.navigateToHomePage();
        loginSteps.LoginStep();

        loginSteps.clickLoginButtonStep();
        loginSteps.succesMessageLoginStep();
        loginSteps.logOutStep();
    }
}
