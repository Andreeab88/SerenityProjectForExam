package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class CheckoutSteps extends BaseSteps{

@Step
public void completeCheckoutFormularLoggedIn(String firstName,String lastName){
    checkoutPage.setFirstNameCheckoutFormular(firstName);


        checkoutPage.setLastNameCheckoutFormular(lastName);

checkoutPage.clickOnBoxCountry();

        checkoutPage.clickForSearchCountry();

checkoutPage.findCountrytInGridAndOpen("Romania");


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
        String expected = "Thank you. Your order has been received.";
        String actual = checkoutPage.verifySuccesMessageReceivedOrder();
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
    checkoutPage.clickForLoginCheckout();
    checkoutPage.setEmailForLoginCheckout(USER_EMAIL);
    checkoutPage.setPasswordForLoginCheckout(USER_PASS);
    checkoutPage.clickRememberCredentialsButton();
    checkoutPage.clickLoginButtonForCheckout();

}
@Step
    public void verifyCheckoutPageWithNoProductsSteps(){
        homePage.clickOnHomeButton();
        homePage.clickOnCheckoutButton();
    }

}
