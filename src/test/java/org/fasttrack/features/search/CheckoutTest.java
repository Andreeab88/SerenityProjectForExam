package org.fasttrack.features.search;

import org.fasttrack.steps.serenity.HomeSteps;
import org.junit.Test;

import static org.fasttrack.utils.Constants.USER_NAME;
import static org.fasttrack.utils.Constants.USER_PASS;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutFormularLoggedIn(){
        homeSteps.goToHomeButton();
        homeSteps.goToMyAccount();
        loginSteps.loginWithValidCredentialsStep(USER_NAME, USER_PASS);
        loginSteps.checkSuccesMessageLoginStep();
        homeSteps.goToCheckout();
        checkoutSteps.completeCheckoutFormularLoggedIn();
        checkoutSteps.verifyTitlePageOfReceivedOrder();
        checkoutSteps.verifySuccesMessageOfReceivedOrder();
        loginSteps.logOutStep();
    }
    @Test
    public void completeCheckoutFormularWithoutLoggIn(){
        homeSteps.goToHomeButton();
        homeSteps.goToCheckout();
        checkoutSteps.completeCheckoutFormularLoggedIn();
        checkoutSteps.verifyTitlePageOfReceivedOrder();
        checkoutSteps.verifySuccesMessageOfReceivedOrder();
        loginSteps.logOutStep();
    }

    @Test
    public void loginOnCheckoutPageTest(){
        checkoutSteps.verifyMessageLoginOnCheckoutPageSteps("Returning customer? Click here to login");
        checkoutSteps.loginOnCheckoutPageSteps();
    }

   @Test
   public void takeTwoProductsAndGoToCheckoutTest(){
       homeSteps.goToShop();
       cartSteps.addProduct1InCartSteps("Polo");
       cartSteps.checkSuccesMessageProducts1IsInCartSteps("Polo");
       cartSteps.addToCartProducts1Step();

       cartSteps.navigateToShopPages();

       cartSteps.addProducts2InCartSteps("Sunglasses");
       cartSteps.checkSuccesMessageProducts2IsInCartSteps("Sunglasses");
       cartSteps.addToCartProduct2Steps();

       cartSteps.emptyCartSteps();
       cartSteps.checkSubtotalPriceStep();
       cartSteps.checkTotalPriceStep();
       cartSteps.clickOnProceedToCheckoutStep();
   }
   @Test
    public void verifyCheckoutMessageWithNoProductTest() {
     checkoutSteps.verifyCheckoutPageWithNoProductsSteps();
      cartSteps.checkIfCheckoutIsAvailableWithCartEmpty();
            }
}