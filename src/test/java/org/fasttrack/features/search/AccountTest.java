package org.fasttrack.features.search;

import org.junit.Test;

public class AccountTest extends BaseTest {
    @Test
    public void verifyMyAccountPageTitleTest() {
        accountSteps.verifyTextAccountPage();
       accountSteps.checkTitleTextFromMyAccountPage();
    }

}
