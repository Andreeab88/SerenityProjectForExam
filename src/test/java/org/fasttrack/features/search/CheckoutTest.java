package org.fasttrack.features.search;

import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void searchProductByPopularityTest() {
        homeSteps.checkNameSite("FASTTRACKIT");
        searchSteps.navigateToProductName();

    }

}