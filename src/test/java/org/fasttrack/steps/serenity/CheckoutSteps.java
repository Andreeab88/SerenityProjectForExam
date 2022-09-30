package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class CheckoutSteps extends BaseSteps{

@Step
public void completeCheckoutFormularLoggedIn(){
    checkoutPage.setFirstNameCheckoutFormular("Andreea");
    checkoutPage.setLastNameCheckoutFormular("Boboc");
    checkoutPage.selectDropDownCountry();
    checkoutPage.setAdressCheckoutFormular("Iasi");
    checkoutPage.setCityCheckoutFormular("Iasi");
    checkoutPage.setPostcodeCheckoutFormular("765748");
    checkoutPage.setPhoneNumberCheckoutFormular("0711111111");
    checkoutPage.setEmailCheckoutFormular(USER_EMAIL);
    checkoutPage.clickPlaceOrderCheckout();
}
@Step
public void verifyTitlePageOfReceivedOrder(){
    String expected = "ORDER RECEIVED".toLowerCase();
    String actual = checkoutPage.verifyTitleReceivedOrder().toLowerCase();
    Assert.assertEquals(expected,actual);
}
    @Step
    public void verifySuccesMessageOfReceivedOrder(){
        String expected = "Thank you. Your order has been received.".toLowerCase();
        String actual = checkoutPage.verifySuccesMessageReceivedOrder().toLowerCase();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void verifyMessageLoginOnCheckoutPageSteps(String message){
    String expected = "Returning customer? Click here to login".toLowerCase();
    String actual = checkoutPage.verifyMessageNotLoginForCheckout().toLowerCase();
    Assert.assertEquals(expected,actual);
    }
@Step
public void loginOnCheckoutPageSteps(){
    checkoutPage.setEmailForLoginCheckout(USER_EMAIL);
    checkoutPage.setPasswordForLoginCheckout(USER_PASS);
    checkoutPage.clickRememberCredentialsButton();
    checkoutPage.clickLoginButtonForCheckout();

}
@Step
    public void verifyCheckoutPageWithNoProductsSteps(){
        homePage.open();
        homePage.clickOnCheckoutButton();
    }

}
