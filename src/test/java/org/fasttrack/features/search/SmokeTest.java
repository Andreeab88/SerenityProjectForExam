package org.fasttrack.features.search;

import org.junit.Test;

public class SmokeTest extends BaseTest {
    @Test
    public void goToHomepage(){
     homeSteps.goToHomeButton();
    }

    @Test
    public void goToMyAccount(){
        homeSteps.goToHomeButton();
        homeSteps.goToMyAccount();
    }
    @Test
    public void goToCheckout(){
        homeSteps.goToHomeButton();
        homeSteps.goToCheckout();
    }

    @Test
    public void goToShop(){
        homeSteps.goToHomeButton();
        homeSteps.goToShop();
    }

    @Test
    public void goToCart(){
        homeSteps.goToHomeButton();
        homeSteps.goToCart();
        waitABit(500);
    }

}
