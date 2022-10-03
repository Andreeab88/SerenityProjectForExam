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
        loginSteps.loginWithValidCredentialsStep("andreea1988iusti2015@gmail.com", "123456andreea123456");
        loginSteps.checkSuccesMessageLoginStep();
        homeSteps.goToHomeButton();
        searchSteps.searchProductNameStep();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCartStep();
        cartSteps.checkSuccessMessageSteps("Album");
        cartSteps.setQtyAndViewCartSteps("2");
        cartSteps.addProductInCartStep();
        homeSteps.goToCheckout();
        checkoutSteps.completeCheckoutFormularLoggedIn("Andreea","Boboc");
        wait(3);
        checkoutSteps.clickToPlaceOrderCheckout();

    }
    @Test
    public void completeCheckoutFormularWithoutLoggIn(){
        homeSteps.goToHomeButton();
        homeSteps.goToShop();
        cartSteps.addProduct1InCartSteps("Hoodie with Logo");
        cartSteps.addProduct1InCartSteps1("2");
        cartSteps.addProduct1InCartSteps2("Hoodie with Logo");
        cartSteps.checkSuccesMessageProducts1IsInCartSteps("Hoodie with Logo");
        cartSteps.addToCartProducts1Step();
        homeSteps.goToCheckout();
        checkoutSteps.completeCheckoutFormularLoggedIn("Andreea","Boboc");
checkoutSteps.setEmailCheckoutFormularLoggedIn("andreea1988iusti2015@gmail.com");
checkoutSteps.clickToPlaceOrderCheckout();

    }

    @Test
    public void loginOnCheckoutPageTest(){
        homeSteps.goToHomeButton();
        homeSteps.goToShop();
        cartSteps.addProduct1InCartSteps("Hoodie with Logo");
        cartSteps.addProduct1InCartSteps1("2");
        cartSteps.addProduct1InCartSteps2("Hoodie with Logo");
        cartSteps.checkSuccesMessageProducts1IsInCartSteps("Hoodie with Logo");
        cartSteps.addToCartProducts1Step();

        homeSteps.goToCheckout();
        checkoutSteps.verifyMessageLoginOnCheckoutPageSteps("Returning customer? Click here to login");
        checkoutSteps.loginOnCheckoutPageSteps();
    }


   @Test
    public void verifyCheckoutMessageWithNoProductTest() {
     checkoutSteps.verifyCheckoutPageWithNoProductsSteps();
      cartSteps.checkIfCheckoutIsAvailableWithCartEmpty();
            }
}